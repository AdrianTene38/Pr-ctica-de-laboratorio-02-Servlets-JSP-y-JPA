package ec.edu.ups.jpa;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import ec.edu.ups.dao.GenericDAO;
import ec.edu.ups.entidades.Persona;
import ec.edu.ups.entidades.Telefono;

public class JPAGenericDAO<T, ID> implements GenericDAO<T, ID> {
	String cadena="";
	private Class<T> persistentClass;
	protected EntityManager em;

	public JPAGenericDAO(Class<T> persistentClass) {
		// TODO Auto-generated constructor stub
		this.persistentClass = persistentClass;
		this.em = Persistence.createEntityManagerFactory("jpa").createEntityManager();
	}
	@Override
	public void create(T entity) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		try {
			em.persist(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(">>>> ERROR:JPAGenericDAO:create " + e);
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
		}	

	}

	@Override
	public T read(ID cedula) {
		// TODO Auto-generated method stub
		return em.find(persistentClass, cedula);
	}

	@Override
	public void update(T entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteByID(ID id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> find(String[]atributes,String []values) {
		// Se crea un criterio de consulta
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(this.persistentClass);
		// Se establece la clausula FROM
		Root<T> root = criteriaQuery.from(this.persistentClass);
		// Se establece la clausula SELECT
		criteriaQuery.select(root); // criteriaQuery.multiselect(root.get(atr))
		// // Se configuran los predicados,
		// combinados por AND
		Predicate predicate = criteriaBuilder.conjunction();
		for (int i = 0; i < atributes.length; i++) {
			Predicate sig = criteriaBuilder.like(root.get(atributes[i]).as(String.class), values[i]);
			// Predicate sig =
			// criteriaBuilder.like(root.get(attributes[i]).as(String.class),
			// values[i]);
			predicate = criteriaBuilder.and(predicate, sig);
		}
		// Se establece el WHERE
		criteriaQuery.where(predicate);
		// Se establece el orden
		// crea
		// el
		// resultad	
		// Se realiza la query
		Query query = em.createQuery(criteriaQuery);
		return query.getResultList();
	}
	@Override
	public String logueo(String correo, String contra) {
		// TODO Auto-generated method stub


		cadena = ("SELECT c FROM usuario u WHERE u.correo = '" + correo + "' and u.contra = '" + contra + "'") ;
		List<Persona> res = (List<Persona>) em.createQuery(cadena, Persona.class).getResultList();
		System.out.println(res);
		String cadena1="äsdasdasd"; 

		if (cadena1 !=""){
			// usuarioactual = new Usuario(resultado.getInt("idusuario"),usuario,resultado.getString("titular"),resultado.getString("identificacion"),resultado.getString("tipo_usuario"));
			Persona usuarioactual = Persona.getInstance();
			// System.out.println("ID: "+resultado.getString("idusuario"));
			//cadena=resultado.getString("usu_cedula");                                  
			//usuarioactual.getCorreo();
			//usuarioactual.setCedula(resultado.getString("usu_cedula"));
			System.out.println(cadena);
			return cadena1;
		}else {
			cadena="";
			return cadena;

		}

	}
}
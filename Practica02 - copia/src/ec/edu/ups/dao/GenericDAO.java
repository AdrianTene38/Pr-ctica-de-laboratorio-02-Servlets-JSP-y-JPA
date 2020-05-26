package ec.edu.ups.dao;

import java.util.List;

import ec.edu.ups.entidades.Telefono;

public interface GenericDAO<T, ID> {
	public void create(T entity);

	public T read(ID cedula);

	public void update(T entity);

	public void delete(T entity);

	public void deleteByID(ID id);

	public List<T> findAll();
	public String logueo(String correo, String contra);

	public List<T> find(String[] atributes, String[] values);

}

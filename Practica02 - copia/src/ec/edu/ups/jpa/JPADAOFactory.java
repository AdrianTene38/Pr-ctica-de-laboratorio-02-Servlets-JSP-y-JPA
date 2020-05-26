package ec.edu.ups.jpa;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.PersonaDAO;
import ec.edu.ups.dao.TelefonoDAO;

public class JPADAOFactory extends DAOFactory{
	@Override
	public PersonaDAO getPersonaDAO() {
		return new JPAPersonaDAO();
	}

	@Override
	public TelefonoDAO getTelefonoDAO() {
		// TODO Auto-generated method stub
		return null;
	}
}

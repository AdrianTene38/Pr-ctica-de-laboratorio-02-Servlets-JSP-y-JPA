package ec.edu.ups.controlador;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.PersonaDAO;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.entidades.Persona;


/**
 * Servlet implementation class ControlaUsuario
 */
@WebServlet("/ControlaUsuario")
public class ControlaUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private PersonaDAO usuario;
	private TelefonoDAO telefono;
	private Persona persona;
	///EjemploPersonaWebJPA/CrearPersonaController
	/**
	 * @see HttpServlet#HttpServlet()
	 */


	public ControlaUsuario() {
		super();
		usuario = DAOFactory.getFactory().getPersonaDAO();
		persona = new Persona();	// TODO Auto-generated constructor stub
	
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	
	}	
		
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		persona = new Persona(request.getParameter("cedula"),request.getParameter("nombre"),request.getParameter("apellido"),request.getParameter("correo"),request.getParameter("contra") );
		usuario = DAOFactory.getFactory().getPersonaDAO();
		usuario.create(persona);	
		getServletContext().getRequestDispatcher("/Publica/Publica.html").forward(request, response);
	}
}
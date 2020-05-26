package ec.edu.ups.controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.entidades.Persona;
import ec.edu.ups.entidades.Telefono;



/**
 * Servlet implementation class ListarTelefono
 */
@WebServlet("/ListarTelefono")
public class ListarTelefono extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private TelefonoDAO telefonoDao;
	    private Telefono telefono;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarTelefono() {
        super();
        // TODO Auto-generated constructor stub
        telefonoDao = DAOFactory.getFactory().getTelefonoDAO();
    	telefono = new Telefono();
    
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		javax.servlet.RequestDispatcher dispatcher = request.getRequestDispatcher("/Publica/ListaTelefono.jsp");
		TelefonoDAO telefonito = DAOFactory.getFactory().getTelefonoDAO();
		Persona usuarioactual = Persona.getInstance();
		Telefono t = Telefono.getInstance();
		String cedula = usuarioactual.getCedula();
		String []atributes = {"cedula"};
		String []values= {"0105609127"};
		List<Telefono>prueba= telefonito.find(atributes, values);
		System.out.println("tama;o"+prueba.size());
		System.out.println();
		request.setAttribute("lista45", prueba);
		dispatcher.forward(request, response);
		System.out.println("codigo del telefono:"+ t.getCodigo());
	}
}
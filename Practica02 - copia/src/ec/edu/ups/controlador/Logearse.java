package ec.edu.ups.controlador;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.PersonaDAO;


/**
 * Servlet implementation class Logearse
 */
@WebServlet("/Logearse")
public class Logearse extends HttpServlet {
	private static final long serialVersionUID = 1L;
    PersonaDAO p;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Logearse() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("Publica/Index.html").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("correo");
		String password = request.getParameter("contra");
		
			if (p.logueo(username, password) != "") {
				request.getSession().setAttribute("user", p.logueo(username, password));
				response.sendRedirect(request.getContextPath() + "/Privada/Privada.html");
			} else {
				request.setAttribute("error", "Unknown login, try again");
				doGet(request, response);
			}
		
	}
}



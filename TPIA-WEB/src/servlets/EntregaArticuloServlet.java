package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EntregaArticuloServlet")
public class EntregaArticuloServlet extends HttpServlet  {

	private static final long serialVersionUID = 1L;
	
    public EntregaArticuloServlet() {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("AGUANTE JQUERY VIEJA NO ME IMPORTA NADA: " + request.getParameter("opcion"));
		
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		
		response.getWriter().write("POR FAVOR FUNCIONA");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

}

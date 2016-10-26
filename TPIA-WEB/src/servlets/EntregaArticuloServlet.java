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
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		//System.out.println("AGUANTE JQUERY VIEJA NO ME IMPORTA NADA: " + request.getParameter("opcion"));
		//response.getWriter().write("POR FAVOR FUNCIONA");
		
		//Hardcodeo un string doblemente parseado de Solicitudes, por row y columnas. Deberia buscarse en la base y armarse aca. O aprender a usar JACKSON
		String solicitudesHardcore = "G12JO5I1;24/08/2016-G12I95TA;11/09/2016-G129IT15;17/10/2016";
		response.getWriter().write(solicitudesHardcore);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

}

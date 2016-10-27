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
		
		//Hardcodeo un string doblemente parseado de Solicitudes, por row y columnas. Deberia buscarse en la base y armarse aca
		if (request.getParameter("opcion").equalsIgnoreCase("obtSolPen")){
			//Parametros: Codigo;Fecha
			String solicitudesHardcore = "G12JO5I1;24/08/2016-G12I95TA;11/09/2016-G129IT15;17/10/2016";
			response.getWriter().write(solicitudesHardcore);
		}
		
		//Hardcodeo un string doblemente parseado de Articulos, por row y columnas. Deberia buscarse en la base y armarse aca
		if (request.getParameter("opcion").equalsIgnoreCase("obtArticulos")){
			//Obtengo la solicitud a buscar
			String solicitudABuscar = request.getParameter("solicitudBuscada");
			
			//Aca se armaria una unica respuesta desde la base, por ser hardcodeado comparo con G12JO5I1
			if (solicitudABuscar.equalsIgnoreCase("G12JO5I1")){
				//Parametros: Codigo;Nombre;Descripcion;Cantidad;Cumplimiento
				String articulosHardcore = "G12890471;Aire Acondicionado Split WBC 12B-13B 2645 F/C;4 modos de operación diferentes: Frío, deshumidificación, ventilación y calor;2;Cumplido-G1268671;Freezer Horizontal Eternity M210;202 Lt;8;Stock Insuficiente";
				response.getWriter().write(articulosHardcore);
			}
			
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

}
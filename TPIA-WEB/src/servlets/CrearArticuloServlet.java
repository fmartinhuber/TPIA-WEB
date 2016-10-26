package servlets;

import java.io.IOException;
import java.rmi.NotBoundException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CrearArticuloServlet")
public class CrearArticuloServlet extends HttpServlet  {

	private static final long serialVersionUID = 1L;
	
    public CrearArticuloServlet() {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("metodo: " +request.getMethod());
		System.out.println("metodo: " +request.getParameter("metodo"));
		
		try{
			if(request.getParameter("metodo").equalsIgnoreCase("crearArticulo")){
				crearArticulo(request, response);
			}else if(request.getParameter("metodo").equalsIgnoreCase("nuevoMetodo")){
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

	private void crearArticulo(HttpServletRequest request, HttpServletResponse response) throws NotBoundException, IOException{

		try{
			
			
			
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}

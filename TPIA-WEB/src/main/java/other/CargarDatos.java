package other;

import bean.*;

public class CargarDatos {

	private static CargarDatos instancia;
	
	public static CargarDatos getInstancia(){
		if(instancia==null)
			instancia = new CargarDatos();
		return instancia;
	}
	
	public void cargaDeDatos(){
		
		// Alta de Articulos Random
				
		//ArticuloBean articulo = new ArticuloBean(nombre, codigo, descripcion, marca, precio, foto, origen, tipo, stockActual, stockSolicitado)		
		//MuebleBean mueble = new MuebleBean(nombre, codigo, descripcion, marca, precio, foto, origen, tipo, stockActual, stockSolicitado, material)

		//ArticuloBean articulo01 = new ArticuloBean("articulo01", "codigo01", "descripcion01", "marca01", 1000, "1", "origen01", "MUE", 10000, 10000);
		//articulo01.persistArticulo();
		
		MuebleBean muebles01 = new MuebleBean("mueble01", "codigo01", "descripcion01", "marca01", 1000, "1", "origen01", "MUE", 1000,1000, "material01");
		MuebleBean muebles02 = new MuebleBean("mueble02", "codigo02", "descripcion02", "marca02", 2000, "2", "origen02", "MUE", 2000,2000, "material02");
		
		muebles01.persistArticulo();
		muebles02.persistArticulo();
		
	}
	
}

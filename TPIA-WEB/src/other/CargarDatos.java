package other;

import java.util.ArrayList;
import java.util.List;

import bean.ArticuloBean;

public class CargarDatos {

	private static CargarDatos instancia;
	
	public static CargarDatos getInstancia(){
		if(instancia==null)
			instancia = new CargarDatos();
		return instancia;
	}
	
	public void cargaDeDatos(){
		
		// Alta de Articulos Random
		
		//List<ArticuloBean> articulos = new ArrayList<>();
		
		//ArticuloBean articulo001 = new ArticuloBean(nombre, codigo, descripcion, marca, precio, foto, origen, stockActual, stockSolicitado);
		
//		ArticuloBean articulo001 = new ArticuloBean("nombre01", "codigo01", "descripcion01", "marca01", 1, "foto01", "origen01", 1, 1);
//		ArticuloBean articulo002 = new ArticuloBean("nombre02", "codigo02", "descripcion02", "marca02", 2, "foto02", "origen02", 2, 2);
//		
//		articulo001.persistArticulo();
//		articulo002.persistArticulo();
		
	}
	
}

package test;

import java.util.List;

import bean.*;
import controler.*;
import other.*;

public class TestRama {

	public static void main(String[] args) {

		/* 
 
		 * CARGA DE DATOS
		 * 
		System.out.println("Carga de Datos");		
		CargarDatos.getInstancia().cargaDeDatos();		
		System.out.println("Carga de Datos finalizada");
		*/
		
		
		
		/*
		 * 
		  
		 LISTAR MUEBLES
		 
<<<<<<< HEAD
		DepositoControlador dc = new DepositoControlador();
		
		List<MuebleBean> muebles = dc.listarMuebles();
		
		System.out.println();
		System.out.println("Listar los muebles");
		System.out.println();
		
		for(MuebleBean m : muebles){
			System.out.println("Nombre:" +m.getNombre());
		}
		
		
		*/
		
		
		/*
		 * CREAR ARTICULO
		 * 
		 * 
		 */
		
		ArticuloBean newArticulo = new ArticuloBean();
		
		newArticulo.setCodigo("codigo03");
		newArticulo.setDescripcion("descripcion03");
		newArticulo.setFoto("foto03");
		newArticulo.setMarca("marca03");
		newArticulo.setNombre("nombre03");
		newArticulo.setOrigen("origen03");
		newArticulo.setPrecio(3000);
		newArticulo.setStockActual(3000);
		newArticulo.setStockSolicitado(3000);
		newArticulo.setTipo("MUE");
		
		DepositoControlador.getInstancia().crearArticulo(newArticulo);
		DepositoControlador dc = new DepositoControlador();
		
		List<MuebleBean> muebles = dc.listarMuebles();
		
		System.out.println();
		System.out.println("Listar los muebles");
		System.out.println();
		
		for(MuebleBean m : muebles){
			System.out.println("Nombre:" +m.getNombre());
		}
		
		
		
		
		
		/*
		 * CREAR ARTICULO
		 * 
		 * 
		 */
		
//		ArticuloBean newArticulo = new ArticuloBean();
//		
//		newArticulo.setCodigo("codigo03");
//		newArticulo.setDescripcion("descripcion03");
//		newArticulo.setFoto("foto03");
//		newArticulo.setMarca("marca03");
//		newArticulo.setNombre("nombre03");
//		newArticulo.setOrigen("origen03");
//		newArticulo.setPrecio(3000);
//		newArticulo.setStockActual(3000);
//		newArticulo.setStockSolicitado(3000);
//		newArticulo.setTipo("MUE");
//		
//		DepositoControlador.getInstancia().crearArticulo(newArticulo);
		
	}

}

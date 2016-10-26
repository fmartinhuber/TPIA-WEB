package controler;

import java.util.List;

import bean.*;
import dao.*;

//Prueba Daro 1er Commit

/**
 * Desde este controlador se deberian de llamar a todos los servicios implementados.
 *  lskjdaf
 * @author Martin
 *
 */
public class DepositoControlador {

	public static DepositoControlador instancia;
	
	public static DepositoControlador getInstancia(){
		if(instancia == null)
			return new DepositoControlador();
		return instancia;
	}
	
	public DepositoControlador(){

	}
	
	public List <SolicitudArticuloBean> obtenerArticuloSolicitadoPendiente(){
		return SolicitudArticuloDao.getInstancia().obtenerArticulosPendientes();
	}
	
	
	public void crearArticulo(){
		
		//ArticuloBean articulo = new ArticuloBean();
		
		
		
	}
	
}

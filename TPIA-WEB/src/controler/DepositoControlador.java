package controler;

import java.util.List;

import bean.ArticuloSolicitadoBean;

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
	
	public List <ArticuloSolicitadoBean> obtenerArticuloSolicitadoPendiente(){
		return null;
	}
}

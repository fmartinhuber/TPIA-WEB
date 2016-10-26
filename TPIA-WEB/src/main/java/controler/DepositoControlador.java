package controler;

import java.util.List;

import bean.SolicitudArticuloBean;
import dao.SolicitudArticuloDao;

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
}

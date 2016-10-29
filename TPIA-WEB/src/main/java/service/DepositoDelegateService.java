package service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import bean.*;



@Service
public class DepositoDelegateService {
	
	static Logger logger = LoggerFactory.getLogger(DepositoDelegateService.class);
	
	private IDepositoServiceFacade depositoServiceFacade;
	
	public void crearArticulo(ArticuloBean2 articulo){
		logger.info("REMOTE: Creando Articulo {}", articulo.getDescripcion());
		depositoServiceFacade.crearArticulo(articulo);		
	}
	
	public List<ArticuloBean2> listarArticulos() {
		logger.info("REMOTE: Obteniendo listado de todos los Articulos");
		return depositoServiceFacade.listarArticulos();
	}
	

}

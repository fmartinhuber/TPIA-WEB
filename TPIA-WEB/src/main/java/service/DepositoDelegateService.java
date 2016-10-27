package service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import bean.ArticuloBean;



@Service
public class DepositoDelegateService {
	
	static Logger logger = LoggerFactory.getLogger(DepositoDelegateService.class);
	
	
//	public void crearArticulo(Articulo articulo) {
//		logger.info("REMOTE: Creando Articulo {}", articulo.getDescripcion());
//		depositoServiceFacade.crearArticulo(articulo);
//	}
	
	public void crearArticulo(ArticuloBean articulo){
		logger.info("REMOTE: Creando Articulo {}", articulo.getDescripcion());
		
	}
	

}

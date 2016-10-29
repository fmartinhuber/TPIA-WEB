package service;

import javax.ejb.Local;

import bean.ArticuloBean2;

@Local
public interface IIntegrationServiceFacade {

	public void notificarNuevoArticulo(ArticuloBean2 articulo);
	
}

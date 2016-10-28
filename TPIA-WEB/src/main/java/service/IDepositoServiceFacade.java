package service;

import java.util.List;

import bean.*;

public interface IDepositoServiceFacade {

	public void crearArticulo(ArticuloBean2 articulo);
	
	public List<ArticuloBean2> listarArticulos();
	
}

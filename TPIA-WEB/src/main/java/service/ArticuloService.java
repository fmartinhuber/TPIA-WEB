package service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import bean.ArticuloBean2;
import dao.IArticuloDao2;

@Stateless
public class ArticuloService implements IArticuloService {

	@EJB
	IArticuloDao2 articuloDAO;
	
	@EJB
	IIntegrationServiceFacade integrationService;
	
	
	@Override
	public void persist(ArticuloBean2 articulo) {
		articuloDAO.persist(articulo);
	}

	@Override
	public void update(ArticuloBean2 articulo) {
		articuloDAO.update(articulo);
	}

	@Override
	public List<ArticuloBean2> listarArticulos() {
		return articuloDAO.listarArticulos();
	}

	@Override
	public ArticuloBean2 obtenerArticuloPorID(long id) {
		return articuloDAO.obtenerArticuloPorID(id);
	}

	@Override
	public ArticuloBean2 obtenerArticuloPorNombre(String nombre) {
		return articuloDAO.obtenerArticuloPorNombre(nombre);
	}

	
	
}

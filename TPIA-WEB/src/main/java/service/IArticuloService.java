package service;

import java.util.List;

import javax.ejb.Local;

import bean.ArticuloBean2;

@Local
public interface IArticuloService {

	public void persist(ArticuloBean2 articulo);
	
	public void update(ArticuloBean2 articulo);

	public List<ArticuloBean2> listarArticulos();

	public ArticuloBean2 obtenerArticuloPorID(long id);

	public ArticuloBean2 obtenerArticuloPorNombre(String nombre);

}

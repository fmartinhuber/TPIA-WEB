package dao;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import bean.ArticuloBean2;

@Local
public interface IArticuloDao2 {

	public void persist(ArticuloBean2 articulo);
	
	public void remove(ArticuloBean2 articulo);
	
	public void update(ArticuloBean2 articulo);
	
	public ArticuloBean2 obtenerArticuloPorID(long id);
	
	public List<ArticuloBean2> listarArticulosPorFechas(Date start, Date end);
	
	public ArticuloBean2 obtenerArticuloPorNombre(String nombre);
	
	public List<ArticuloBean2> listarArticulos();
	
}

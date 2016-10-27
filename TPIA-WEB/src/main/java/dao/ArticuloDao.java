package dao;

import java.util.List;

import org.hibernate.Session;

import bean.ArticuloBean;
import hbt.HibernateUtil;

public class ArticuloDao extends HibernateDao{

	
	public static ArticuloDao instancia;
	
	private ArticuloDao(){}
	
	public static ArticuloDao getInstancia(){
		if(instancia == null)
			instancia = new ArticuloDao();
		return instancia;
	}
	
	
	public List<ArticuloBean> listarArticulos(){
		Session s = HibernateUtil.getSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<ArticuloBean> articulos = (List<ArticuloBean>)s.createQuery("from Articulo").list();
		s.close();
		return articulos;
	}
	
	
	public int obtenerMaximoIdArticulo() {
		Session s = HibernateUtil.getSessionFactory().openSession();
		int resultado = 1;
		resultado = (int) s.createQuery("select max(a.idArticulo) from Articulo a").uniqueResult();
		s.clear();
		return resultado+1;
	}	
	
	public ArticuloBean buscarArticuloPorCodigo(String codigo){
		
		Session s = HibernateUtil.getSessionFactory().openSession();
		org.hibernate.Query query = s.createQuery("from ArticuloBean a where p.codigo = :codigoArticulo");
		query.setParameter("codigoArticulo", codigo);
		ArticuloBean articulo = (ArticuloBean) query.uniqueResult();
		s.close();
		return articulo;
		
	}


	
}
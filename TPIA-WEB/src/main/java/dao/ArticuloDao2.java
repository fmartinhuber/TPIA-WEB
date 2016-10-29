package dao;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import bean.ArticuloBean2;

@Stateless
public class ArticuloDao2 implements IArticuloDao2 {

	@PersistenceContext
	private EntityManager em;
	
	
	
	public ArticuloBean2 obtenerArticuloPorID(long id){
		
		return (ArticuloBean2)em.createQuery("SELECT a FROM ArticuloBean2 a " + "WHERE a.codigo = :id").setParameter("id", id).getSingleResult();
	}
	
	@SuppressWarnings("unchecked")
	public List<ArticuloBean2> listarArticulosPorFechas(Date start, Date end) {
		return em.createQuery(
			     "SELECT a FROM ArticuloBean2 a "
			      + "WHERE a.fecha between :start and :end"
			      + " =:start").setParameter("start", start).setParameter("end", end).getResultList();
	}
	
	public ArticuloBean2 obtenerArticuloPorNombre(String nombre) {
		return (ArticuloBean2) em.createQuery(
			      "SELECT a FROM ArticuloBean2 a WHERE a.nombre =:nombre").setParameter("nombre", nombre).setMaxResults(1).getSingleResult();
	}

		
	@SuppressWarnings("unchecked")
	public List<ArticuloBean2> listarArticulos() {
		return em.createQuery("SELECT a FROM ArticuloBean2 a").getResultList();
	}

	@Override
	public void persist(ArticuloBean2 articulo) {
		em.persist(articulo);
	}

	@Override
	public void remove(ArticuloBean2 articulo) {
		em.remove(articulo);
	}

	@Override
	public void update(ArticuloBean2 articulo) {
		em.merge(articulo);		
	}

	
}



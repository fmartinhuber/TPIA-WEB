package hbt;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import bean.*;
import dao.ArticuloDao;

public class HibernateUtil{
	
	private static HibernateUtil instancia;
	private EntityManagerFactory emfactory;
	
	public static HibernateUtil getInstancia(){
		if(instancia == null)
			instancia = new HibernateUtil();
		return instancia;
	}
	
	public HibernateUtil(){
		emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
	}
	
    public EntityManager getSessionFactory()
    {
    	return emfactory.createEntityManager();
    }
}
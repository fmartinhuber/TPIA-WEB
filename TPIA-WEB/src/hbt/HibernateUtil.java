package hbt;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import bean.*;

public class HibernateUtil{
    private static final SessionFactory sessionFactory;
    static{
        try{
        	 AnnotationConfiguration config = new AnnotationConfiguration();
        	 
             config.addAnnotatedClass(ArticuloBean.class);
             config.addAnnotatedClass(ItemRecepcionCompra.class);
             config.addAnnotatedClass(ItemSolicitadoArticuloBean.class);
             config.addAnnotatedClass(ItemSolicitudCompraBean.class);
             config.addAnnotatedClass(MovimientoStockBean.class);
             config.addAnnotatedClass(RecepcionCompraBean.class);
             config.addAnnotatedClass(SolicitudArticuloBean.class);
             config.addAnnotatedClass(SolicitudCompraBean.class);             
             
             
             sessionFactory = config.buildSessionFactory();
        }
        catch (Throwable ex)
        {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
}
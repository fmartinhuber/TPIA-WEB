package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hbt.HibernateUtil;
import other.CargarDatos;

public class DepositoDao extends HibernateDao{

	private static DepositoDao instancia = null;
	private static SessionFactory sf = null;

	public static DepositoDao getInstancia(){
		if(instancia == null){
//			sf = HibernateUtil.getSessionFactory();
			instancia = new DepositoDao();
		} 
		return instancia;
	}
	

	
	
	/**
	 * Por favor no borrar. Sirve para cargar las tablas en la BD
	 */
	public void prueba(){
//		Session session = sf.openSession();
//		session.beginTransaction();
		CargarDatos.getInstancia().cargaDeDatos();
		System.out.println("Metodo de prueba utilizado.");
	}
	
}

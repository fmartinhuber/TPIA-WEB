package hbt;

import javax.persistence.Query;

public interface EntityManager {

	/**
	 * inserción
	 * @param entity
	 */
	public void persist(Object entity); 
	/**
	 * actualización
	 * @param entity
	 * @return
	 */
	public <T> T merge(T entity); // 
	/**
	 * eliminación
	 * @param entity
	 */
	public void remove(Object entity); // 
	/**
	 * selección por PK
	 * @param entityName
	 * @param primaryKey
	 * @return
	 */
	public Object find(String entityName, Object primaryKey); 
	public <T> T find(Class entityClass, Object primaryKey);
	/**
	 * sincronizar con BD
	 */
	public void flush();
	/**
	 * crear una consulta de selección
	 * @param ejbqlString
	 * @return
	 */
	public Query createQuery(String ejbqlString);
	/**
	 *  crear una consulta de selección por nombre
	 * @param name
	 * @return
	 */
	public Query createNamedQuery(String name);
	/**
	 * crear una consulta de selección nativa
	 * @param sqlString
	 * @return
	 */
	public Query createNativeQuery(String sqlString);
	public void refresh(Object entity);
}

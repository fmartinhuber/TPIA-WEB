package other;

import dao.DepositoDao;

/*Daro: Ejecuta este main para cargar todos los datos en la base. Acordate de poner hibernate.properties en CREATE-DROP*/

public class InsertBaseDeDatos {
	
	public static void main(String[] args) {

		// Metodo para limpiar la base
		DepositoDao.getInstancia().prueba();

		
		
		// Carga de objetos para persistir en la base

	}
}

package test;

import other.CargarDatos;

public class RamaMain {

	public static void main(String[] args) {

		System.out.println("Carga de Datos");
		
		CargarDatos.getInstancia().cargaDeDatos();
		
		System.out.println("Carga de Datos finalizada");
		
	}

}

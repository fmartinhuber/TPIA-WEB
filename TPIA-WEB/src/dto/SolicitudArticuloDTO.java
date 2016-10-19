package dto;

import java.io.Serializable;
import java.util.ArrayList;

public class SolicitudArticuloDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private ArrayList<ArticuloDTO> articulos;
	private boolean cumplimiento;
	
	public SolicitudArticuloDTO(ArrayList<ArticuloDTO> articulos, boolean cumplimiento) {
		super();
		this.articulos = articulos;
		this.cumplimiento = cumplimiento;
	}
	
	public SolicitudArticuloDTO() {
		
	}

	public ArrayList<ArticuloDTO> getArticulos() {
		return articulos;
	}

	public void setArticulos(ArrayList<ArticuloDTO> articulos) {
		this.articulos = articulos;
	}

	public boolean isCumplimiento() {
		return cumplimiento;
	}

	public void setCumplimiento(boolean cumplimiento) {
		this.cumplimiento = cumplimiento;
	}
	
}

package dto;

import java.io.Serializable;
import java.util.ArrayList;

public class SolicitudCompraDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private ArrayList<ArticuloDTO> articulos;

	public SolicitudCompraDTO(ArrayList<ArticuloDTO> articulos) {
		super();
		this.articulos = articulos;
	}
	
	public SolicitudCompraDTO() {
		
	}

	public ArrayList<ArticuloDTO> getArticulos() {
		return articulos;
	}

	public void setArticulos(ArrayList<ArticuloDTO> articulos) {
		this.articulos = articulos;
	}
	
}

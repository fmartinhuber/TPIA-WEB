package dto;

import java.io.Serializable;

public class CompraDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private SolicitudCompraDTO solicitudCompra;

	public CompraDTO(SolicitudCompraDTO solicitudCompra) {
		super();
		this.solicitudCompra = solicitudCompra;
	}
	
	public CompraDTO() {
		
	}

	public SolicitudCompraDTO getSolicitudCompra() {
		return solicitudCompra;
	}

	public void setSolicitudCompra(SolicitudCompraDTO solicitudCompra) {
		this.solicitudCompra = solicitudCompra;
	}
	
}

package bean;

import java.util.List;

import javax.persistence.*;

//Daro: Este Bean relaciona el articulo con la cantidad solicitada

public class DetalleSolicitadoBean {
	@Id
	private Integer idArticuloSolicitado;
	@OneToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="idArticuloSolicitado")
	private ArticuloBean articulo;
	private Integer cantidad;
	
	public DetalleSolicitadoBean(Integer idArticuloSolicitado, ArticuloBean articulo, Integer cantidad) {
		super();
		this.idArticuloSolicitado = idArticuloSolicitado;
		this.articulo = articulo;
		this.cantidad = cantidad;
	}
	
	public DetalleSolicitadoBean() {
		
	}
	
	

	public Integer getIdArticuloSolicitado() {
		return idArticuloSolicitado;
	}

	public void setIdArticuloSolicitado(Integer idArticuloSolicitado) {
		this.idArticuloSolicitado = idArticuloSolicitado;
	}

	public ArticuloBean getArticulo() {
		return articulo;
	}

	public void setArticulo(ArticuloBean articulo) {
		this.articulo = articulo;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
}

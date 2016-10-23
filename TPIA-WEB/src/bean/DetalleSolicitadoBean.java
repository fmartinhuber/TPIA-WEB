package bean;

import javax.persistence.*;

//Daro: Este Bean relaciona el articulo con la cantidad solicitada

@Entity
@Table (name="DetalleSolicitado")
public class DetalleSolicitadoBean {
	@Id
	private Integer idDetalleSolicitado;
	@OneToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="idDetalleSolicitado")
	private ArticuloBean articulo;
	private Integer cantidad;
		
	

	public DetalleSolicitadoBean(Integer idDetalleSolicitado, ArticuloBean articulo, Integer cantidad) {
		super();
		this.idDetalleSolicitado = idDetalleSolicitado;
		this.articulo = articulo;
		this.cantidad = cantidad;
	}

	public DetalleSolicitadoBean() {
		
	}
	
	

	public Integer getIdDetalleSolicitado() {
		return idDetalleSolicitado;
	}

	public void setIdDetalleSolicitado(Integer idDetalleSolicitado) {
		this.idDetalleSolicitado = idDetalleSolicitado;
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

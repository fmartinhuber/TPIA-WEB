package bean;

import javax.persistence.*;

@Entity
public class RecepcionCompraBean {
	@Id
	private Integer idCompra;
	@OneToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="codigo")
	private SolicitudCompraBean solicitudCompra;
	
	public RecepcionCompraBean(Integer idCompra, SolicitudCompraBean solicitudCompra) {
		this.idCompra = idCompra;
		this.solicitudCompra = solicitudCompra;
	}
	
	public RecepcionCompraBean() {

	}
	
	public Integer getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(Integer idCompra) {
		this.idCompra = idCompra;
	}
	public SolicitudCompraBean getSolicitudCompra() {
		return solicitudCompra;
	}
	public void setSolicitudCompra(SolicitudCompraBean solicitudCompra) {
		this.solicitudCompra = solicitudCompra;
	}
	
	
	
}

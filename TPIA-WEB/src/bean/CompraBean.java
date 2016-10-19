package bean;

import javax.persistence.*;

@Entity
public class CompraBean {
	@Id
	@Column(name="codigoCompra")
	private Integer idCompra;
	@OneToOne
	@JoinColumn(name="codigo")
	private SolicitudCompraBean solicitudCompra;
	
	
	
	public CompraBean(Integer idCompra, SolicitudCompraBean solicitudCompra) {
		super();
		this.idCompra = idCompra;
		this.solicitudCompra = solicitudCompra;
	}
	
	public CompraBean() {
		
	}

	public Integer getidCompra() {
		return idCompra;
	}

	public void setId(Integer idCompra) {
		this.idCompra = idCompra;
	}

	public SolicitudCompraBean getSolicitudCompra() {
		return solicitudCompra;
	}

	public void setSolicitudCompra(SolicitudCompraBean solicitudCompra) {
		this.solicitudCompra = solicitudCompra;
	}
	
}

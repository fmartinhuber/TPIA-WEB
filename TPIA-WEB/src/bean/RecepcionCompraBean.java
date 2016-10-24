package bean;

import javax.persistence.*;

@Entity
@Table (name="RecepcionCompra")
public class RecepcionCompraBean {
	@Id
	private Integer idCompra;
	private String codigo; //Este atributo identifica univocamente al objeto, el id lo manejamos para nuestra base
	@OneToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="codigo")
	private SolicitudCompraBean solicitudCompra;
	

	
	public RecepcionCompraBean(Integer idCompra, String codigo, SolicitudCompraBean solicitudCompra) {
		super();
		this.idCompra = idCompra;
		this.codigo = codigo;
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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
}

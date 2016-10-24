package bean;

import javax.persistence.*;

@Entity
@Table (name="RecepcionCompra")
public class RecepcionCompraBean {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idRecepcionCompra;
	private String codigo; //Este atributo identifica univocamente al objeto, el id lo manejamos para nuestra base
	@OneToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="idSolicitudCompra")
	private SolicitudCompraBean solicitudCompra;
	


	public RecepcionCompraBean(String codigo, SolicitudCompraBean solicitudCompra) {
		super();
		this.codigo = codigo;
		this.solicitudCompra = solicitudCompra;
	}

	public RecepcionCompraBean() {

	}
	
	
	
	public Integer getIdRecepcionCompra() {
		return idRecepcionCompra;
	}

	public void setIdRecepcionCompra(Integer idRecepcionCompra) {
		this.idRecepcionCompra = idRecepcionCompra;
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

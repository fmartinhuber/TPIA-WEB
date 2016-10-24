package bean;

import java.util.*;

import javax.persistence.*;

@Entity
@Table (name="SolicitudCompra")
public class SolicitudCompraBean {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idSolicitudCompra;
	private String codigo; //Este atributo identifica univocamente al objeto, el id lo manejamos para nuestra base
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idSolCompra")
	private List<SolicitudArticuloBean> solicitudesArticulos;
	private Boolean pendiente; // (Recien enviada a fabrica = FALSE - Devuelta por fabrica = TRUE)
	
	

	public SolicitudCompraBean(String codigo, List<SolicitudArticuloBean> solicitudesArticulos, Boolean pendiente) {
		super();
		this.codigo = codigo;
		this.solicitudesArticulos = solicitudesArticulos;
		this.pendiente = pendiente;
	}
	
	public SolicitudCompraBean() {

	}
	
	

	public Integer getIdSolicitudCompra() {
		return idSolicitudCompra;
	}

	public void setIdSolicitudCompra(Integer idSolicitudCompra) {
		this.idSolicitudCompra = idSolicitudCompra;
	}

	public List<SolicitudArticuloBean> getSolicitudesArticulos() {
		return solicitudesArticulos;
	}

	public void setSolicitudesArticulos(List<SolicitudArticuloBean> solicitudesArticulos) {
		this.solicitudesArticulos = solicitudesArticulos;
	}

	public boolean isPendiente() {
		return pendiente;
	}

	public void setPendiente(Boolean pendiente) {
		this.pendiente = pendiente;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Boolean getPendiente() {
		return pendiente;
	}
	
}

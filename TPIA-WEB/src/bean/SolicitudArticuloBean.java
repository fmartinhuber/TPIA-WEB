package bean;

import java.util.*;

import javax.persistence.*;

@Entity
@Table (name="SolicitudArticulo")
public class SolicitudArticuloBean {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idSolicitudArticulo;
	private String codigo; //Este atributo identifica univocamente al objeto, el id lo manejamos para nuestra base
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idSolArticulo")
	private List<ItemSolicitadoArticuloBean> detalle;
	private Boolean pendiente; // (No cumplidas/Pendientes = FALSE - Cumplidas = TRUE)
	private Date fecha;
	
	
	
	public SolicitudArticuloBean(String codigo, List<ItemSolicitadoArticuloBean> detalle, Boolean pendiente,
			Date fecha) {
		super();
		this.codigo = codigo;
		this.detalle = detalle;
		this.pendiente = pendiente;
		this.fecha = fecha;
	}

	public SolicitudArticuloBean() {

	}
	
	

	public Integer getIdSolicitudArticulo() {
		return idSolicitudArticulo;
	}

	public void setIdSolicitudArticulo(Integer idSolicitudArticulo) {
		this.idSolicitudArticulo = idSolicitudArticulo;
	}

	public List<ItemSolicitadoArticuloBean> getDetalle() {
		return detalle;
	}

	public void setDetalle(List<ItemSolicitadoArticuloBean> detalle) {
		this.detalle = detalle;
	}

	public boolean isCumplimiento() {
		return pendiente;
	}

	public void setCumplimiento(Boolean pendiente) {
		this.pendiente = pendiente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
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

	public void setPendiente(Boolean pendiente) {
		this.pendiente = pendiente;
	}
	
}

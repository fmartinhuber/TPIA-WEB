package bean2;

import java.util.*;

import javax.persistence.*;

@Entity
@Table (name="SolicitudArticulo")
public class SolicitudArticuloBean {
	@Id
	private Integer idSolArticulo;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idSolArticulo")
	private List<ItemSolicitadoArticuloBean> detalle;
	private Boolean pendiente; // (No cumplidas/Pendientes = FALSE - Cumplidas = TRUE)
	private Date fecha;
	
	

	public SolicitudArticuloBean(Integer idSolArticulo, List<ItemSolicitadoArticuloBean> detalle, Boolean pendiente,
			Date fecha) {
		super();
		this.idSolArticulo = idSolArticulo;
		this.detalle = detalle;
		this.pendiente = pendiente;
		this.fecha = fecha;
	}

	public SolicitudArticuloBean() {

	}
	
	

	public Integer getidSolArticulo() {
		return idSolArticulo;
	}

	public void setidSolArticulo(Integer idSolArticulo) {
		this.idSolArticulo = idSolArticulo;
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

	public Integer getIdSolArticulo() {
		return idSolArticulo;
	}

	public void setIdSolArticulo(Integer idSolArticulo) {
		this.idSolArticulo = idSolArticulo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}

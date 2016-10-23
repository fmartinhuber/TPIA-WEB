package bean;

import java.util.*;

import javax.persistence.*;

@Entity
public class SolicitudArticuloBean {
	@Id
	private Integer idSolArticulo;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idSolArticulo")
	private List<DetalleSolicitadoBean> detalle;
	private boolean cumplimiento; // (No cumplidas/Pendientes = FALSE - Cumplidas = TRUE)
	private Date fecha;
	
	

	public SolicitudArticuloBean(Integer idSolArticulo, List<DetalleSolicitadoBean> detalle, boolean cumplimiento,
			Date fecha) {
		super();
		this.idSolArticulo = idSolArticulo;
		this.detalle = detalle;
		this.cumplimiento = cumplimiento;
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

	public List<DetalleSolicitadoBean> getDetalle() {
		return detalle;
	}

	public void setDetalle(List<DetalleSolicitadoBean> detalle) {
		this.detalle = detalle;
	}

	public boolean isCumplimiento() {
		return cumplimiento;
	}

	public void setCumplimiento(boolean cumplimiento) {
		this.cumplimiento = cumplimiento;
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

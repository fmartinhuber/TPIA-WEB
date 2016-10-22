package bean;

import java.util.*;

import javax.persistence.*;

@Entity
public class SolicitudArticuloBean {
	@Id
	private Integer idSolArticulo;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idSolArticulo")
	private List<DetalleSolicitadoBean> detalleSolicitado;
	private boolean cumplimiento; // (No cumplidas/Pendientes = FALSE - Cumplidas = TRUE)
	private Date fecha;
	
	

	public SolicitudArticuloBean(Integer idSolArticulo, List<DetalleSolicitadoBean> detalleSolicitado,
			boolean cumplimiento, Date fecha) {
		super();
		this.idSolArticulo = idSolArticulo;
		this.detalleSolicitado = detalleSolicitado;
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

	public List<DetalleSolicitadoBean> getDetalleSolicitado() {
		return detalleSolicitado;
	}

	public void setDetalleSolicitado(List<DetalleSolicitadoBean> detalleSolicitado) {
		this.detalleSolicitado = detalleSolicitado;
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

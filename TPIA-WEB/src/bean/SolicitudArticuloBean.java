package bean;

import java.util.*;

import javax.persistence.*;

@Entity
public class SolicitudArticuloBean {
	@Id
	private Integer idSolArticulo;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idSolArticulo")
	private List<ArticuloSolicitadoBean> articulosSolicitados;
	private boolean cumplimiento; // (No cumplidas/Pendientes = FALSE - Cumplidas = TRUE)
	private Date fecha;
	
	

	public SolicitudArticuloBean(Integer idSolArticulo, List<ArticuloSolicitadoBean> articulosSolicitados,
			boolean cumplimiento, Date fecha) {
		super();
		this.idSolArticulo = idSolArticulo;
		this.articulosSolicitados = articulosSolicitados;
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

	public List<ArticuloSolicitadoBean> getArticulosSolicitados() {
		return articulosSolicitados;
	}

	public void setArticulosSolicitados(List<ArticuloSolicitadoBean> articulosSolicitados) {
		this.articulosSolicitados = articulosSolicitados;
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

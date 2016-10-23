package bean;

import java.util.*;

import javax.persistence.*;

@Entity
@Table (name="SolicitudCompra")
public class SolicitudCompraBean {
	@Id
	private Integer idSolCompra;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idSolCompra")
	private List<SolicitudArticuloBean> solicitudesArticulos;
	private boolean cumplimiento; // (Recien enviada a fabrica = FALSE - Devuelta por fabrica = TRUE)
	
	
	
	public SolicitudCompraBean(Integer idSolCompra, List<SolicitudArticuloBean> solicitudesArticulos,
			boolean cumplimiento) {
		super();
		this.idSolCompra = idSolCompra;
		this.solicitudesArticulos = solicitudesArticulos;
		this.cumplimiento = cumplimiento;
	}

	public SolicitudCompraBean() {

	}
	
	
	
	public Integer getIdSolCompra() {
		return idSolCompra;
	}

	public void setIdSolCompra(Integer idSolCompra) {
		this.idSolCompra = idSolCompra;
	}

	public List<SolicitudArticuloBean> getSolicitudesArticulos() {
		return solicitudesArticulos;
	}

	public void setSolicitudesArticulos(List<SolicitudArticuloBean> solicitudesArticulos) {
		this.solicitudesArticulos = solicitudesArticulos;
	}

	public boolean isCumplimiento() {
		return cumplimiento;
	}

	public void setCumplimiento(boolean cumplimiento) {
		this.cumplimiento = cumplimiento;
	}
	
}

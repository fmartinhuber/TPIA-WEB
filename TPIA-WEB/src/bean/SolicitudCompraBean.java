package bean;

import java.util.*;

import javax.persistence.*;

@Entity
public class SolicitudCompraBean {
	@Id
	private Integer idSolCompra;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idSolCompra")
	private List<SolicitudArticuloBean> solicitudesArticulos;
	
	public SolicitudCompraBean(Integer idSolCompra, List<SolicitudArticuloBean> solicitudesArticulos) {
		super();
		this.idSolCompra = idSolCompra;
		this.solicitudesArticulos = solicitudesArticulos;
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
	
}

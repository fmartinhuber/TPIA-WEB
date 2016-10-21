package bean;

import java.util.*;

import javax.persistence.*;

@Entity
public class SolicitudArticuloBean {
	@Id
	private Integer idSolArticulo;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idSolArticulo")
	private List<ArticuloBean> articulos;
	private boolean cumplimiento; // (No cumplidas/Pendientes = FALSE - Cumplidas = TRUE)
	
	
	
	public SolicitudArticuloBean(Integer idSolArticulo, ArrayList<ArticuloBean> articulos, boolean cumplimiento) {
		super();
		this.idSolArticulo = idSolArticulo;
		this.articulos = articulos;
		this.cumplimiento = cumplimiento;
	}
	
	public SolicitudArticuloBean() {

	}

	public Integer getidSolArticulo() {
		return idSolArticulo;
	}

	public void setidSolArticulo(Integer idSolArticulo) {
		this.idSolArticulo = idSolArticulo;
	}

	public List<ArticuloBean> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<ArticuloBean> articulos) {
		this.articulos = articulos;
	}

	public boolean isCumplimiento() {
		return cumplimiento;
	}

	public void setCumplimiento(boolean cumplimiento) {
		this.cumplimiento = cumplimiento;
	}
	
}

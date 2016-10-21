package bean;

import java.util.*;

import javax.persistence.*;

@Entity
public class SolicitudCompraBean {
	@Id
	private Integer idSolCompra;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idSolCompra")
	private List<ArticuloBean> articulos;
	
	
	
	public SolicitudCompraBean(Integer idSolCompra, ArrayList<ArticuloBean> articulos) {
		super();
		this.idSolCompra = idSolCompra;
		this.articulos = articulos;
	}
	
	public SolicitudCompraBean() {

	}

	public Integer getidSolCompra() {
		return idSolCompra;
	}

	public void setidSolCompra(Integer idSolCompra) {
		this.idSolCompra = idSolCompra;
	}

	public List<ArticuloBean> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<ArticuloBean> articulos) {
		this.articulos = articulos;
	}
	
}

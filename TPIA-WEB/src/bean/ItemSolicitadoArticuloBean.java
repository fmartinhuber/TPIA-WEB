package bean;

import javax.persistence.*;

//Daro: Este Bean relaciona el articulo con la cantidad solicitada

@Entity
@Table (name="ItemSolicitadoArticulo")
public class ItemSolicitadoArticuloBean {
	@Id
	private Integer idItemSolicitadoArticulo;
	@OneToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="idDetalleSolicitado")
	private ArticuloBean articulo;
	private Integer cantidad;
		
	

	public ItemSolicitadoArticuloBean(Integer idItemSolicitadoArticulo, ArticuloBean articulo, Integer cantidad) {
		super();
		this.idItemSolicitadoArticulo = idItemSolicitadoArticulo;
		this.articulo = articulo;
		this.cantidad = cantidad;
	}

	public ItemSolicitadoArticuloBean() {
		
	}
	

	
	public Integer getIdItemSolicitadoArticulo() {
		return idItemSolicitadoArticulo;
	}

	public void setIdItemSolicitadoArticulo(Integer idItemSolicitadoArticulo) {
		this.idItemSolicitadoArticulo = idItemSolicitadoArticulo;
	}

	public ArticuloBean getArticulo() {
		return articulo;
	}

	public void setArticulo(ArticuloBean articulo) {
		this.articulo = articulo;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
}

package other;

import bean.ArticuloBean;

//Daro: Esta clase simula la compra realizada por Fabrica, relacionando articulo y cantidad enviada

public class ArticuloCompraFabrica {
	private ArticuloBean articulo;
	private Integer cantidad;
	
	public ArticuloCompraFabrica(ArticuloBean articulo, Integer cantidad) {
		this.articulo = articulo;
		this.cantidad = cantidad;
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

package bean2;

import javax.persistence.*;

@Entity
@Table (name="RecepcionCompra")
public class RecepcionCompraBean {
	@Id
	private Integer idCompra;
	@OneToMany
	@JoinColumn(name="idRecepcion")
	private ItemRecepcionCompra itemsRecepcionCompra;

	
	public RecepcionCompraBean(Integer idCompra, ItemRecepcionCompra itemsRecepcionCompra) {
		this.idCompra = idCompra;
		this.itemsRecepcionCompra = itemsRecepcionCompra;
	}
	
	public RecepcionCompraBean() {

	}
	
	
	
	public Integer getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(Integer idCompra) {
		this.idCompra = idCompra;
	}
	public ItemRecepcionCompra getSolicitudCompra() {
		return itemsRecepcionCompra;
	}
	public void setSolicitudCompra(ItemRecepcionCompra itemsRecepcionCompra) {
		this.itemsRecepcionCompra = itemsRecepcionCompra;
	}
	
	
	
}

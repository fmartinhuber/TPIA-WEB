package bean2;

import java.util.*;

import javax.persistence.*;

@Entity
@Table (name="SolicitudCompra")
public class SolicitudCompraBean {
	@Id
	private Integer idSolCompra;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idSolCompra")
	private List<ItemSolicitudCompraBean> itemsSolicitudCompra;
	private Boolean pendiente; // (Recien enviada a fabrica = FALSE - Devuelta por fabrica = TRUE)
	
	
	
	public SolicitudCompraBean(Integer idSolCompra, List<ItemSolicitudCompraBean> itemsSolicitudCompra,
			Boolean pendiente) {
		super();
		this.idSolCompra = idSolCompra;
		this.itemsSolicitudCompra = itemsSolicitudCompra;
		this.pendiente = pendiente;
	}

	public SolicitudCompraBean() {

	}
	
	
	
	public Integer getIdSolCompra() {
		return idSolCompra;
	}

	public void setIdSolCompra(Integer idSolCompra) {
		this.idSolCompra = idSolCompra;
	}

	public List<ItemSolicitudCompraBean> getSolicitudesArticulos() {
		return itemsSolicitudCompra;
	}

	public void setSolicitudesArticulos(List<ItemSolicitudCompraBean> itemsSolicitudCompra) {
		this.itemsSolicitudCompra = itemsSolicitudCompra;
	}

	public boolean isPendiente() {
		return pendiente;
	}

	public void setPendiente(Boolean pendiente) {
		this.pendiente = pendiente;
	}
	
}

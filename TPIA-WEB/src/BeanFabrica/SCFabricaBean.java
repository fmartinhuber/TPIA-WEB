package BeanFabrica;

import java.util.*;

import javax.persistence.*;

@Entity
@Table (name="SolicitudCompra")
public class SCFabricaBean {
	@Id
	private Integer idSolCompra;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idSolCompra")
	private List<ItemSCFabricaBean> itemsSolicitudCompra;
	private Boolean pendiente; // (Recien enviada a fabrica = FALSE - Devuelta por fabrica = TRUE)
	
	
	
	public SCFabricaBean(Integer idSolCompra, List<ItemSCFabricaBean> itemsSolicitudCompra,
			Boolean pendiente) {
		super();
		this.idSolCompra = idSolCompra;
		this.itemsSolicitudCompra = itemsSolicitudCompra;
		this.pendiente = pendiente;
	}

	public SCFabricaBean() {

	}
	
	
	
	public Integer getIdSolCompra() {
		return idSolCompra;
	}

	public void setIdSolCompra(Integer idSolCompra) {
		this.idSolCompra = idSolCompra;
	}

	public List<ItemSCFabricaBean> getSolicitudesArticulos() {
		return itemsSolicitudCompra;
	}

	public void setSolicitudesArticulos(List<ItemSCFabricaBean> itemsSolicitudCompra) {
		this.itemsSolicitudCompra = itemsSolicitudCompra;
	}

	public boolean isPendiente() {
		return pendiente;
	}

	public void setPendiente(Boolean pendiente) {
		this.pendiente = pendiente;
	}
	
}

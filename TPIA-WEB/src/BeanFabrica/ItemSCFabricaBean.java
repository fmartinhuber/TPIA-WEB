package BeanFabrica;

import javax.persistence.*;

@Entity
@Table(name = "itemSolicitudCompra")
public class ItemSCFabricaBean {

	@Id
	private Integer idItem;
	@ManyToOne
	@JoinColumn(name = "idArticulo")
	private ArticuloFabricaBean articulo;
	private Integer cantidad;
	
}

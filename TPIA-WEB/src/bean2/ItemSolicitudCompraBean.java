package bean2;

import javax.persistence.*;

@Entity
@Table(name = "itemSolicitudCompra")
public class ItemSolicitudCompraBean {

	@Id
	private Integer idItem;
	@ManyToOne
	@JoinColumn(name = "idArticulo")
	private ArticuloBean articulo;
	private Integer cantidad;
	
}

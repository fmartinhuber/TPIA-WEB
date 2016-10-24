package bean2;

import javax.persistence.*;

@Entity
@Table(name = "ItemRecepcionCompra")
public class ItemRecepcionCompra {

	@Id
	private Integer idItemRecepcionCompra;
	@ManyToOne
	@JoinColumn(name = "idArticulo")
	private ArticuloBean articulo;
	private Integer cantidad;
}

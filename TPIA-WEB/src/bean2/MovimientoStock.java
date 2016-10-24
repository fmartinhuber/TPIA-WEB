package bean2;

import javax.persistence.*;

@Entity
@Table(name = "detalleMovimiento")
public class MovimientoStock {

	@Id
	private Integer idmov;
	@ManyToOne
	@JoinColumn(name = "idArticulo")
	private ArticuloBean articulo;
	private String tipoMovimiento; // Ingreso o Egreso del stock
	private Integer cantidad;
	
}

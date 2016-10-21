package bean;

import java.util.List;

import javax.persistence.*;

@Entity
public class RecepcionCompraBean {
	@Id
	private Integer idCompra;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="codigo")
	private SolicitudCompraBean solicitudCompra;
	
	
	
}

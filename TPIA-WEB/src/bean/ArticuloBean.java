package bean;

import javax.persistence.*;

@Entity
public class ArticuloBean {
	@Id
	@Column(name="codigoArticulo")
	private Integer idArticulo;
	private String codigo;
	private String nombre;
	private String tipo;
	private Integer cantidad;
	
	
	
	public ArticuloBean(Integer idArticulo, String codigo, String nombre, String tipo, Integer cantidad) {
		super();
		this.idArticulo = idArticulo;
		this.codigo = codigo;
		this.nombre = nombre;
		this.tipo = tipo;
		this.cantidad = cantidad;
	}
	
	public ArticuloBean() {

	}

	public Integer getidArticulo() {
		return idArticulo;
	}

	public void setidArticulo(Integer idArticulo) {
		this.idArticulo = idArticulo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
}

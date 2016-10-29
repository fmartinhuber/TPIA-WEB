package bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Articulo")
public class ArticuloBean2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;
	
	@Column(nullable = true)
	private long codigo;
	@Column(nullable = true)
	private String nombre;
	@Column(nullable = true)
	private String descripcion;
	@Column(nullable = true)
	private String marca;
	@Column(nullable = true)
	private String origen;
	@Column(nullable = true)
	private float precio;
	@Column(nullable = true)
	private String tipo;
	@Column(nullable = true)
	private String fecha;
	@Column(nullable = true)
	private String fotoURL;
	@Column(nullable = true)
	private String edadRecomendada;
	@Column(nullable = true)
	private String fichaTecnica;
	@Column(nullable = true)
	private String talle;
	@Column(nullable = true)
	private String material;
	@Column(nullable = true)
	private Integer cantidadDisponible;

	public Integer getCantidadDisponible() {
		return cantidadDisponible;
	}
	
	public ArticuloBean2(){}

	public ArticuloBean2(int id, long codigo, String nombre, String descripcion, String marca, String origen,
			float precio, String tipo, String fecha, String fotoURL, String edadRecomendada, String fichaTecnica,
			String talle, String material, Integer cantidadDisponible) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.marca = marca;
		this.origen = origen;
		this.precio = precio;
		this.tipo = tipo;
		this.fecha = fecha;
		this.fotoURL = fotoURL;
		this.edadRecomendada = edadRecomendada;
		this.fichaTecnica = fichaTecnica;
		this.talle = talle;
		this.material = material;
		this.cantidadDisponible = cantidadDisponible;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getFotoURL() {
		return fotoURL;
	}

	public void setFotoURL(String fotoURL) {
		this.fotoURL = fotoURL;
	}

	public String getEdadRecomendada() {
		return edadRecomendada;
	}

	public void setEdadRecomendada(String edadRecomendada) {
		this.edadRecomendada = edadRecomendada;
	}

	public String getFichaTecnica() {
		return fichaTecnica;
	}

	public void setFichaTecnica(String fichaTecnica) {
		this.fichaTecnica = fichaTecnica;
	}

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setCantidadDisponible(Integer cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	};
	
	
	
	
}

package BeanFabrica;

import javax.persistence.*;

/*Daro: Todos los atributos de ArticuloBean fueron tomados del pdf de articulos en Web Campus*/

@Entity
@Table (name="Articulo")
public class ArticuloFabricaBean {
	@Id
	private Integer idArticulo;
	private String nombre;
	private String codigo;
	private String descripcion;
	private String marca;
								

	public ArticuloFabricaBean(Integer idArticulo, String nombre, String codigo, String descripcion, String marca) {
		super();
		this.idArticulo = idArticulo;
		this.nombre = nombre;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.marca = marca;
		
	}

	public ArticuloFabricaBean(){
		
	}



	public Integer getIdArticulo() {
		return idArticulo;
	}

	public void setIdArticulo(Integer idArticulo) {
		this.idArticulo = idArticulo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	
}

package bean;

import javax.persistence.*;

/*Daro: Todos los atributos de ArticuloBean fueron tomados del pdf de articulos en Web Campus*/

@Entity
@Table (name="Articulo")
public class ArticuloBean {
	@Id
	private Integer idArticulo;
	private String nombre;
	private String codigo;
	private String descripcion;
	private String marca;
	private float precio;
	private boolean foto; //Se toma foto como boolean ya que no es nuestra funcion como Deposito almacenar/mostrar fotos de los Articulos
	private String origen;
	private String fichaTecnica;
	private Integer stockActual; //Atributo particular que manejamos por ser Deposito
	private Integer stockSolicitado; 	/*Este atributo es necesario para posteriormente calcular la cantidad de Articulos a pedir.
	 									Es el stock que se desea tener en el deposito. Se carga al momento del alta y queda fijo*/
										
	
	

	public ArticuloBean(Integer idArticulo, String nombre, String codigo, String descripcion, String marca,
			float precio, boolean foto, String origen, String fichaTecnica, Integer stockActual,
			Integer stockSolicitado) {
		super();
		this.idArticulo = idArticulo;
		this.nombre = nombre;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.marca = marca;
		this.precio = precio;
		this.foto = foto;
		this.origen = origen;
		this.fichaTecnica = fichaTecnica;
		this.stockActual = stockActual;
		this.stockSolicitado = stockSolicitado;
	}

	public ArticuloBean(){
		
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

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public boolean isFoto() {
		return foto;
	}

	public void setFoto(boolean foto) {
		this.foto = foto;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getFichaTecnica() {
		return fichaTecnica;
	}

	public void setFichaTecnica(String fichaTecnica) {
		this.fichaTecnica = fichaTecnica;
	}

	public Integer getStockActual() {
		return stockActual;
	}

	public void setStockActual(Integer stockActual) {
		this.stockActual = stockActual;
	}

	public Integer getStockSolicitado() {
		return stockSolicitado;
	}

	public void setStockSolicitado(Integer stockSolicitado) {
		this.stockSolicitado = stockSolicitado;
	}
	
}

package dto;

import java.io.Serializable;

//Prueba commit daro2

public class ArticuloDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String codigo;
	private String nombre;
	private String tipo;
	private Integer cantidad;
	
	public ArticuloDTO(String codigo, String nombre, String tipo, Integer cantidad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.tipo = tipo;
		this.cantidad = cantidad;
	}
	
	public ArticuloDTO() {
		
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

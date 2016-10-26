package bean;

import javax.persistence.*;

@Entity
public class NinoBean extends ArticuloBean{

	private Integer edadRecomendada;
	
	public NinoBean(){}

	public NinoBean(String nombre, String codigo, String descripcion, String marca, float precio, String foto,
			String origen, Integer stockActual, Integer stockSolicitado, Integer edadRecomendada) {
		super(nombre, codigo, descripcion, marca, precio, foto, origen, stockActual, stockSolicitado);
		this.edadRecomendada = edadRecomendada;
	}

	public Integer getEdadRecomendada() {
		return edadRecomendada;
	}

	public void setEdadRecomendada(Integer edadRecomendada) {
		this.edadRecomendada = edadRecomendada;
	};
	
	
	
}

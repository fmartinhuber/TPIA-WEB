package controler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import bean.*;
import service.*;

@Controller
@RequestMapping(value = "/articulo")
public class ArticuloControlador {
	
	static Logger logger = LoggerFactory.getLogger(ArticuloControlador.class);
	
	@Autowired
	private DepositoDelegateService depositoService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listarArticulos(Model model){		
		logger.info("REMOTE: Recuperando articulos ");
		
		model.addAttribute("articulos", depositoService.listarArticulos());
		return "articulo-list";
	}
	
	@RequestMapping(value = "/crear-nuevo-articulo", method = RequestMethod.POST)
	public String crearArticulo(
		@RequestParam("newArticuloCodigo") int codigo,
		@RequestParam("newArticuloNombre") String nombre,
		@RequestParam("newArticuloDescripcion") String descripcion,
		@RequestParam("newArticuloMarca") String marca,
		@RequestParam("newArticuloOrigen") String origen,
		@RequestParam("newArticuloPrecio") float precio,
		@RequestParam("newArticuloTipo") String tipo,
		@RequestParam("newArticuloFecha") String fecha,
		@RequestParam("newArticuloFotoURL") String fotoURL,
		@RequestParam("newArticuloEdadRecomendada") String edadRecomendada,
		@RequestParam("newArticuloFichaTecnica") String fichaTecnica,
		@RequestParam("newArticuloTalle") String talle,
		@RequestParam("newArticuloMaterial") String material,
		@RequestParam("newArticuloCantidadDisponible") Integer cantidadDisponible,
		Model model){
			
		ArticuloBean2 articulo = new ArticuloBean2();
		articulo.setCodigo(codigo);
		articulo.setNombre(nombre);
		articulo.setDescripcion(descripcion);
		articulo.setMarca(marca);
		articulo.setOrigen(origen);
		articulo.setPrecio(precio);
		articulo.setTipo(tipo);
		articulo.setFecha(fecha);
		articulo.setFotoURL(fotoURL);
		articulo.setEdadRecomendada(edadRecomendada);
		articulo.setFichaTecnica(fichaTecnica);
		articulo.setTalle(talle);
		articulo.setMaterial(material);
		articulo.setCantidadDisponible(cantidadDisponible);

		logger.info("REMOTE: Registrando articulo: {}", articulo);
		
		depositoService.crearArticulo(articulo);
		
		return "dummy";
	}
	

}

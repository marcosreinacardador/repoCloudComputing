package restaurantesmalaga;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.w3c.dom.ls.LSInput;

import restaurantesmalaga.model.Restaurante;

public class MainMapas extends MainRestaurante {

	private static final String RUTA_FICHERO = "restaurantes.txt";  //ruta relativa, donde me lo lleve me lo reconoce
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File(RUTA_FICHERO);  // creamos objeto file
		
		if (file.exists()) {
			System.out.println("FICHERO EXISTE!, a parsearlo");   //parsear: recorrerlo y clasificarlo   
			Path path = file.toPath();  //convierto a Path para usar el nuevo API y asi ir más rápido
			List<String> lineas = Files.readAllLines(path);  //leo todo el fichero en una linea
			List<Restaurante> listRest = MainRestaurante.cargarRestaurantes(lineas);

			Map<String, Restaurante> mapasRestaurantes = new HashMap<>();

			
			for (Restaurante r : listRest) {
				
				mapasRestaurantes.put(r.getNombre(), r);
				
			}
			
			
			Restaurante rp = mapasRestaurantes.get("La Parrilla");
			
			System.out.println(rp.toString());
			
			// TODO partiendo de la lista de restaurantes cargada haced un 
			// mapa, donde la clave sea el barrio
			// y el valor, la lista de resturantes de ese barrio
			
			Map<String, List<Restaurante>> mapaRestaurantesPorBarrios = null;
			mapaRestaurantesPorBarrios = crearMapasPorBarrios(listRest);
			Set<String> clavesMapa = mapaRestaurantesPorBarrios.keySet();

			for(String barrio : clavesMapa) {
				List<Restaurante> lrb = mapaRestaurantesPorBarrios.get(barrio);
				System.out.println("\nBarrio = " + barrio);
				for(Restaurante rb : lrb) {
					System.out.println(rb);
				}
			}
			
				
		} else {
			System.out.println("NO EXISTE fichero en esa ruta: ");
		}
		

		
		
	}
	
	public static  Map<String, List<Restaurante>>  crearMapasPorBarrios (List<Restaurante> lr) {
		
		Map<String, List<Restaurante>> mapa = new HashMap<>();
		
		//recorro la lista
			// si el barrio ya está en el mapa
				//añado resurante a esa lista
			//y sino, creo la lista nueva y add ese restaurante
		
		for(Restaurante r : lr) {   //recorro los restaurantes
			
			List<Restaurante> lrb = mapa.get(r.getBarrio());
			if(lrb!=null) {
				System.out.println("Ya existen restaurantes con ese barrio");
				lrb.add(r);
			} else {
				List<Restaurante> lnueva = new ArrayList<>();
				lnueva.add(r);
				mapa.put(r.getBarrio(), lnueva);
				
			}
				
		}
		
		
		return mapa;
	}

}

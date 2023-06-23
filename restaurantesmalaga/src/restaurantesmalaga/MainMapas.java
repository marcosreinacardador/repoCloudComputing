package restaurantesmalaga;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import restaurantesmalaga.model.Restaurante;

public class MainMapas extends MainRestaurante {

	private static final String RUTA_FICHERO = "restaurantes.txt"; // ruta relativa, donde me lo lleve me lo reconoce

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File(RUTA_FICHERO); // creamos objeto file

		if (file.exists()) {
			System.out.println("FICHERO EXISTE!, a parsearlo"); // parsear: recorrerlo y clasificarlo
			Path path = file.toPath(); // convierto a Path para usar el nuevo API y asi ir más rápido
			List<String> lineas = Files.readAllLines(path); // leo todo el fichero en una linea
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
			mostrarMapa(mapaRestaurantesPorBarrios);
			
			System.err.println("\nMostrando los más caros");
			
			List<Restaurante> listaCaros = getRestauranteMasCaroPorBarrio(mapaRestaurantesPorBarrios);
			for (Restaurante r : listaCaros)
			{
				System.out.println(r);
			}

		} else {
			System.out.println("NO EXISTE fichero en esa ruta: ");
		}

	}

	public static void mostrarMapa(Map<String, List<Restaurante>> mapas) {
		Set<String> clavesMapa = mapas.keySet(); // obtenemos el conjunto de claves, para poder recorrer el mapa

		// para cada barrio dame barrio "Centro" la lista con los restaurantes
		for (String barrio : clavesMapa) {
			List<Restaurante> lrb = mapas.get(barrio); // lrb es la lista de barrios, dame de este barrio los
														// restaurantes que tiene
			System.out.println("\nBarrio = " + barrio);
			for (Restaurante rb : lrb) {
				System.out.println(rb);
			}
		}

	}

	// recorro la lista
	// si el barrio ya está en el mapa
	// añado resurante a esa lista
	// y sino, creo la lista nueva y add ese restaurante

	public static Map<String, List<Restaurante>> crearMapasPorBarrios(List<Restaurante> lr) {

		Map<String, List<Restaurante>> mapa = new HashMap<>();

		for (Restaurante r : lr) { // recorro los restaurantes

			List<Restaurante> lrb = mapa.get(r.getBarrio()); // incialmente es null
			if (lrb != null) { // ya hay restaurantes de ese barrio
				System.out.println("Ya existen restaurantes con ese barrio");
				lrb.add(r); // le sumo el nuevo restaurante del exstente barrio
			} else { // Creamos una nueva lista con el barrio y meto el nuevo restaurante
				List<Restaurante> lnueva = new ArrayList<>();
				lnueva.add(r);
				mapa.put(r.getBarrio(), lnueva);

			}

		}

		return mapa;
	}

	// Partiendo del mapa de restaurantes por barrios, obtener una lista
	// de los resturantes mas caros de cada barrio

	private static Restaurante obtenerMasCaro(List<Restaurante> lrb) {
		Restaurante restMasCaro = null;

		double precioMayor = 0;

		// Otra forma con CompareTo

		// Collections.sort(lrb);
		// restMasCaro = lrb.get(lrb.size()-1);

		for (Restaurante r : lrb) // para cada restaurante que este en la lista
		{

			if (r.getPrecioMedio() > precioMayor) {
				restMasCaro = r;
				precioMayor = r.getPrecioMedio();
			}
		}
		return restMasCaro;
	}

	public static List<Restaurante> getRestauranteMasCaroPorBarrio(Map<String, List<Restaurante>> mapaR) {
		List<Restaurante> listaCaros = new ArrayList<>();

		// TODO reccorer el mapa por barrios y quedarme con el mas caro de cada barrio

		Set<String> barrios = mapaR.keySet(); // obtenemos el conjunto de claves, para poder recorrer el mapa

		for (String barrio : barrios) { // Ya tengo el primer barrio
			List<Restaurante> lrb = mapaR.get(barrio); // para sacar la lista de restaurantes
			Restaurante rmascaro = obtenerMasCaro(lrb); // quiero sacar el restaurante mas caro, hago un metodo nuevo
			listaCaros.add(rmascaro);
		}

		return listaCaros;
	}

}
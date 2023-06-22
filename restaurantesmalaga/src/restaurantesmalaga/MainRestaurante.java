package restaurantesmalaga;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

import restaurantesmalaga.model.ComparadorRestaurantes;
import restaurantesmalaga.model.Restaurante;

public class MainRestaurante {
	
	private static final String RUTA_FICHERO = "restaurantes.txt";  //ruta relativa, donde me lo lleve me lo reconoce
	
	public static List<Restaurante> cargarRestaurantes(List<String> lineas){
		
		List<Restaurante> lRestaurantes = null;
		int numLinea = 0;
		Restaurante restauranteAux = null;  // restaurante en curso
		
		restauranteAux = new Restaurante();  //creo restaurante vacio
		
		lRestaurantes = new ArrayList<>();  // se crea una lista
		
		for (String linea : lineas) {   //(recorrerá)para cada linea que esté en lineas(el fichero completo)
			numLinea = numLinea + 1;
			switch (numLinea) {
			case 1: restauranteAux.setNombre(linea); break;
			case 2:	restauranteAux.setDireccion(linea); break;
			case 3:	restauranteAux.setWeb(linea); break;
			case 4: restauranteAux.setFichaGoogle(linea); break;
			case 5: restauranteAux.setLatitud(Float.parseFloat(linea)); break;  // convertir cadena en número
			case 6: restauranteAux.setLongitud(Float.parseFloat(linea)); break;
			case 7: restauranteAux.setBarrio(linea); break;
			case 8: //restauranteAux.setPrecioMedio(Double.parseDouble(linea));
					
					// Supplier
					Supplier<Double> generaPrecioMedio = () -> {
						double numAleatorio = 0;
						Random random = new Random();
						numAleatorio = 20 + random.nextDouble(100);
						return numAleatorio;
					};
					restauranteAux.setPrecioMedio(Math.round(generaPrecioMedio.get()));
					
			case 9:	
					String[] especialidades = linea.split(",");  //troceo espe1, espe2, espe3
					quitarBlancos(especialidades);
					//paso de Array a Lista
					List<String> lEspecialidades = Arrays.asList(especialidades);
					restauranteAux.setEspecialidades(lEspecialidades); 
					lRestaurantes.add(restauranteAux);
					
					numLinea = 0;
					restauranteAux = new Restaurante(); //Creamos otro restaurante al instanciar de nuevo el Restaurante();
					break;
			}
		}
		
		return lRestaurantes;
	}
	
	

	public static void main(String[] args) throws IOException {
		// TODO Cargar la lista de restaurantes del fichero

		File file = new File(RUTA_FICHERO);  // creamos objeto file
		
		if (file.exists()) {
			System.out.println("FICHERO EXISTE!, a parsearlo");   //parsear: recorrerlo y clasificarlo   
			Path path = file.toPath();  //convierto a Path para usar el nuevo API y asi ir más rápido
			List<String> lineas = Files.readAllLines(path);  //leo todo el fichero en una linea
			List<Restaurante> listRest = cargarRestaurantes(lineas);
			System.out.println("la lista tiene " +  listRest.size() + " restaurantes");
			
			mostrarRestaurantes(listRest);    //mostrar todos los restaurantes
			
			System.err.println("\nLISTA ORDENADA DE RESTAURANTES");
			ComparadorRestaurantes cr = new ComparadorRestaurantes();
			Collections.sort(listRest, cr);
			
			// añadimos un nuevo restaurante 		
			Restaurante restNuevo = new Restaurante();
			restNuevo.setNombre("McDonadls");
			restNuevo.setDireccion("MC Donadls Plza de la Marina 2");
			restNuevo.setWeb("www.mcdonalds.com");
			restNuevo.setFichaGoogle("https://goo.gl/maps/DUmVjnSZeX6Y9n448");
			restNuevo.setLatitud(36.7184846f);
			restNuevo.setLongitud(-4.4909181f);
			restNuevo.setBarrio("centro");
			restNuevo.setEspecialidades(List.of("hamburguesas", "patas fritas", "helados"));
			
			
			// buscar restaurante en este caso el que sea listRest numero 4
			Restaurante r5 = listRest.get(4);
			boolean esta = buscarRestaurantes(listRest, r5);
			System.out.println("R5 esta está en la lista " + esta);
			
			esta = buscarRestaurantes(listRest, restNuevo);
			System.out.println(esta);
			
			//Busqueda por Especialidades
			List<Restaurante> nombreEspecialidades  = listRest;
			String busqueda = "postres";
			nombreEspecialidades = buscarPorEspecialidades(listRest, busqueda);
			if (!nombreEspecialidades.isEmpty()) {
				System.out.println("Restaurantes que incluyen esta especialidad   " + busqueda + ": " + nombreEspecialidades.toString());
			} else {
				System.out.println("No hay restaurantes con esa especialidad.");
			}
			
			
			
			// busqueda por Nombre
			List<Restaurante> nombreRestaurantes = listRest;
			busqueda = "McDonadlsXX";
			nombreRestaurantes = buscarPorNombre(listRest, busqueda);
			if(!nombreRestaurantes.isEmpty()) {
				//System.out.println(nombreRestaurantes.toString() + "\n");
				mostrarRestaurantesLambda(listRest);
			} else {
				System.out.println("No hay restaurantes con ese nombre.");
			}
			
			
			//busqueda por barrio
			List<Restaurante> listBarrios = listRest;
			busqueda = "centro1";
			//System.out.println("Busqueda por el barrio " + busqueda + "\n");
			listBarrios = buscarPorBarrio(listRest, busqueda);
			if(!listBarrios.isEmpty()) {
				System.out.println(listBarrios.toString() + "\n");
			} else {
				System.out.println("No hay restaurantes en ese barrio.");
			}
			
	
			//busqueda por Precio Medio y ordenada 
			Collections.sort(listRest);
			double meGasto = 19.90;
			for( Restaurante elemento : listarPorPrecioMedio(listBarrios, meGasto)){
				System.out.println(elemento.toString() + "\n");
			}
			
	
				
		} else {
			System.out.println("NO EXISTE fichero en esa ruta: ");
		}
		
		
	}
	
	public static void mostrarRestaurantes(List<Restaurante> lisRest) {  //metodo que muestra restaurantes
		System.out.println("Mostrando restaurantes");
		for (Restaurante r : lisRest) {  //hace loop con foreach
			System.out.println(r.toString());
		}
	}
	
	public static boolean buscarRestaurantes(List<Restaurante> listRest, Restaurante restauranteBuscado) {  // metodo buscame esto en esta lista
		boolean estaRestaurante = false;   // mejor practica poner los booleanos a false y los int a 0 y los objetos a null.
		int pos_actual = 0;
		int longitud = listRest.size();
		
		Restaurante restauranteAux = null;
		
		while (pos_actual < longitud  && !estaRestaurante) {
			restauranteAux = listRest.get(pos_actual);
			if(estaRestaurante = restauranteAux.equals(restauranteBuscado)) {
				System.out.println(restauranteAux);
			}
			pos_actual = pos_actual + 1;
		}
		
		return estaRestaurante;
		
	}
	
	public static List<Restaurante> buscarPorEspecialidades(List<Restaurante> nombreRestaurantes, String busquedaEspecialidades) {
				
		List<Restaurante> restaurantesEncontrados = new ArrayList<>();
		 
			
		System.out.println("Restaurantes encontrados por especialidades");
		
			for(Restaurante restaurante : nombreRestaurantes) {  //Obtengo especialidades
				if(restaurante.getEspecialidades().contains(busquedaEspecialidades)) {
					//System.out.println(restaurante.getNombre());
					restaurantesEncontrados.add(restaurante);
				}
			}
	
		 return restaurantesEncontrados;
	}
	
	
	private static void quitarBlancos(String[] especialidades) {
		for(int z=0; z<especialidades.length; z++) {
			especialidades[z] = especialidades[z].trim();  //quitar espacios
		}
	}
	
	public static List<Restaurante> buscarPorNombre(List<Restaurante> nombreRestaurantes, String busquedaNombre) {
				
		List<Restaurante> nombreRest = new ArrayList<Restaurante>();
		
	//	if (restaurantesEncontrados.isEmpty()) {
	//		System.out.println("No se han encontrado restaurantes con el nombre que estas buscando.");
	//	} else {
		System.out.println("Restaurantes encontrados por Nombre");
			for(Restaurante restaurante : nombreRestaurantes) {
				
				if(restaurante.getNombre().equals(busquedaNombre)) {
					//System.out.println(restaurante.getNombre());
					nombreRest.add(restaurante);
				}
	//		}
		}
		 return nombreRestaurantes;
	}
	
	// programacion funcional con foreach
	public static void mostrarRestaurantesLambda(List<Restaurante> listRest) {
		listRest.forEach(restaurante->System.out.println(restaurante));
	}
		
	public static List<Restaurante> buscarPorBarrio(List<Restaurante> nombreBarrios, String busquedaPorBarrio) {
				
		List<Restaurante> nombreRest = new ArrayList<Restaurante>();
		
	//	if (restaurantesEncontrados.isEmpty()) {
	//		System.out.println("No se han encontrado restaurantes con el nombre que estas buscando.");
	//	} else {
		System.out.println("Restaurantes encontrados por Barrio");
			for(Restaurante restaurante : nombreBarrios) {
				
				if(restaurante.getBarrio().equals(busquedaPorBarrio)) {
					//System.out.println(restaurante.getNombre());
					nombreRest.add(restaurante);
				}
	//		}
		}
		 return nombreBarrios;
	}
	
	
	//Programación funcional con stream (colecciones) con resultado terminal
	public static List<Restaurante> buscarRestaurantePorBarrioLambda(List<Restaurante> lRestaurantes, String barrio) {
		List<Restaurante> listaRestBarrios = null;
		
		listaRestBarrios = lRestaurantes.stream().filter(
				(Restaurante r) -> {
					return r.getBarrio().contains(barrio);
				}).toList();
		
		return listaRestBarrios;
	}

	//Programacion funcional
		public static List<Restaurante> listarPorPrecioMedio(List<Restaurante> lPrecioMedio, double cuantoMeGasto) {
			List<Restaurante> listaRestPrecioMedio = null;
			listaRestPrecioMedio = lPrecioMedio;
			
			System.out.println("Restaurantes encontrados por Precio Medio ***************");
			listaRestPrecioMedio = lPrecioMedio
					.stream()
					.filter(r -> r.getPrecioMedio() > cuantoMeGasto)
						//>(cuantoMeGasto*1.05) & r.getPrecioMedio()<(cuantoMeGasto/1.05));
					.toList();
			
			return listaRestPrecioMedio;
		}

	
}

		


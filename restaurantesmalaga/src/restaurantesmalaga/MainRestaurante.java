package restaurantesmalaga;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
			case 8:	
					String[] especialidades = linea.split(",");  //troceo espe1, espe2, espe3  
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

		File file = new File(RUTA_FICHERO);
		
		if (file.exists()) {
			System.out.println("FICHERO EXISTE!, a parsearlo");   //parsear: recorrerlo y clasificarlo   
			Path path = file.toPath();  //convierto a Path para usar el nuevo API y asi ir más rápido
			List<String> lineas = Files.readAllLines(path);  //leo todo el fichero en una linea
			List<Restaurante> listRest = cargarRestaurantes(lineas);
			System.out.println("la lista tiene " +  listRest.size() + " restaurantes");
			
			//			for (String linea : lineas) {   //(recorrerá)para cada linea que esté en lineas(el fichero completo)
//				System.out.println(linea);
//			}
//				
		} else {
			System.out.println("NO EXISTE fichero en esa ruta: ");
		}
		
	}

}

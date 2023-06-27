package edu.arealance.nube.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.arealance.nube.repository.entity.Restaurante;
import edu.arealance.nube.service.RestauranteService;

/**
 * 
 * API WEB HTTP -> Deriva en la ejecución de un método
 * 
 * GET -> consultar todos  
 * GET -> consultar uno (por ID)
 * 
 * POST -> insertar un restaurante nuevo PUT -> modificar un restaurante que ya
 * existe 
 * DELETE -> borra un restaurante (por ID) 
 * GET -> Búsqueda -> por barrio, por especialidad, por nombre, etc..
 *
 */

//@Controller    // Devuelve una vista(html/jsp)
@RestController // Devolvemos un JSON http://localhost:8081/restaurante
@RequestMapping("/restaurante")
public class RestauranteController {
	
	@Autowired  
	RestauranteService restauranteService;  // viene llamado desde RestauranteServiceImple 

	@GetMapping("/test") // http://localhost:8081/restaurante/test
	public Restaurante obtenerRestauranteTest() { // objeto dinamico, spring ha hecho un new

		Restaurante restaurante = null;

		System.out.println("Llamando a obtenerRestauranteTest");
		restaurante = new Restaurante(1l, "Martinete", "Carlos Haya 33", "Carranque", "www.martinete.org",  // Estado TRANSIENT
				"http://dkdkskksdk.coe", 33.65f, -2.3f, 10, "gazpachuelo", "paella", "sopa de marisco",
				LocalDateTime.now());

		return restaurante;
	}
	
//	GET -> consultar TODOS GET http://localhost:8081/restaurante
	@GetMapping
	public ResponseEntity<?> listarTodos() {
		
		ResponseEntity<?> responseEntity = null;   // representa el mensaje http y devuelve cualquier cosa
		Iterable<Restaurante> lista_Restaurantes = null;  //nos da la lista que llama que es servicio
		
			lista_Restaurantes = this.restauranteService.consultarTodos();
			responseEntity = ResponseEntity.ok(lista_Restaurantes);
		
		return responseEntity;
	}
	
//	  GET -> consultar uno (por ID)  http://localhost:8081/restaurante/id
	@GetMapping("/{id}")
	public ResponseEntity<?> listarPorId(@PathVariable Long id) {
		
		ResponseEntity<?> responseEntity = null;   // representa el mensaje http y devuelve cualquier cosa
		
		return responseEntity;	
	}
//	  POST -> insertar un restaurante nuevo  http://localhost:8081/restaurante (Body Restaurante)
	
	
	
//	  PUT -> modificar un restaurante que ya  http://localhost:8081/restaurante/id (Body Restaurante)
	
	
	
//	  DELETE -> borra un restaurante (por ID) http://localhost:8081/restaurante/id
	@DeleteMapping("/{id}")
	public ResponseEntity<?> BorrarPorId(@PathVariable Long id) {
		
		ResponseEntity<?> responseEntity = null;   // representa el mensaje http y devuelve cualquier cosa
		
		return responseEntity;
	}
	
	
}

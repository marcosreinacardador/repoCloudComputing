package edu.arealance.nube.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.arealance.nube.repository.entity.Restaurante;

/**
 * 
 * API WEB
 * HTTP -> Deriva en la ejecución de un método
 * 
 * GET -> consultar todos
 * GET -> consultar uno (por ID)
 * 
 * POST -> insertar un restaurante nuevo
 * PUT ->  modificar un restaurante que ya existe
 * DELETE -> borra un restaurante (por ID)
 * GET -> Búsqueda -> por barrio, por especialidad, por nombre, etc..
 *
 */


//@Controller    // Devuelve una vista(html/jsp)
@RestController  // Devolvemos un JSON  http://localhost:8081/restaurante
@RequestMapping("/restaurante")
public class RestauranteController  {

	@GetMapping("/test")	// http://localhost:8081/restaurante/test
	public Restaurante obtenerRestauranteTest () {
		
		Restaurante restaurante = null;
		
		System.out.println("Llamando a obtenerRestauranteTest");
		
		return restaurante;
		
	}

}

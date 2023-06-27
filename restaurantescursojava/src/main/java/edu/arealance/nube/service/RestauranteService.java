package edu.arealance.nube.service;

import java.util.Optional;

import edu.arealance.nube.repository.entity.Restaurante;

public interface RestauranteService {

	Iterable<Restaurante> consultarTodos ();  // no recibo nada, que devuelvo un iterable de restaurante, dará error en RestauranteServiceImpl, habrá que add este iterable
											  // Iterable lo que hace es recorrer
	
	Optional<Restaurante> consultarRestaurante (Long id);  // el tipo optional hace que nunca devuelva nulo
	
	Restaurante altaRestaurante (Restaurante restaurante);   //metemos restaurante y nos devuelve restaurante ademas con el id y la fecha
	
	void borrarRestaurante (Long id);   //devuelve void si existe lo borra y sino no existe
	
	Optional<Restaurante> modificarRestaurante (Long id, Restaurante restaurante);  // cogemos el id y los datos del restaurante y nos devuelve si existe o no con optional al igual que la consulta.
	
	
	
	
}

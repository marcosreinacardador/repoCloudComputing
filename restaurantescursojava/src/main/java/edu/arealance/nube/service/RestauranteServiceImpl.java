package edu.arealance.nube.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.arealance.nube.repository.RestauranteRepository;
import edu.arealance.nube.repository.entity.Restaurante;

//Se ha generado con add unimplemented methods lo implementa desde RestauranteService con todos sus metodos que implementa desde RestauranteService

@Service
public class RestauranteServiceImpl implements RestauranteService{
	
	RestauranteRepository restauranteRepository;   //instancia de la base de datos

	@Override
	@Transactional(readOnly = true)   //utilizamos el de spring y no el de Tomcat, permitimos acceso concurrente a a la tabla Restaurantes
	public Iterable<Restaurante> consultarTodos() {  //Se ha generado con add unimplemented methods lo implementa desde RestauranteService
		return this.restauranteRepository.findAll();    //le pido todos los restaurantes a la base de datos y le devuelvo todos los restaurante con iterable findAll()
		//return null;
	}

	@Override
	@Transactional(readOnly = true)   //utilizamos el de spring y no el de Tomcat, permitimos acceso concurrente a a la tabla Restaurantes
	public Optional<Restaurante> consultarRestaurante(Long id) {
		return restauranteRepository.findById(id);
		//turn Optional.empty();
	}

	@Override
	@Transactional   //utilizamos el de spring y no el de Tomcat
	public Restaurante altaRestaurante(Restaurante restaurante) {
		return this.restauranteRepository.save(restaurante);
		//return null;
	}

	@Override
	@Transactional   //utilizamos el de spring y no el de Tomcat
	public void borrarRestaurante(Long id) {
		this.restauranteRepository.deleteById(id);
		
	}

	@Override
	@Transactional   //utilizamos el de spring y no el de Tomcat
	public Optional<Restaurante> modificarRestaurante(Long id, Restaurante restaurante) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	
	
}

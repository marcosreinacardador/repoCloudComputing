package edu.arealance.nube.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.arealance.nube.repository.entity.Restaurante;

@Repository
public interface RestauranteRepository extends CrudRepository<Restaurante, Long>{

	
	
}

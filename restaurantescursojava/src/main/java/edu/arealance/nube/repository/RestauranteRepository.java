package edu.arealance.nube.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.arealance.nube.repository.entity.Restaurante;

@Repository
public interface RestauranteRepository extends CrudRepository<Restaurante, Long>{

	//1 KEY WORD QUERIES - Consultas por palabras clave  *******
	//2 JPQL - HQL - Pseudo SQL pero de JAVA - "Agnóstico"
	//3 NATIVAS - SQL   								 *******
	//		http://localhost:8081/restaurante/BuscarCualquierCosa/Carranque
	@Query(value = "SELECT * FROM bdrestaurantes.restaurantes WHERE "
			+ "barrio LIKE %?1% OR "
			+ "nombre LIKE %?1% OR "
			+ "especialidad1 LIKE %?1% OR "
			+ "especialidad2 LIKE %?1% OR "
			+ "especialidad3 LIKE %?1%;", nativeQuery = true)
	Iterable<Restaurante> buscarPorBarrioNombreOEspecialidad(String clave);
	
	//4 STORE PROCEDURES - Procedimientos Almacenados
	//5 CRITERIA API - SQL pero con métodos de JAVA
	
	
	// Ejemplo con KEY WORD QUERIES - Consultas por palabras clave  *******
	// Obtener restaurantes en un rango de precio 
	
	Iterable<Restaurante> findByPrecioMedioBetween(int preciomin, int preciomax);
	

}

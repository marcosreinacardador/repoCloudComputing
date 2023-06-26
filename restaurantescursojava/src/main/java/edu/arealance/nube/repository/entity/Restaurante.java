package edu.arealance.nube.repository.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "restaurantes", schema = "bdrestaurantes")
public class Restaurante {

	@Id  // Indica a spring que éste será la clave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //autoincemento en Mysql
	private Long id;
	
	private String nombre;
	
	private String direccion;
	
	private String barrio;
	
	private String web;
	
	private String fichaGoogle;
	
	private Float latitud;
	
	private Float longitud;
	
	private Integer precioMedio;
	
	private String especialidad1;
	
	private String especialidad2;
	
	private String especialidad3;
	
	
	
	
	
	
}

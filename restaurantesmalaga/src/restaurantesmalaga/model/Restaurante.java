package restaurantesmalaga.model;

import java.util.Arrays;
import java.util.List;

public class Restaurante implements Comparable<Restaurante> {

	// id¿?
	private String nombre;	
	
	private String direccion;
	private String web;
	private String fichaGoogle;
	private float latitud;
	private float longitud;
	private String barrio;
	private List<String> especialidades;
	private double precioMedio;
	
	
	//Contructor Restaurante vacío
	public Restaurante() {
	
	}
	
		
    //Constructor de parámetros
	public Restaurante(String nombre, String direccion, String web, String fichaGoogle, float latitud, float longitud,
			String barrio, double precioMedio, String ... especialidades) {  // varargs
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.web = web;
		this.fichaGoogle = fichaGoogle;
		this.latitud = latitud;
		this.longitud = longitud;
		this.barrio = barrio;
		this.precioMedio = precioMedio;
		this.especialidades = Arrays.asList(especialidades);
		
	}
	
	
	//generar getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getFichaGoogle() {
		return fichaGoogle;
	}
	public void setFichaGoogle(String fichaGoogle) {
		this.fichaGoogle = fichaGoogle;
	}
	public float getLatitud() {
		return latitud;
	}
	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}
	public float getLongitud() {
		return longitud;
	}
	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}
	public String getBarrio() {
		return barrio;
	}
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	public List<String> getEspecialidades() {
		return especialidades;
	}
	public void setEspecialidades(List<String> especialidades) {
		this.especialidades = especialidades;
	}

	public double getPrecioMedio() {
		return precioMedio;
	}


	public void setPrecioMedio(double precioMedio) {
		this.precioMedio = precioMedio;
	}


	@Override
	public String toString() {
		return "\n" + 
				" nombre= " + nombre + "\n" + 
				" direccion= " + direccion + "\n" + 
				" web= " + web + "\n" + 
				" fichaGoogle= " + fichaGoogle + "\n" + 
				" latitud= " + latitud + "\n" + 
				" longitud= " + longitud + "\n" + 
				" barrio= " + barrio + "\n" + 
				" especialidades= " + especialidades + "\n" + 
				" precio medio= " + precioMedio;
	}
	
	@Override
	public boolean equals(Object obj) {   //vamos hacer el equals de la clase restaurante
		boolean iguales = false;
		
		if(obj != null) 
		{
			if(obj instanceof Restaurante r)    // quiero ver si es un restaurante  si el objeto es una instancia de restaurante si se cumple
			{
				// para mi dos resturantes son iguales si tienen misma dirección
				iguales = this.direccion.equals(r.direccion);    // comparo dos string con equals
			}
		}
		
		return iguales;
	}

	//ordenar por precio medio
	@Override
	public int compareTo(Restaurante o) {   //Compara el objeto this y el objeto Restaurante.
		// TODO Auto-generated method stub
		return (int) (this.getPrecioMedio()-o.getPrecioMedio());
	}
	
}

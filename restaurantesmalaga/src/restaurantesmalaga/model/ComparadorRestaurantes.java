package restaurantesmalaga.model;

import java.util.Comparator;


public class ComparadorRestaurantes implements Comparator<Restaurante>{

	@Override
	public int compare(Restaurante o1, Restaurante o2) {
				// TODO Auto-generated method stub
		
		return o1.getNombre().compareTo(o2.getNombre());
	}

}

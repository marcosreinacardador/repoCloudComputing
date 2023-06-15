package basicos;

public class PruebaTest {

	public int calcula() {
		return 1 + 1;
	}

	public static void main(String[] args) {

		System.out.println("HOLA MÁLAGA");

//		for (int a = 0; (a % 6) < 6; a++) {
//			System.out.println(a);
//		}

		// System.out.println (calcula());
		
		Object cadena = "HOLA";
		
		
		if(cadena instanceof String saludo) {  //pattern matching
			saludo.length();
			String palabra = (String)cadena;
			int longi = palabra.length();
			System.out.println("Cadena es un String de tamaño " + longi);
		} else {
			System.out.println("Cadena NO es un String");
		}
	}

}

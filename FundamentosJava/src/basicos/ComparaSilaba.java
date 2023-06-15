package basicos;

/**
 * 
 * 
 * @author Val
 *
 *El código de esta clase, es un poco misterioso. Algún programador Clase "C", no ha usado
 *nombres descriptivos y ahora, nos toca pegarnos y descubrir qué narices hace este código, 
 *para poder usarlo en nuestro proyecto.
 *
 *
 *Se pide:
 *
 *1) Adivinar la funcionalidad del método adivinaQueHace
 *2) Una vez descubierto, aplicar un nombre apropiado al método y a la clase
 *3) Idear un método equivalente, pero distinto. Es decir, crear un método 
 *que haga lo mismo que adivinaQueHace, pero de otra manera.
 *4) EXTRA: Sólo si resolviste los puntos anteriores, implementa una versión recursiva
 *
 */
public class ComparaSilaba {
	
	private static boolean capicua(String cad)
	{
		boolean bd = true;
		
		int i = 0;
		int j = cad.length()-1;
		
		while ((i<=j)&&(bd))
		{
			bd = cad.charAt(i)==cad.charAt(j);
			i++;
			j--;
		}
		
		return bd;
	}
	
	private static boolean capicua2(String otra) {
		boolean bd=true;
		
		int j = otra.length()-1;
		
		for(int i=0; (i<=j)&&(bd); i++) {
			bd = otra.charAt(i)==otra.charAt(j);
			j--;
		}
		return bd;
	}
	
	  private static boolean verificaPalindromo (String cadena)	{
	      boolean esPalindromo = true;
	      String cadenaMitadUno = "";
	      String cadenaMitadDos = "";
	      String cadenaMitadDosReversed = "";
	      int j = cadena.length();

	      cadenaMitadUno = cadena.substring(0,(j/2));
	      cadenaMitadDos = cadena.substring((j/2));

	      for (int i = 0; i < cadenaMitadDos.length(); i++ ) {
	        cadenaMitadDosReversed = cadenaMitadDos.charAt(i) + cadenaMitadDosReversed;
	      }

	      esPalindromo = cadenaMitadUno.contentEquals(cadenaMitadDosReversed);
	      System.out.println(cadenaMitadUno);
	      System.out.println(cadenaMitadDos);
	      return esPalindromo;
	    }

	 	
		private static boolean esPalindromo2(String cadena) {
			boolean compara = false;
		
			StringBuilder inverso = new StringBuilder(cadena).reverse();
			
			String cadena2 = inverso.toString();
			
			System.out.println(cadena2);//para comprobar que invierte la cadena
			
				if (cadena2.equals(cadena)) {
					compara = true;
				}
				
				return compara;
		}
		

		// metodo recursiva
		
		public static boolean comparaCadenaRecursiva(int inicio, int fin, String cad) {
			
			if (inicio>=fin) {
				return true;
			} else {
				return cad.charAt(inicio) == cad.charAt(fin)
						&& comparaCadenaRecursiva(++inicio, --fin, cad);
			}
			
			
			
			
		}
	
	public static void main(String[] args) {
		if (capicua("poop"))
		{
			System.out.println("VERDADERO");
		} else {
			System.out.println("FALSO");
		}
		
		if (capicua2("JHeeHJ")) {
			System.out.println("OK");
		} else {
			System.out.println("NO OK");
		}
		
		if (verificaPalindromo("poop"))	{
			System.out.println("VERDADERO");
		} else {
			System.out.println("FALSO");
		}
		
		if (esPalindromo2("ramar"))
		{
			System.out.println("ES UN PALINDROMO");
		} else 
		{
			System.out.println("NO ES UN PALINDROMO");
		}
		
		String xpPalabra = new String("romaoamor");
		
		if(comparaCadenaRecursiva(0, xpPalabra.length()-1, xpPalabra)) {
			System.out.println("Es recursivo");
		} else {
			System.out.println("No es recursivo");
		}
	}

}
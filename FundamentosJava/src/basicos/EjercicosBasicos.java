package basicos;

import java.util.Scanner;

/**
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * LISTA DE EJERCICIOS DE REPASO A LA PARTE DE INICIACIÓN EN JAVA:
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 1) HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA SI ESE CARACTER
 * 
 * 
 * 
 * PERTENECE A LA CADENA O NO perteneceACadena
 * 
 * 
 * 
 * 2) HACER UN MÉTODO QUE RECIBA UNA
 * 
 * 
 * 
 * CADENA Y UN CARACTER Y DIGA CÚANTAS VECES APARECE ESE CARACTER EN LA CADENA
 * 
 * 
 * 
 * 2.1) HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA la última
 * 
 * 
 * 
 * posición donde aparece ese caracter en esa cadena. Si no está, devuelve -1
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * "hola" a --> 3 "maja" a --> 3 "conejo" i --> -1
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 3) HACER UN MÉTODO QUE DADO UN NÚMERO, DIGA SI ES PAR O NO esPar
 * 
 * 
 * 
 * 4) HACER UN MÉTODO QUE LE PIDA AL USUARIO SU EDAD Y LE DIGA SI ES MAYOR DE
 * 
 * 
 * 
 * EDAD O NO mayorDeEdad
 * 
 * 
 * 
 * 5) HACER UN MÉTODO QUE RECIBA UNA NOTA DE 0 A 10 Y DIGA
 * 
 * 
 * 
 * SI EQUIVALE A UN APROBADO, BIEN, NOTABLE, O SOBRESALIENTE clasificarNota -
 * 
 * 
 * 
 * 6) HACER UN MÉTODO QUE RECIBA UNA CADENA Y LA DEVUELVA ALREVÉS invertirCadena
 * 
 * 
 * 
 * 7) HACER UN PROGRAMA QUE MUESTRE LA SECUENCIA 3, 6, 9, 12, 15 ...99
 * deTresEnTres
 *
 *
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * // DEFINO UN MÉTODO // DARLE UN NOMBRE - camelCase // ID la entrada - // ID
 * 
 * 
 * 
 * la salida -
 *
 * 
 * 
 * 
 * 
 * 
 * 
 * //pensar el los pasos en esapñol en psuedocódigo
 * 
 * 
 * 
 */

public class EjercicosBasicos {

	/*
	 * 
	 * 1) HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA SI ESE CARACTER
	 * 
	 * 
	 * 
	 * PERTENECE A LA CADENA O NO perteneceACadena
	 * 
	 */

	public static boolean perteneceACadena(String cadena, char caracter) { // el metodo pertenececadena recibe una

		// cadena y un carácter

		return cadena

				.contains(String.valueOf(caracter)); /*
														 * 
														 * Utiliza el método contains de la clase String para verificar
														 * 
														 * si la cadena contiene el carácter especificado.
														 * 
														 * 
														 * 
														 * Si es así, devuelve true; de lo contrario, devuelve false.
														 * 
														 */

		/*
		 * 
		 * boolean in = true;
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * in = cadena.contains(car+"");
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * return in
		 * 
		 * 
		 * 
		 */

	}

	/*
	 * 
	 * 2) HACER UN MÉTODO QUE RECIBA UNA
	 * 
	 * 
	 * 
	 * CADENA Y UN CARACTER Y DIGA CÚANTAS VECES APARECE ESE CARACTER EN LA CADENA
	 * 
	 * 
	 * 
	 */

	public static int cuentaVeces(String cadena, char caracter) {

		int contador = 0;
		int longitud = cadena.length();
		
		for (int i = 0; i < longitud; i++) {

			if (cadena.charAt(i) == caracter) {

				contador++;

			}

		}

		return contador;

	}

	/*
	 * 
	 * 2.1) HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA la última
	 * posición donde aparece ese caracter en esa cadena. Si no está, devuelve -1
	 * "hola" a --> 3 "maja" a --> 3 "conejo" i --> -1
	 * 
	 */

	public static int ultimaSilaba(String cadena, char caracter) {

		
		  int posUltima= -1;
		  
		  	posUltima = cadena.lastIndexOf(caracter);
		  
		  return posUltima;
		 
/*		for (int i = cadena.length() - 1; i >= 0; i++) {

			if (cadena.charAt(i) == caracter) {

				return i;

			}

		}

		return -1;
*/
	}

	/*
	 * 
	 * 3) HACER UN MÉTODO QUE DADO UN NÚMERO, DIGA SI ES PAR O NO esPar
	 * 
	 */

	public static boolean esPar(int numero) {
		
		return (numero % 2 == 0);
//
//		if (numero % 2 == 0) {
//
//			System.out.println(" Par");
//
//		} else {
//
//			System.out.println(" Impar");
//
//		}

		
		
	/*  4) HACER UN MÉTODO QUE LE PIDA AL USUARIO SU EDAD Y LE DIGA SI ES MAYOR DE
		 * EDAD O NO mayorDeEdad  */
	}
		public static void pideEdad() {
			
			Scanner scanner = null;
			int edad = 0;
			String mensaje = null;
			
			scanner = new Scanner(System.in);
			System.out.println("Introduzca la edad: ");
			edad = scanner.nextInt();
			
			mensaje = (edad<=18) ? "MAYOR DE EDAD" : "MENOR DE EDAD";
			System.out.println(mensaje);
			
		}

	/*	5) HACER UN MÉTODO QUE RECIBA UNA NOTA DE 0 A 10 Y DIGA
 	 * 	SI EQUIVALE A UN APROBADO, BIEN, NOTABLE, O SOBRESALIENTE clasificarNota -
	 * 
	 */
		
		public static String traducirNota(int nota) {
			
			String notaAlfabetica = null;
			
				notaAlfabetica = switch (nota) {
						case 0, 1, 2, 3, 4 -> "SUSPENSO";
						case 5 -> "APROBADO";
						case 6 -> "BIEN";
						case 7, 8 -> "NOTABLE";
						case 9, 10 -> "SOBRESALIENTE";
						default -> "ERROR";
					};
					return notaAlfabetica;
				}
			
		 //6) HACER UN MÉTODO QUE RECIBA UNA CADENA Y LA DEVUELVA ALREVÉS invertirCadena
		
	 public static String inverterCadena(String cad) {
		 
		 String cadreves = null;
		 
		 	cadreves = new StringBuilder(cad).reverse().toString();
		 
		 return cadreves;
	 }
		
	// 7) HACER UN PROGRAMA QUE MUESTRE LA SECUENCIA 3, 6, 9, 12, 15 ...99 deTresEnTres
	 
	 public static void mostrarSecuencia() {
		 int i = 3;
		 System.out.print(i);
		 for ( ; i <= 99; i+=3) {
			 System.out.print(", " + i);
		 }
	 }
	 
	 
	//*************************************************************************************************************
	// Main

	public static void main(String[] args) {

		String cadena = "Gato";

		char caracter = 'o';
		
		Scanner sc = new Scanner(System.in);

		// primer ejercicio cccc

		if (perteneceACadena(cadena, caracter)) {

			System.out.println("El caracter " + caracter + " pertenece a la cadena " + cadena);

		} else {

			System.out.println("El caracter " + caracter + " no coincide con ninguna palabra " + cadena);

		}

		// segundo ejercicio

		int cantidad = cuentaVeces(cadena, caracter);

		System.out.println("El caracter " + caracter + " aparece " + cantidad + " veces");

		// tercer ejercicio

		int ultimaPosicion = ultimaSilaba(cadena, caracter);

		if (ultimaPosicion != -1)

			System.out.println("El caracter " + caracter +

					" aparece en la cadena " + cadena +

					" en la posicion: " + ultimaPosicion);

		// cuarto ejercicio

		System.out.println("Introduce número: ");

		int metoNumero = sc.nextInt();

		System.out.println("El número " + metoNumero + " es ");

		esPar(metoNumero);
		
				
		//sexto ejercicio
		System.out.println(traducirNota(8));

		//septimo ejercicio
		mostrarSecuencia();
		
		
		
	}

}

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

		for (int i = 0; i < cadena.length(); i++) {

			if (cadena.charAt(i) == caracter) {

				contador++;

			}

		}

		return contador;

	}

	/*
	 * 
	 * 2.1) HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA la última
	 * 
	 * 
	 * 
	 * posición donde aparece ese caracter en esa cadena. Si no está, devuelve -1
	 * 
	 * 
	 * 
	 * "hola" a --> 3 "maja" a --> 3 "conejo" i --> -1
	 * 
	 */

	public static int ultimaSilaba(String cadena, char caracter) {

		for (int i = cadena.length() - 1; i >= 0; i++) {

			if (cadena.charAt(i) == caracter) {

				return i;

			}

		}

		return -1;

	}

	/*
	 * 
	 * 3) HACER UN MÉTODO QUE DADO UN NÚMERO, DIGA SI ES PAR O NO esPar
	 * 
	 */

	public static void numeroPar(int numero) {

		if (numero % 2 == 0) {

			System.out.println(" Par");

		} else {

			System.out.println(" Impar");

		}
		
		
	/*  4) HACER UN MÉTODO QUE LE PIDA AL USUARIO SU EDAD Y LE DIGA SI ES MAYOR DE
		 * 
		 * 
		 * 
		 * EDAD O NO mayorDeEdad  */
	}
		public static void pideEdad(int edad) {
			if (edad >= 18) {
				System.out.println("Eres mayor de edad");
			} else {
				System.out.println("Eres menor de edad");
			}
		}

	/*	5) HACER UN MÉTODO QUE RECIBA UNA NOTA DE 0 A 10 Y DIGA
 	 * 	SI EQUIVALE A UN APROBADO, BIEN, NOTABLE, O SOBRESALIENTE clasificarNota -
	 * 
	 */
		
		public static String clasificarNota(int nota, String calificacion) {
			
			if( nota >= 5 & nota <= 6 ) {
				System.out.println("Estas aprobado por los pelos");
			} else if (nota > 6 & nota <= 7) {
				System.out.println("Tienes un BIEN");
			} else if (nota > 7 & nota <= 8) {
				System.out.println("Tienes un NOTABLE");
			}else if (nota > 8 & nota <= 10) {
				System.out.println("Tienes un SOBRESALIENTE");	
			} else {
				System.out.println("Estas SUSPENSO");
			}
			return calificacion;
		}
		
		
	
	//*************************************************************************************************************
	// Main

	public static void main(String[] args) {

		String cadena = "Gato";

		char caracter = 'o';
		
		int nota = 8;

		Scanner sc = new Scanner(System.in);

		// primer ejercicio

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

		numeroPar(metoNumero);
		
		//quinto ejercicio
		
		System.out.println("Introduce tu edad: ");
		int metoEdad = sc.nextInt();
		
		pideEdad(metoEdad);
		
		//sexto ejercicio
		
		
		clasificarNota(nota, calificacion);
		

	}

}

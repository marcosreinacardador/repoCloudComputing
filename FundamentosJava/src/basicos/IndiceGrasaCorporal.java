package basicos;

import java.util.Scanner;

/*
 * TODO
 * HACED UNA APLICACIÓN QUE PERMITA INTRODUCIR AL USUARIO
 * SU ESTATURA EN METROS Y SU PESO EN KG Y LE INFORME SU 
 * INFORME DE SU ÍNDICE DE MASA CORPORAL (IMC) SEGÚN LA SIGUIENTE FÓRMULA
 * 
 * LA FÓRMULA DEL IMC = PESO KG / ESTATURA AL CUADRADO METROS
 *  * SI IMC < 16 ->> su imc es DESNUTRIDO
 * SI IMC >= 16 Y < 18  ->> su imc es DELGADO
 * SI IMC >= 18 Y < 25  ->> su imc es IDEAL
 * SI IMC >= 25 Y < 31  ->> su imc es SOBREPESO
 * SI IMC >= 31 ->> su imc es OBESO
 ADEMÁS, DE DECIRLE SU IMC NUMÉRICO Y NOMINAL,
pista: PARA LEER DE TECLADO USAD LA CLASE SCANNER
  */

public class IndiceGrasaCorporal {
	
	public static double pideDatos() {
		double imc = 0;
		double peso = 0;
		double altura = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Intruduzca PESO: ");
		peso = scanner.nextDouble();
		System.out.println("introduzca ALTURA");
		altura = scanner.nextDouble();
		
		imc = peso / Math.pow(altura, 2);
		
		System.out.println("Tu altura: " + altura + 
		           " y tu peso: " + peso +
		           " tu IMC es de: " + Math.round(imc) +
		           " entonces, estoy  ");
		
		if ( Math.round(imc) < 16 ) {
			System.out.println("Desnutrido");
		} else if ( Math.round(imc) >= 16 & Math.round(imc) < 18 ) {
			System.out.println("Delgado");
		} else if ( Math.round(imc) >= 18 & Math.round(imc) < 25 ) {
			System.out.println("Ideal");
		} else if ( Math.round(imc) >= 25 & Math.round(imc) < 31 ) {
			System.out.println("Sobrepeso");
		} else if (Math.round(imc) > 31 ) {
			System.out.println("Obeso");
		}
		
		
		
		return imc;
	}

	public static void main(String[] args) {
		
		pideDatos();

	}

}

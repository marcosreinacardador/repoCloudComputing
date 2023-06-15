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

public class indiceGrasaCorporal {
	
	public static double pideDatos() {
		double imc = 0.0;
		double peso = 0.0;
		double altura = 0.0;
		
		Scanner metePeso = null;
		Scanner meteAltura = null;
		
		System.out.println("Intruduzca PESO: ");
		metePeso = new Scanner(System.in);
		System.out.println("introduzca ALTURA");
		meteAltura = new Scanner(System.in);
		
		return imc;
	}

	public static void main(String[] args) {
		

	}

}

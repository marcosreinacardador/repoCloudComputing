package basicos;

import java.util.Scanner;

public class ResultadoIMC {

	public static void main(String[] args) {
		
		//Creamos instancia de PideDatos
		PideDatos pd = new PideDatos();
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Intruduzca PESO: ");
		pd.setPeso(scanner.nextDouble());
		System.out.println("Introduzca ALTURA (kg): ");
		pd.setAltura(scanner.nextDouble());

		double resultadoIMC = pd.calculaIMC(pd.getPeso() / pd.getAltura());
		double imc = Math.round(resultadoIMC);
		
		System.out.println(pd.toString() + " -->  IMC: " + imc + "\n tu constitución es : ");
		
		if ( imc < 16 ) {
			System.out.println(" Desnutrido");
		} else if ( imc >= 16 & imc < 18 ) {
			System.out.println(" Delgado");
		} else if ( imc >= 18 & imc < 25 ) {
			System.out.println(" Ideal");
		} else if ( imc >= 25 & imc < 31 ) {
			System.out.println(" Sobrepeso");
		} else if (imc > 31 ) {
			System.out.println(" Obeso");
		}
		
	}

}

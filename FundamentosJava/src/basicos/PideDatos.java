package basicos;

public class PideDatos {

	//Parámetros
	private double peso;
	private double altura;
	
	//Construcotr vacio
	public PideDatos(){
		
	}
	
	//Constructor copia
	public PideDatos(PideDatos pd) {
		this.peso = pd.peso;
		this.altura = pd.altura;
		
	}
	
	//Contructor parametros
	public PideDatos(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	
	//getters y setters
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	
	@Override
	public String toString() {
		String datos = "Los datos para calcular tu IMC son:  peso= " + peso + ", altura= " + altura ;
		return datos;
	}
	
	
	/*
	 * metodo que calcule imc al INTRODUCIR AL USUARIO
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
	
	public double calculaIMC(double imc) {
		
		double resultado = peso / Math.pow(altura, 2);
		
		return resultado;
	}
	
	
	
}

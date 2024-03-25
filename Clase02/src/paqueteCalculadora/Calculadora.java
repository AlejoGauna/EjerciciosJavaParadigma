/*
 * Calculadora

		Crea una clase llamada Calculadora que tenga métodos para realizar operaciones
		matemáticas simples, como suma, resta, multiplicación y división.
		Los métodos deben aceptar dos números como parámetros y devolver el resultado de la
		operación.
		Crea un Main para probar que la Calculadora funciona correctamente:
*/


package paqueteCalculadora;

public class Calculadora {
	
	public static void main(String[] arg) {
		System.out.println("Prueva de copilacion...");
		System.out.println("Compilacion exitosa.");
		
		double resultadoSuma = Calculadora.sumar(5,3);
		System.out.println("Suma: " + resultadoSuma);
		
		double resultadoResta = Calculadora.restar(5,3);
		System.out.println("Resta: " + resultadoResta);
		
		double resultadoMultiplicacion = Calculadora.multiplicar(5,3);
		System.out.println("Multiplicacion: " + resultadoMultiplicacion);
		
		double resultadoDividsion = Calculadora.dividir(6,3);
		System.out.println("Division: " + resultadoDividsion);
		
		System.out.println("Fin del Programa.");
	}
	
	//Metodos:
	private static int sumar(int x, int y) {
		return x + y;
	}
	
	private static int restar(int x, int y) {
		int res = x - y;
		
		if (res < 0) {
			System.out.println("Lo siento pero no se puede obtener numeros negativos en la resta...");
			return 0;
		}else {
			return res;
		}	
		
	}
	
	private static int multiplicar(int x, int y) {
		return x * y;
		
	}
	
	private static int dividir(int x, int y) {
		if (y == 0) {
			System.out.println("No se puede dividir un numero por cero...");
			return 0;
		}
		else {
			return x / y;
		}
	}
	
	
}

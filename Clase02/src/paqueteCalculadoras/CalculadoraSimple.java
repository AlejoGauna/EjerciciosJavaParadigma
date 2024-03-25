
//Clase de Calculadora Simple:
package paqueteCalculadoras;

public class CalculadoraSimple{
	
		//Metodos:
	//suma
	public static double sumar(int x, int y) {
		return x + y;
	}

	//resta
	public static double restar(int x, int y) {
		double res = x - y;
		if (res < 0) {
			System.out.println("Lo siento, pero no se puede obtener números negativos en la resta...");
			return 0;
		}else {
			return res;
		}
	}

	//multiplicacion
	public static double multiplicar(int x, int y) {
		return x * y;
	}

	//division
	public static double dividir(int x, int y) {
		if (y == 0) {
			System.out.println("No se puede dividir por un numero por cero...");
			return 0;
		}else {
			return (double) x / y;
		}
	}
}

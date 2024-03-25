package paqueteCalculadoras;

//Clase extendida de Calculadora Avanzada:
public class CalculadoraAvanzada extends CalculadoraSimple{
	
	//Constructor.
	public CalculadoraAvanzada() {
		System.out.println("Inicioando la calculadora avanzada..");
		
	}
	
					//Metodos:
	//modulo
	public double modulo(int x, int y) {
		return x % y;
	}
	//raiz
	
	public double raiz(int x) {
      return Math.sqrt(x);  
	}
	
	//potencia
	public double potencia(int x, int y) {
      return Math.pow(x, y);
	}
}

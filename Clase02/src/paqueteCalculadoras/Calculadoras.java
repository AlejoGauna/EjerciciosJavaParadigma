/*
 * Calculadora avanzada
		Ahora debes modificar la clase creada en el ejercicio anterior (copiala para no perder el
		ejercicio 1) para que cumpla los siguientes requisitos:
		● Pueden crearse calculadoras básicas que operan de la misma manera que la
		anterior (suma, resta, multiplicacion y division)
		● Pero también puede crearse calculadoras avanzadas, las cuales además de la
		operaciones básicas, también ofrecen cálculos como el Módulo, la Raíz cuadrada y
		la potencia.
		● El programa debe poder decidir utilizar una calculadora u la otra
		● ¡Recuerda reutilizar código!
		Aqui te dejo el main de ejemplo:
 * */


//Clase principal main, solo estan:
		//las llamadas de metodos.
		//la creacion de objetos.
		//las impresiones.

package paqueteCalculadoras;

public class Calculadoras {
	
	public static void main(String[] arg) {
		System.out.println("Prueva de compilacion...");
		System.out.println("Prueva exitosa.");
		
		CalculadoraAvanzada miCalculadoraAvanzada = new CalculadoraAvanzada();
		double resultadoSuma = miCalculadoraAvanzada.sumar(3,3);
		double resultadoResta  = miCalculadoraAvanzada.restar(3,3);
		double resultadoMultiplicacion  = miCalculadoraAvanzada.multiplicar(3,3);
		double resultadoDivision  = miCalculadoraAvanzada.dividir(6,3);
		double resultadoModulo  = miCalculadoraAvanzada.modulo(7,3);
		double resultadoRaiz  = miCalculadoraAvanzada.raiz(9);
		double resultadoPotencia  = miCalculadoraAvanzada.potencia(2,3);
		
		//impresiones:
		System.out.println("---Resultados de la Calculadora Avanzada");
		System.out.println("Resutlado Suma : " + resultadoSuma);
		System.out.println("Resutlado Resta : " + resultadoResta);
		System.out.println("Resutlado Multiplicacion : " + resultadoMultiplicacion);
		System.out.println("Resutlado Division : " + resultadoDivision);
		System.out.println("Resutlado Modulo : " + resultadoModulo);
		System.out.println("Resutlado Riz Cuadrada : " + resultadoRaiz);
		System.out.println("Resutlado Potencia : " + resultadoPotencia);
		
		
		CalculadoraSimple miCalculadoraSimple = new CalculadoraSimple();
		double resultadoSumaSimple = miCalculadoraSimple.sumar(5,3);
		double resultadoRestaSimpe = miCalculadoraSimple.restar(5,3);
		double resultadoMultiplicacionSimple = miCalculadoraSimple.multiplicar(5,3);
		double resultadoDivisionSimple = miCalculadoraSimple.dividir(6,3);
		
		//impresiones:
		System.out.println("---Resultados de la Calculadora Simple---:");
		System.out.println("Resutlado Suma : " + resultadoSumaSimple);
		System.out.println("Resutlado Resta : " + resultadoMultiplicacionSimple);
		System.out.println("Resutlado Multiplicacion : " + resultadoMultiplicacionSimple);
		System.out.println("Resutlado Division : " + resultadoDivisionSimple);
		
		System.out.println("Fin del Progama.");
	}
	

}

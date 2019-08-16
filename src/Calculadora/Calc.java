package Calculadora;

import java.util.Scanner;

public class Calc {
	private static Scanner in;

	public static float calcula(String opr, float numero1, float numero2) {
		 float resultado = 0;
		
		if (opr.equals("+")) {
			resultado = soma(numero1,numero2);
		} else if (opr.equals("*")) {
			resultado = multiplica(numero1, numero2);
		} else if (opr.equals("-")) {
			resultado = subtrai(numero1, numero2);
		} else if (opr.equals("/")) {
			resultado = diivide(numero1, numero2);
		}
		
		return resultado;

	}
	
	private static float subtrai(float numero1,float numero2) {
		float resultado = numero1 - numero2;
		System.out.println("A subtração " + resultado);
		return resultado;
	}
	
	private static float soma(float numero1,float numero2) {
		float resultado = numero1 + numero2;
		System.out.println("A soma " + resultado);
		return resultado;
	}
	
	private static float diivide(float numero1,float numero2) {
		float resultado = numero1 * numero2;
		System.out.println("A divisão " + resultado);
		return resultado;
	}
	
	private static float multiplica(float numero1,float numero2) {
		float resultado = numero1 * numero2;
		System.out.println("A multiplicação " + resultado);
		return resultado;
	}

}

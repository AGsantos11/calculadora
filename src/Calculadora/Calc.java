package Calculadora;
import java.util.Scanner;

public class Calc {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		float numero1, numero2;
		System.out.println("	Bem vindo a calculadora 1.0");
		System.out.println("-----------------------------------------------");
		System.out.println("Digite o primeiro valor: ");
		numero1 = in.nextFloat();
		System.out.println("Qual a operação desejada? +,-,/,*");
		String opr = in.next();
		System.out.println("Digite o segundo valor :");
		numero2 = in.nextFloat();
		//correção do tiago
		if (opr.equals("+")) {
			float resultado = numero1+numero2;
			System.out.println("A soma é " +resultado);
		}else if (opr.equals("*")) {
			float resultado = numero1*numero2;
			System.out.println("A multiplicação é " + resultado);
		}else if(opr.equals("-")) {
			float resultado = numero1-numero2;
			System.out.println("A subtração é " + resultado);
		}else if(opr.equals("/")) {
			float resultado = numero1/numero2;
			System.out.println("A divisão é " + resultado);
		

	}
	
}
}

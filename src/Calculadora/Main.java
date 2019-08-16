package Calculadora;

import java.util.Scanner;

public class Main {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		apresentacao();				
		float numero1 = pergunta("Digite o primeiro valor: ");
		String opr = perguntaOpr("Qual a operação desejada? +,-,/,*");
		float numero2 = pergunta("Digite o segundo valor :");
		Calc.calcula(opr,numero1,numero2);
	}
	
	private static float pergunta(String p) {
				System.out.println(p);
		return in.nextFloat();
	}
	
	private static String perguntaOpr(String p) {
		System.out.println(p);
		return in.next();
		
	}
	
	private static void apresentacao() {
		System.out.println("	Bem vindo a calculadora 1.0");
		System.out.println("-----------------------------------------------");
	}
}

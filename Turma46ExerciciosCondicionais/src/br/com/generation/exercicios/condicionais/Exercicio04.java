package br.com.generation.exercicios.condicionais;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		double n1, mod,res = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		n1 = entrada.nextDouble();
		
		mod = n1%2;
		
		if(mod == 0) {
			
			System.out.println("O número digitado é Par!!!");
			res = Math.sqrt(n1);
			System.out.println("Sua raiz quadrada é: " + res);
			
			
		}else {
			
			System.out.println("O número digitado é Impar!!!");
			res = Math.pow(n1, 2);
			System.out.println("Ele ao quadrado é: " + res);
			
		}
		
		entrada.close();
	}

}

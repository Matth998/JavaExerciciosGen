package br.com.generation.laco.repeticao;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		int num, soma = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		num = entrada.nextInt();
		
		do {
			
			soma+=num;
			System.out.println("Digite um n�mero: ");
			num = entrada.nextInt();
			
		}while(num != 0);
			
		
		System.out.println("A soma dos n�meros digitados � igual �: " + soma);
		
		entrada.close();

	}

}

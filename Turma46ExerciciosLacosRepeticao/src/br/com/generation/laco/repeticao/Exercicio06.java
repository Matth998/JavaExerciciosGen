package br.com.generation.laco.repeticao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		int num,contador = 0, soma = 0;
		double media;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = entrada.nextInt();
		
		do {
			
			if(num%3 == 0) {
				
				soma+=num;
				contador++;
				
			}
			
			System.out.println("Digite um número: ");
			num = entrada.nextInt();
			
		}while(num != 0);
		
		media = soma/contador;
		
		System.out.println("A média dos multiplos de 3 digitados é: " + media);
		
		entrada.close();

	}

}

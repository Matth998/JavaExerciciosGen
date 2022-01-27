package br.com.generation.laco.repeticao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int idade;
		int menos = 0;
		int mais = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		idade = entrada.nextInt();
		
		while(idade != -99) {
			
			if (idade < 21 && idade > 0) {
				
				menos++;
				
			}
			if (idade > 50) {
				
				mais++;
				
			}
			
			System.out.println("Digite sua idade: ");
			idade = entrada.nextInt();
			
		}
		
		System.out.println("O número de pessoas com menos de 21 anos é de: " + menos +
				"\nO número de pessoas com mais de 50 anos é de: " + mais);
		entrada.close();
	}

}

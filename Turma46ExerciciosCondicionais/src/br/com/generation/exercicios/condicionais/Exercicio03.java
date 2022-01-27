package br.com.generation.exercicios.condicionais;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int idade;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		idade = entrada.nextInt();
		
		while(idade < 10 || idade > 25) {
			
			System.out.println("Aceitamos pessoas com idades de 10 a 25 anos, por favor, digite novamente.");
			idade = entrada.nextInt();
			
		}
		
		if(idade >= 10 && idade <=14) {
			
			System.out.println("Você está na categoria Infantil.");
			
		}
		if(idade >= 15 && idade <=17) {
			
			System.out.println("Você está na categoria juvenil.");
			
		}
		if(idade >= 18 && idade <= 25) {
			
			System.out.println("Você está na categoria adulto.");
			
		}

		entrada.close();
	}

}

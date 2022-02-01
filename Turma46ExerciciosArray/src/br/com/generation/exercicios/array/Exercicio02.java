package br.com.generation.exercicios.array;

import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) throws InterruptedException {
		
		int[] dado = new int[10];
		int maior =0;
		double soma = 0, media;
		int cont, num;
		Random gerador = new Random();
		
		
		for(cont = 0; cont < dado.length; cont++) {
		
			num = gerador.nextInt(7);
			
			if(num != 0) {
				
				dado[cont] = num;
				
			}else {
				
				dado[cont] = 1;
				
			}
				
			if(dado[cont] == 6) {
				
				maior++;
				
			}
			
			soma += dado[cont];
			
			System.out.println("Caiu o número: " + dado[cont]);
			
			Thread.sleep(500);
			
		}
		
		System.out.println(soma);
		
		media = soma/cont;
		
		System.out.println("A média dos valores foi de: " + media +
				"\nE o número de vezes que caiu o maior número (6) foi de: " + maior);

	}

}

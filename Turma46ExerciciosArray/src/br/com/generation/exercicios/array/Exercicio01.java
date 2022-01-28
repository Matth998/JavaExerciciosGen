package br.com.generation.exercicios.array;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		double[] placar = new double[5];
		double maior = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite as 5 pontuações obtidas.");
		
		for(int i = 0; i < placar.length; i++) {
			
			placar[i] = entrada.nextDouble();
			
			System.out.println((i+1) + "ª pontuação: " + placar[i]);
			
			if(placar[i] > maior) {
				
				maior = placar[i];
				
			}
		}
		
		for(int i = 0; i < placar.length; i++) {
			
			System.out.println("[" + placar[i] + "]");
			
		}
		
		System.out.println("A maior pontuação foi: " + maior);
		
		entrada.close();

	}

}

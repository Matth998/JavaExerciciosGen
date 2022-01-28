package br.com.generation.exercicios.array;

import java.util.Random;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int[][] n1 = new int[4][6];
		int[][] n2 = new int[4][6];
		int[][] m1 = new int[4][6];
		int[][] m2 = new int[4][6];
		Random gerador = new Random();
		
		for(int l = 0; l < n1.length; l++) {
			
			for(int c = 0; c <n1[l].length; c++) {
				
				n1[l][c] = gerador.nextInt(100);
				n2[l][c] = gerador.nextInt(100);
				m1[l][c] = n1[l][c] + n2[l][c];
				m2[l][c] = n1[l][c] - n2[l][c];
				
			}
			
		}
		
		for(int a = 0; a <= 3; a++) {
			
			for(int l = 0; l < n1.length; l++) {
				
				for(int c = 0; c < n1[l].length; c++) {
					
					if(a == 0) {
						
						System.out.printf("[" + n1[l][c]+ "]");
						
					}
					
					if(a == 1) {
						
						System.out.printf("[" + n2[l][c]+ "]");
						
					}
					
					if(a == 2) {
						
						System.out.printf("[" + m1[l][c]+ "]");
						
					}
					
					if(a == 3) {
						
						System.out.printf("[" + m2[l][c]+ "]");
						
					}
					
				}
				
				System.out.println();
				
			}
			
			System.out.println();
			
		}
		
		
		

	}

}

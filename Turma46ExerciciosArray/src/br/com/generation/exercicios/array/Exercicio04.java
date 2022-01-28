package br.com.generation.exercicios.array;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int[][] array = new int[3][3];
		int soma = 0, somaDiag = 0;
		Scanner entrada = new Scanner(System.in);
		
		for(int l = 0; l < array.length; l++) {
			
			for(int c = 0; c < array[l].length; c++) {
				
				System.out.println("Digite um valor: ");
				array[l][c] = entrada.nextInt(); 
				
				soma += array[l][c];
				
			}
			
		}
		
		for(int l = 0; l < array.length; l++) {
			
			for(int c = 0; c < array[l].length; c++) {
				
				System.out.print("[" + array[l][c] + "]");
				
			}
			System.out.println();
		}
		
		somaDiag = array[0][0] + array[1][1] + array[2][2];
		
		System.out.println("A soma da matriz é: " + soma +
				"\nA soma da primeira diagonal é: " + somaDiag);
		
		entrada.close();

	}

}

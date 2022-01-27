package br.com.generation.exercicios.condicionais;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int n1, n2, n3;
		int maior = 0;
		int meio = 0;
		int menor = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite 3 números.");
		System.out.println("Número 1: ");
		n1 = entrada.nextInt();
		
		System.out.println("Número 2: ");
		n2 = entrada.nextInt();
		
		System.out.println("Número 3: ");
		n3 = entrada.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			
			maior = n1;
			
			if(n2 > n3) {
				
				meio = n2;
				menor = n3;
				
			}else {
				
				meio = n3;
				menor = n2;
				
			}
			
		}
		
		if(n2 > n1 && n2 > n3) {
			
			maior = n2;
			
			if(n1 > n3) {
				
				meio = n1;
				menor = n3;
				
			}else {
				
				meio = n3;
				menor = n1;
				
			}
			
		}
		
		if(n3 > n1 && n3 > n2) {
			
			maior = n3;
			
			if(n1 > n2) {
				
				meio = n1;
				menor = n2;
				
			}else {
				
				meio = n2;
				menor = n1;
				
			}
			
		}
		
		System.out.println("Os números digitados em ordem crescente fica: " + maior + ", " + 
		meio + ", "+ menor + ".");
		
		entrada.close();

	}

}

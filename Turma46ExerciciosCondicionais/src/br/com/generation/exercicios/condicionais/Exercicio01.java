package br.com.generation.exercicios.condicionais;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int n1, n2, n3, maior = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite 3 n�meros.");
		System.out.println("N�mero 1: ");
		n1 = entrada.nextInt();
		
		System.out.println("N�mero 2: ");
		n2 = entrada.nextInt();
		
		System.out.println("N�mero 3: ");
		n3 = entrada.nextInt();
		
		if(n1 >= maior) {
			
			maior = n1;
			
		}
		if(n2 >= maior) {
			
			maior = n2;
			
		}
		if(n3 >= maior) {
			
			maior = n3;
			
		}

		System.out.println("O maior n�mero digitado foi o n�mero: " + maior);
		
		entrada.close();
		
	}

}

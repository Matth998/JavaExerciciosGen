package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		double a, b, c, r, s, d;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite três número.");
		System.out.println("Primeiro número: ");
		a = leia.nextInt();
		
		System.out.println("Segundo número: ");
		b = leia.nextInt();
		
		System.out.println("terceiro número: ");
		c = leia.nextInt();
		
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		
		d = (r+s)/2;
		
		System.out.println("O nosso resultado é de: " + d);
		
		leia.close();
		
		
	}
	
}

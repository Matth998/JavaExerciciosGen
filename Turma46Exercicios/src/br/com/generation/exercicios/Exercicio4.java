package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		double a, b, c, r, s, d;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite tr�s n�mero.");
		System.out.println("Primeiro n�mero: ");
		a = leia.nextInt();
		
		System.out.println("Segundo n�mero: ");
		b = leia.nextInt();
		
		System.out.println("terceiro n�mero: ");
		c = leia.nextInt();
		
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		
		d = (r+s)/2;
		
		System.out.println("O nosso resultado � de: " + d);
		
		leia.close();
		
		
	}
	
}

package br.com.generation.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] arg) {
		
		double a, b, c, d, e, f, x, y;
		Scanner leia = new Scanner(System.in);
		DecimalFormat formatado = new DecimalFormat("0.00");
		
		System.out.println("Escreva os coeficientes.");
		System.out.println("Coeficiente A: ");
		a = leia.nextDouble();
		
		System.out.println("Coeficiente B: ");
		b = leia.nextDouble();
		
		System.out.println("Coeficiente C: ");
		c = leia.nextDouble();
		
		System.out.println("Coeficiente D: ");
		d = leia.nextDouble();
		
		System.out.println("Coeficiente E: ");
		e = leia.nextDouble();
		
		System.out.println("Coeficiente F: ");
		f = leia.nextDouble();
		
		x = ((c*f) - (b*f)) / ((a*e - b*d));
		y = ((a*f) - (c*d)) / ((a*e - b*d));
		
		System.out.println("O valor de X é: " + formatado.format(x));
		System.out.println("O valor de y é: " + formatado.format(y));
		
		leia.close();
		
	}
	
}

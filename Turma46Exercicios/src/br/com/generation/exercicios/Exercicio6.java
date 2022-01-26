package br.com.generation.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] arg) {
		
		double x1, x2, y1, y2, d;
		Scanner leia = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		System.out.println("Digite os pontos do plano cartesiano.");
		System.out.println("Digite o x1: ");
		x1 = leia.nextDouble();
		
		System.out.println("Digite o x2: ");
		x2 = leia.nextDouble();
		
		System.out.println("Digite o y1: ");
		y1 = leia.nextDouble();
		
		System.out.println("Digite o y2: ");
		y2 = leia.nextDouble();
		
		d = Math.sqrt(Math.pow((x1+x2), 2) + Math.pow(y1+y2, 2));
		
		System.out.println("A distância entre eles é: " + formatador.format(d));
		
		leia.close();
		
		
	}

	
	
}

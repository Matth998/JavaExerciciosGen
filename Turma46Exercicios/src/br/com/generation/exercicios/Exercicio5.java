package br.com.generation.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		double n1, n2, n3, media;
		Scanner leia = new Scanner(System.in);
		DecimalFormat formatado = new DecimalFormat("0.0");
		
		System.out.println("Nota 1: ");
		n1 = leia.nextDouble();
		
		while(n1 < 0 || n1 > 10) {
			
			System.out.println("Nota invalida, Digite Novamente!");
			System.out.println("Nota 1: ");
			n1 = leia.nextDouble();
			
		}
		
		System.out.println("Nota 2: ");
		n2 = leia.nextDouble();
		
		while(n2 <0 || n2 > 10){
			
			System.out.println("Nota invalida, Digite Novamente!");
			System.out.println("Nota 2: ");
			n2 = leia.nextDouble();
			
		}
		
		System.out.println("Nota 3: ");
		n3 = leia.nextDouble();
		
		while(n3 < 0 || n3 > 10){
			
			System.out.println("Nota invalida, Digite Novamente!");
			System.out.println("Nota 3: ");
			n3 = leia.nextDouble();
		}
		
		media = (n1*2 + n2 * 3 + n3 * 5)/(2+3+5);
		System.out.println("A média do aluno é: " + formatado.format(media));
				
		leia.close();

	}

}

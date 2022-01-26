package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		final short diasNoAno = 365;
		final short diasNoMes = 30;
		short dias, meses,anos;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade.");
		System.out.println("Anos: ");
		anos = leia.nextShort();
		
		System.out.println("Meses: ");
		meses = leia.nextShort();
		
		System.out.println("Dias: ");
		dias = leia.nextShort();
		
		dias += (diasNoAno * anos) + (diasNoMes * meses);
		
		System.out.println("Sua idade em dias é: " + dias + " dias!");

		leia.close();
	}

}

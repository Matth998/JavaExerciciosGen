package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int dias, meses, anos;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade em dias:");
		dias = leia.nextInt();
		
		anos = dias / 365;
		meses = (dias % 365) / 30;
		dias = (dias % 365) % 30;
		
		System.out.println("Sua idade é: " + anos + " anos " + meses + " meses " 
		+ dias + " dias.");
		
		leia.close();
		
	}

}

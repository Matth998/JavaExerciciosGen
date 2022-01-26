package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int horas, minutos, segundos;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o tempo de evento da fábrica em segundos: ");
		segundos = leia.nextInt();
		
		horas = segundos / 3600;
		minutos = (segundos % 3600) / 60;
		segundos = (segundos % 3600) % 60;
		
		System.out.println("O tempo é: " + horas + " horas " + minutos + " minutos " + 
		segundos + " segundos");

		leia.close();
	}

}

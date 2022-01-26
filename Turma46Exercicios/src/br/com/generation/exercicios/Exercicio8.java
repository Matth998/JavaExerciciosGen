package br.com.generation.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		double fabrica, valorCarro, imposto, distribuidor;
		Scanner leia = new Scanner(System.in);
		DecimalFormat formatado = new DecimalFormat("0.00");

		System.out.println("Escreva do custo de fábrica");
		System.out.println("Custo de fábrica: ");
		fabrica = leia.nextDouble();
		
		distribuidor = fabrica * 0.28;
		imposto = fabrica * 0.45;
		
		valorCarro = fabrica + distribuidor + imposto;
		
		System.out.println("O valor do carro fica em R$" + formatado.format(valorCarro));
		
		leia.close();
		
	}

}

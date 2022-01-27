package br.com.generation.laco.repeticao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int idade, sexo, opcoes, contador;
		int pessoascalma = 0;
		int mulheresnervosas = 0;
		int homemAgressivo = 0;
		int outroCalmo = 0;
		int adultoNervoso = 0;
		int adolecenteCalmo = 0;
		Scanner entrada = new Scanner(System.in);
		
		contador = 0;
		
		while(contador < 150) {
			
			System.out.println("Qual a sua idade?");
			idade = entrada.nextInt();
			
			System.out.println("Qual seu sexo? [ 1- Masculino | 2- Feminino | 3- Prefiro não informar])");
			sexo = entrada.nextInt();
			
			System.out.println("Você é uma pessoa: [ 1- Calma | 2- Nervosa | 3- Agressiva]");
			opcoes = entrada.nextInt();
			
			contador++;
			
			if(opcoes == 1) {
				
				pessoascalma++;
				
			}
			
			if(sexo == 2 && opcoes == 2) {
				
				mulheresnervosas++;
				
			}
			
			if(sexo == 1 && opcoes == 3) {
				
				homemAgressivo++;
				
			}
			if(sexo == 3 && opcoes == 1) {
				
				outroCalmo++;
				
			}
			if(idade > 40 && opcoes == 2) {
				
				adultoNervoso++;
				
			}
			if(idade <18 && opcoes == 1) {
				
				adolecenteCalmo++;
				
			}
			
		}

		
		System.out.println("O número de pessoas calmas são de: " + pessoascalma +
				"\nO número de mulheres nervosas são de: " + mulheresnervosas +
				"\nO número de homens agressivos são de: " + homemAgressivo +
				"\nO número de outros que são calmos são de: " + outroCalmo +
				"\nO número de adultos nervosos são de: " + adultoNervoso +
				"\nO número de adolecentes calmos são de: " + adolecenteCalmo);
		
		entrada.close();
	}

}
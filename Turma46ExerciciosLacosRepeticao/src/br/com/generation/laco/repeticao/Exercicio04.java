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
			
			System.out.println("Qual seu sexo? [ 1- Masculino | 2- Feminino | 3- Prefiro n�o informar])");
			sexo = entrada.nextInt();
			
			System.out.println("Voc� � uma pessoa: [ 1- Calma | 2- Nervosa | 3- Agressiva]");
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

		
		System.out.println("O n�mero de pessoas calmas s�o de: " + pessoascalma +
				"\nO n�mero de mulheres nervosas s�o de: " + mulheresnervosas +
				"\nO n�mero de homens agressivos s�o de: " + homemAgressivo +
				"\nO n�mero de outros que s�o calmos s�o de: " + outroCalmo +
				"\nO n�mero de adultos nervosos s�o de: " + adultoNervoso +
				"\nO n�mero de adolecentes calmos s�o de: " + adolecenteCalmo);
		
		entrada.close();
	}

}
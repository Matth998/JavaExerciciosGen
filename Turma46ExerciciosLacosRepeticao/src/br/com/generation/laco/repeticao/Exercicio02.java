package br.com.generation.laco.repeticao;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int par = 0, impar = 0;
		
		for(int contador = 0; contador <= 10; contador++) {
			
			if(contador%2 == 0) {
				
				par++;
				
			}
			else {
				
				impar++;
				
			}
			
			
		}
		
		System.out.println("Temos " + par + " números pares e " + impar + " números impares.");

	}

}

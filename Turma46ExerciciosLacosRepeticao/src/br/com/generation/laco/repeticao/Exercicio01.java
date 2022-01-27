package br.com.generation.laco.repeticao;

public class Exercicio01 {

	public static void main(String[] args) {
		
		System.out.println("Numeros de 1000 a 1999 que dividido por 11 o resto é 5: ");
		
		for(int contador = 1000; contador < 2000; contador++) {
			
			if(contador % 11 == 5) {
				
				System.out.println(contador);
				
			}
			
		}

	}

}

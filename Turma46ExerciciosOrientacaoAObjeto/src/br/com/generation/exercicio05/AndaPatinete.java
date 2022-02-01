package br.com.generation.exercicio05;

import java.util.Scanner;

public class AndaPatinete {

	public static void main(String[] args) throws InterruptedException {

		Patinete patinete = new Patinete();
		Scanner entrada = new Scanner(System.in);
		int valida = 0;
		
		logo();
		cadastraPatinete(patinete, entrada);
		
		confirmaLogo();
		confirmaPatinete(patinete);
		
		andar(patinete, entrada, valida);
		
	}
	
	public static void logo() {
		
		System.out.println("============================================================================");
		System.out.println("=                               Cadastro                                   =");
		System.out.println("=                                  do                                      =");
		System.out.println("=                               Patinete                                   =");
		System.out.println("============================================================================");
		
	}
	
	public static void cadastraPatinete(Patinete patinete, Scanner entrada) {
		
		System.out.println();
		System.out.print("Digite o modelo do patinete: ");
		patinete.setModelo(entrada.nextLine());
		System.out.print("Digite a marca do patinete: ");
		patinete.setMarca(entrada.nextLine());
		System.out.print("Digite a cor do patinete: ");
		patinete.setCor(entrada.nextLine());
		
	}
	
	public static void confirmaPatinete(Patinete patinete) {
		
		System.out.println("Modelo: " + patinete.getModelo());
		System.out.println("Marca: " + patinete.getMarca());
		System.out.println("Cor: " + patinete.getCor());
		System.out.println();
		
	}
	
	public static void confirmaLogo() {
		
		System.out.println();
		System.out.println("============================================================================");
		System.out.println("=                            Confirme os                                   =");
		System.out.println("=                          dados do patinete                               =");
		System.out.println("============================================================================");
		System.out.println();
		
	}
	
	public static void andar(Patinete patinete, Scanner entrada, int valida) throws InterruptedException {
		
		System.out.println("Deseja andar de patinete? [ 1- SIM || 2- NÃO ]");
		valida = entrada.nextInt();
		
		if(valida == 1) {
			
			while(valida == 1) {
				
				patinete.andando();
				
				Thread.sleep(2000);
				System.out.println("Deseja continuar andando? [ 1- SIM || 2- NÃO ]");
				valida = entrada.nextInt();
				
			}
			
			patinete.para();
		}else {
			
			System.out.println("Okay.");
			
		}
		
	}

}

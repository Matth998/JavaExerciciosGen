package br.com.generation.exercicio03;

import java.util.Scanner;

public class Celular {

	public static void main(String[] args) throws InterruptedException {
		
		Eletronico eletronico = new Eletronico();
		Scanner entrada = new Scanner(System.in);
		int valida = 0;
		
		logo();
		
		coletaDados(eletronico, entrada);
		
		confirma();
		confirmaDados(eletronico);
		
		ligaDesliga(eletronico, entrada, valida);

	}
	
	public static void logo() {
		
		System.out.println("============================================================================");
		System.out.println("=                               Cadastro                                   =");
		System.out.println("=                                 Novo                                     =");
		System.out.println("=                              Eletrônico                                  =");
		System.out.println("============================================================================");
		
	}
	
	public static void coletaDados(Eletronico eletronico, Scanner entrada) {
		
		System.out.print("Digite o eletrônico que deseja cadastrar: ");
		eletronico.setProduto(entrada.nextLine());
		System.out.print("Digite o modelo do produto: ");
		eletronico.setModelo(entrada.nextLine());
		System.out.print("Digite o fabricante do produto: ");
		eletronico.setFabricante(entrada.nextLine());
		System.out.print("Digite o preço do produto: ");
		eletronico.setValor(Integer.parseInt(entrada.nextLine()));
		
	}
	
	public static void confirmaDados(Eletronico eletronico) {
		
		System.out.println("Produto: " + eletronico.getProduto());
		System.out.println("Modelo: " + eletronico.getModelo());
		System.out.println("Fabricante: " + eletronico.getFabricante());
		System.out.println("Preço: " + eletronico.getValor());
		
	}
	
	public static void confirma() {
		
		System.out.println();
		System.out.println("============================================================================");
		System.out.println("=                            Confirme os                                   =");
		System.out.println("=                          dados do produto                                =");
		System.out.println("============================================================================");
		System.out.println();
		
	}
	
	public static void ligaDesliga(Eletronico eletronico, Scanner entrada, int valida) throws InterruptedException {
		
		System.out.println("Deseja ligar o eletrônico? [1 - SIM || 2 - NÃO]");
		valida = entrada.nextInt();
		
		if(valida == 1) {
			
			eletronico.ligandoEletronico();
			
			Thread.sleep(1000);
			
			while(valida == 1) {
				
				eletronico.mexendoNoEletronico();
				Thread.sleep(2000);
				System.out.println("Deseja desligar o aparelho ou continuar mexendo? [1 - SIM || 2- NÃO]");
				valida = entrada.nextInt();
				
			}
			
			eletronico.desligandoEletronico();
			
		}else {
			
			System.out.println("Ok, o eletrônico continuará desligado.");
			
		}
		
	}

}

package br.com.generation.exercicio01;

import java.util.Scanner;

public class Loja {

	public static void main(String[] args) throws InterruptedException {
		
		Cliente client = new Cliente();
		Scanner entrada = new Scanner(System.in);
		
		escreveLogo();
		
		coletaDados(client, entrada);
		
		Thread.sleep(1000);
		
		escrevaConfirma();
		
		System.out.println("Nome: " + client.getName());
		System.out.println("Idade: " + client.getAge());
		System.out.println("CPF: " + client.getCpf());
		System.out.println("Endereço: " + client.getAddress());
		
		client.compra();

	}
	
	public static void coletaDados(Cliente client, Scanner entrada) {
		
		System.out.println("Digite do Cliente: ");
		client.setName(entrada.nextLine());
		System.out.println("Digite a idade do cliente: ");
		client.setAge(Integer.parseInt(entrada.nextLine()));
		System.out.println("Digite o CPF do cliente: ");
		client.setCpf(entrada.nextLine());
		System.out.println("Digite o endereço do cliente: ");
		client.setAddress(entrada.nextLine());

		
	}
	
	public static void escreveLogo() {
		
		System.out.println("============================================================================");
		System.out.println("=                              Magazine                                    =");
		System.out.println("=                                Luiza                                     =");
		System.out.println("============================================================================");
		System.out.println();
		
	}
	
	public static void escrevaConfirma() {
		
		System.out.println();
		System.out.println("============================================================================");
		System.out.println("=                            Confirme os                                   =");
		System.out.println("=                          dados do cliente                                =");
		System.out.println("============================================================================");
		System.out.println();
		
	}

}

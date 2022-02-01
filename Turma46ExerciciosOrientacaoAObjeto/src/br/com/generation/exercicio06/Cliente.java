package br.com.generation.exercicio06;

import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) throws InterruptedException {
		
		Conta conta = new Conta();
		Scanner entrada = new Scanner(System.in);
		
		logo();
		cadastroCliente(conta, entrada);

		confirmaLogo();
		confirmaDados(conta);
		
		abrirConta(conta);
		
	}
	
	public static void logo() {
		
		System.out.println("============================================================================");
		System.out.println("=                             Abrir Conta                                  =");
		System.out.println("=                                 no                                       =");
		System.out.println("=                                Banco                                     =");
		System.out.println("============================================================================");
		
	}
	
	public static void cadastroCliente(Conta conta, Scanner entrada) {
		
		System.out.println();
		System.out.print("Digite o número da conta: ");
		conta.setNumero(entrada.nextLine());
		System.out.print("Digite a agência da conta: ");
		conta.setAgencia(entrada.nextLine());
		System.out.print("Digite o nome do Titular da Conta: ");
		conta.setName(entrada.nextLine());
		System.out.print("Digite o CPF do Titular da Conta: ");
		conta.setCpf(entrada.nextLine());
		System.out.print("Digite o endereço do Titular da Conta: ");
		conta.setAndress(entrada.nextLine());
		System.out.print("Digite o telefone do Titular da Conta: ");
		conta.setTelefone(Integer.parseInt(entrada.nextLine()));
		System.out.print("Digite o tipo de conta: [ 1 - Conta Corrente || 2 - Conta poupança ] ");
		conta.setTipoDeConta(Integer.parseInt(entrada.nextLine()));
		
	}
	
	public static void confirmaDados(Conta conta) {
		
		System.out.println("Número: " + conta.getNumero());
		System.out.println("Agência: " + conta.getAgencia());
		System.out.println("Nome do titular: " + conta.getName());
		System.out.println("CPF do tiular: " + conta.getCpf());
		System.out.println("Endereço do titular:" + conta.getAndress());
		System.out.println("Telefone do titular: " + conta.getTelefone());
		System.out.println("Tipo de conta: " + conta.getTipoDeConta());
		System.out.println();
		
	}
	
	public static void confirmaLogo() {
		
		System.out.println();
		System.out.println("============================================================================");
		System.out.println("=                            Confirme os                                   =");
		System.out.println("=                           dados da conta                                 =");
		System.out.println("============================================================================");
		System.out.println();
	
		
	}
	
	public static void abrirConta(Conta conta) throws InterruptedException {
		
		if(conta.getTipoDeConta() == 1) {
			
			conta.abrirCc();
			
			Thread.sleep(3000);
			
		}else {
			
			conta.abrirCp();
			
		}
		
		System.out.println("Conta aberta!");
		
	}
	
	
}

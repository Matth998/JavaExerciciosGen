package br.com.generation.exercicio04;

import java.util.Scanner;

public class Empresa {

	public static void main(String[] args) throws InterruptedException {
		
		Funcionario funcionario = new Funcionario();
		Scanner entrada = new Scanner(System.in);
		int valida = 0;
		
		logo();
		cadastroFuncionario(funcionario, entrada);
		
		confirmaLogo();
		confirmaDados(funcionario, entrada, valida);
		
		funcionario.trabalho();
		
		Thread.sleep(3000);
		
		funcionario.saida();
		

	}
	
	public static void logo() {
		
		System.out.println("============================================================================");
		System.out.println("=                               Cadastro                                   =");
		System.out.println("=                                  de                                      =");
		System.out.println("=                             Funcionário                                  =");
		System.out.println("============================================================================");
		System.out.println();
		
	}

	public static void cadastroFuncionario(Funcionario funcionario, Scanner entrada) {
		
		System.out.print("Digite o nome do funcionário: ");
		funcionario.setName(entrada.nextLine());
		System.out.print("Digite o CPF do funcionário: ");
		funcionario.setCpf(entrada.nextLine());
		System.out.print("Digite o cargo do funcionário: ");
		funcionario.setOccupation(entrada.nextLine());
		System.out.print("Digite o salário do funcionário: ");
		funcionario.setSalario(Integer.parseInt(entrada.nextLine()));
		
	}
	
	public static void confirmaDados(Funcionario funcionario, Scanner entrada, int valida) {
		
		System.out.println("Nome: " + funcionario.getName());
		System.out.println("CPF: " + funcionario.getCpf());
		System.out.println("Cargo: " + funcionario.getOccupation());
		System.out.println("Salario: " + funcionario.getSalario());
		System.out.println();
		System.out.println("Essas informações estão corretas? [ 1- SIM || 2- NÃO ]");
		valida = entrada.nextInt();
		valida(valida, funcionario, entrada);
		
	}
	
	public static void valida(int valida, Funcionario funcionario, Scanner entrada) {
		
		if(valida == 1) {
			
			System.out.println("Funcionário cadastrado com sucesso!");
			
		}else {
			
			System.out.println("Faça o cadastro novamente.");
			cadastroFuncionario(funcionario, entrada);
			
		}
		
	}
	
	public static void confirmaLogo() {
		
		System.out.println();
		System.out.println("============================================================================");
		System.out.println("=                            Confirme os                                   =");
		System.out.println("=                        dados do Funcionário                              =");
		System.out.println("============================================================================");
		System.out.println();
		
	}
	
}

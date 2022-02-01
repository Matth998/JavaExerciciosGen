package br.com.generation.exercicio07;

import java.util.Scanner;

public class Hospital {

	public static void main(String[] args) {
		
		Paciente paciente = new Paciente();
		Scanner entrada = new Scanner(System.in);
		
		logo();
		cadastroPaciente(paciente, entrada);
		
		confirmaLogo();
		confirmaCadastro(paciente);
		
		validaNivel(paciente);
		
	}
	
	public static void logo() {
		
		System.out.println("============================================================================");
		System.out.println("=                              Cadastro                                    =");
		System.out.println("=                                 do                                       =");
		System.out.println("=                              Paciente                                    =");
		System.out.println("============================================================================");
		
	}
	
	public static void cadastroPaciente(Paciente paciente, Scanner entrada) {
		
		System.out.println();
		System.out.print("Digite o nome do paciente: ");
		paciente.setName(entrada.nextLine());
		System.out.print("Digite o CPF do paciente: ");
		paciente.setCpf(entrada.nextLine());
		System.out.print("Digite o número de telefone do paciente: ");
		paciente.setNumeroTelefone(Integer.parseInt(entrada.nextLine()));
		System.out.print("Nível de urgência: [ 1- URGENTE || 2- MODERADO || 3- SEM URGÊNCIA ] ");
		paciente.setNivelDeUrgencia(Integer.parseInt(entrada.nextLine()));
		
	}
	
	public static void confirmaCadastro(Paciente paciente) {
		
		System.out.println("Nome: " + paciente.getName());
		System.out.println("CPF: " + paciente.getCpf());
		System.out.println("Telefone: " + paciente.getNumeroTelefone());
		System.out.println("Nível de urgência: " + paciente.getNivelDeUrgencia());
		
	}
	
	public static void confirmaLogo() {
		
		System.out.println();
		System.out.println("============================================================================");
		System.out.println("=                            Confirme os                                   =");
		System.out.println("=                         dados do paciente                                =");
		System.out.println("============================================================================");
		System.out.println();
		
	}
	
	public static void validaNivel(Paciente paciente) {
		
		if(paciente.getNivelDeUrgencia() == 1) {
			
			paciente.urgente();
			
		}
		
		if(paciente.getNivelDeUrgencia() == 2) {
			
			paciente.moderado();
			
		}
		
		if(paciente.getNivelDeUrgencia() == 3) {
			
			paciente.semUrgencia();
			
		}
		
	}

}

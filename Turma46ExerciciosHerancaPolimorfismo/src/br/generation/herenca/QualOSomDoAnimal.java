package br.generation.herenca;

import java.util.Scanner;

public class QualOSomDoAnimal {

	 static int valida;
	
	public static void main(String[] args) throws InterruptedException {
		
		Animal cachorro = new Cachorro();
		Animal cavalo = new Cavalo();
		Animal preguica = new Preguica();
		Scanner entrada = new Scanner(System.in);
			
		cadastroAnimal(cachorro, cavalo, preguica, entrada);
		confirmaAnimal(cachorro, cavalo, preguica, entrada);
		
		qualSom(cachorro, cavalo, preguica, entrada);
		
	}
	
	public static void cadastroCachorro(Animal cachorro, Scanner entrada) {
		
		System.out.print("Digite o nome do cachorro: ");
		cachorro.setName(entrada.next());
		System.out.print("Digite a idade do cachorro: ");
		cachorro.setAge(Integer.parseInt(entrada.next()));
		System.out.print("Qual som o cachorro faz? ");
		cachorro.setSound(entrada.next());	
		
		System.out.println();
		
		
	}
	
	public static void cadastroCavalo(Animal cavalo, Scanner entrada) {
		
		System.out.print("Digite o nome do cavalo: ");
		cavalo.setName(entrada.next());
		System.out.print("Digite a idade do cavalo: ");
		cavalo.setAge(Integer.parseInt(entrada.next()));
		System.out.print("Qual o som que o cavalo faz? ");
		cavalo.setSound(entrada.next());
		
		System.out.println();
		
		
	}
	
	public static void cadastroPreguica(Animal preguica, Scanner entrada) {
		
		System.out.print("Digite o nome da preguiça: ");
		preguica.setName(entrada.next());
		System.out.print("Digite a idade da preguiça: ");
		preguica.setAge(Integer.parseInt(entrada.next()));
		System.out.print("Qual o som que a preguiça faz? ");
		preguica.setSound(entrada.next());
		
		System.out.println();
		
	}
	
	public static void cadastroAnimal(Animal cachorro, Animal cavalo, Animal preguica, Scanner entrada) throws InterruptedException {
		
		System.out.println("Você deseja cadastra qual Animal? [ 1- CACHORRO || 2- CAVALO || 3- PREGUIÇA] ");
		valida = entrada.nextInt();
		
		while(valida != 1 && valida != 2 && valida != 3) {
			
			System.out.println("O animal que você escolheu não está na lista, por favor, revise.");
			Thread.sleep(2000);
			
			System.out.println("Você deseja cadastra qual Animal? [ 1- CACHORRO || 2- CAVALO || 3- PREGUIÇA] ");
			valida = entrada.nextInt();
		}
		
		if(valida == 1) {
			
			cadastroCachorro(cachorro, entrada);
			
		}
		if(valida == 2) {
			
			cadastroCavalo(cavalo, entrada);
			
		}
		if(valida == 3) {
			
			cadastroPreguica(preguica, entrada);
			
		}
		
	}
	
	public static void confirmaAnimal(Animal cachorro, Animal cavalo, Animal preguica, Scanner entrada) {
		
		if (valida == 1) {
			
			confirmaCachorro(cachorro, entrada);
			
		}
		
		if(valida == 2) {
			
			confirmaCavalo(cavalo, entrada);
			
		}
		
		if(valida == 3) {
			
			confirmaPreguica(preguica, entrada);
			
		}
		
	}
	
	public static void confirmaCachorro(Animal cachorro, Scanner entrada) {
		
		System.out.println("Nome do(a) cachorro(a): " + cachorro.getName());
		System.out.println("Idade do(a) cachorro(a): " + cachorro.getAge());
		System.out.println("O som do(a) cachorro(a) é: " + cachorro.getSound());
		System.out.println();
		
		System.out.println("As informações estão corretas? [ 1- SIM || 2- NÃO]");
		valida = entrada.nextInt();
		
		if(valida == 1) {
			
			cadastrando();
			
		}
		if(valida == 2) {
			
			erroNoCadastro();
			
		}
		
		
	}
	
	public static void confirmaCavalo(Animal cavalo, Scanner entrada) {
		
		System.out.println("Nome do cavalo: " + cavalo.getName());
		System.out.println("Idade do cavalo: " + cavalo.getAge());
		System.out.println("O som do cavalo é: " + cavalo.getSound());
		System.out.println();
		
		System.out.println("As informações estão corretas? [ 1- SIM || 2- NÃO]");
		valida = entrada.nextInt();
		
		if(valida == 1) {
			
			cadastrando();
			
		}
		if(valida == 2) {
			
			erroNoCadastro();
			
		}
		
	}
	
	public static void confirmaPreguica(Animal preguica, Scanner entrada) {
		
		System.out.println("Nome da preguiça: " + preguica.getName());
		System.out.println("Idade da preguiça: " + preguica.getAge());
		System.out.println("O som da preguiça é: " + preguica.getSound());
		System.out.println();
		
		System.out.println("As informações estão corretas? [ 1- SIM || 2- NÃO]");
		valida = entrada.nextInt();
		
		if(valida == 1) {
			
			cadastrando();
			
		}
		if(valida == 2) {
			
			erroNoCadastro();
			
		}
		
	}
	
	public static void cadastrando() {
		
		System.out.println("Animal cadastrado com sucesso!");
		
	}
	
	public static void erroNoCadastro() {
		
		System.out.println("Animal não cadastrado, por favor, tente novamente.");
		
	}
	
	public static void qualSom(Animal cachorro, Animal cavalo, Animal preguica, Scanner entrada) {
		
		System.out.println("Qual animal você quer que emita um som? [ 1- CACHORRO || 2- CAVALO || 3- PREGUIÇA]");
		valida = entrada.nextInt();
		
		if(valida == 1) {
			
			somCachorro(cachorro);
			
		}
		
		if(valida == 2) {
			
			somCavalo(cavalo);
			
		}
		
		if(valida == 3) {
			
			somPreguica(preguica);
			
		}
		
	}
	
	public static void somCachorro(Animal cachorro) {
		
		System.out.print("O cachorro está latindo... " + cachorro.getSound());
		
	}
	
	public static void somCavalo(Animal cavalo) {
		
		System.out.print("O cavalo está relinchando... " + cavalo.getSound());
		
	}
	
	public static void somPreguica(Animal preguica) {
		
		System.out.println("A preguica está emitindo dormindo...");
		
	}
}

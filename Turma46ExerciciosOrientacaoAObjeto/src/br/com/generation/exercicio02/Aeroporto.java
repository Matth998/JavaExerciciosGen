package br.com.generation.exercicio02;

import java.util.Scanner;

public class Aeroporto {

	public static void main(String[] args) throws InterruptedException {
		
		Aviao aviao = new Aviao();
		Scanner entrada = new Scanner(System.in);
		
		escreveLogo();
		
		coletaDados(aviao, entrada);
		
		Thread.sleep(1000);
		
		escreveconfirma();
		
		confirmaDados(aviao);
		
		Thread.sleep(2000);
		
		aviao.decolagem();
		
		Thread.sleep(2000);
		
		aviao.aterrissagem();
		
	}
	
	public static void escreveLogo() {
		
		System.out.println("============================================================================");
		System.out.println("=                              Aeroporto                                   =");
		System.out.println("=                                  de                                      =");
		System.out.println("=                              Guaraluhos                                  =");
		System.out.println("============================================================================");
	}
	
	public static void coletaDados(Aviao aviao, Scanner entrada) {
		
		System.out.print("Digite o prefixo do avi�o: ");
		aviao.setPrefixo(entrada.nextLine());
		System.out.print("Digite o modelo do avi�o: ");
		aviao.setModelo(entrada.nextLine());
		System.out.print("Digite fabricante do avi�o: ");
		aviao.setFabricante(entrada.nextLine());
		System.out.print("Digite a quantidade de voos do avi�o: ");
		aviao.setQtdsVoos(Integer.parseInt(entrada.nextLine()));
		
	}
	
	public static void confirmaDados(Aviao aviao) {
		
		System.out.println("O prefixo do avi�o � o: " + aviao.getPrefixo());
		System.out.println("O modelo do avi�o � o: " + aviao.getModelo());
		System.out.println("O fabricante do avi�o � o: " + aviao.getFabricante());
		System.out.println("A quantidade de voo do avi�o � de: " + aviao.getQtdsVoos());
	}
	
	public static void escreveconfirma() {
		
		System.out.println();
		System.out.println("============================================================================");
		System.out.println("=                            Confirme os                                   =");
		System.out.println("=                           dados do avi�o                                 =");
		System.out.println("============================================================================");
		System.out.println();
		
	}

}

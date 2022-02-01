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
		
		System.out.print("Digite o prefixo do avião: ");
		aviao.setPrefixo(entrada.nextLine());
		System.out.print("Digite o modelo do avião: ");
		aviao.setModelo(entrada.nextLine());
		System.out.print("Digite fabricante do avião: ");
		aviao.setFabricante(entrada.nextLine());
		System.out.print("Digite a quantidade de voos do avião: ");
		aviao.setQtdsVoos(Integer.parseInt(entrada.nextLine()));
		
	}
	
	public static void confirmaDados(Aviao aviao) {
		
		System.out.println("O prefixo do avião é o: " + aviao.getPrefixo());
		System.out.println("O modelo do avião é o: " + aviao.getModelo());
		System.out.println("O fabricante do avião é o: " + aviao.getFabricante());
		System.out.println("A quantidade de voo do avião é de: " + aviao.getQtdsVoos());
	}
	
	public static void escreveconfirma() {
		
		System.out.println();
		System.out.println("============================================================================");
		System.out.println("=                            Confirme os                                   =");
		System.out.println("=                           dados do avião                                 =");
		System.out.println("============================================================================");
		System.out.println();
		
	}

}

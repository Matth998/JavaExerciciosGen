package br.generation.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {

	public static void main(String[] args) {
		
		Scanner entradaProdu = new Scanner(System.in);
		Scanner entradaQtd = new Scanner(System.in);
		ArrayList<Estoque> inventario = new ArrayList<>();
		
		System.out.println("Quantos produtos você irá verifcar?");
		int valida = entradaProdu.nextInt();
		entradaProdu.nextLine();
		
		for (int i = 0; i < valida; i++) {
			
			System.out.print("Digite o nome do produto: ");
			String prod = entradaProdu.nextLine();
			System.out.println("Digite a quantidade que contém em estoque: ");
			int qtd = entradaQtd.nextInt();
			
			inventario.add(new Estoque(prod, qtd));
			
		}
		
		for(int i = 0; i < inventario.size(); i++) {
			
			System.out.println("No estoque da loja contém: "+ inventario.get(i));
			
		}
		
		System.out.println("Deseja remover algum item da lista? [ 1- SIM || 2- NÃO ]");
		valida = entradaProdu.nextInt();
		
		while(valida == 1) {
			
			for(int i = 0; i < inventario.size(); i++) {
				
				System.out.println((i+1) + "º " +inventario.get(i));
				
			}
			
			System.out.println("Qual produto você deseja remover?");
			int remove = entradaProdu.nextInt();
			inventario.remove(remove);
			
			System.out.println("Deseja remover algum outro item da lista? [ 1- SIM || 2- NÃO ]");
			valida = entradaProdu.nextInt();
			
		}
		
		System.out.println("Deseja alterar algum item da lista? [ 1- SIM || 2- NÃO ]");
		valida = entradaProdu.nextInt();
		
		for(int i = 0; i < inventario.size(); i++) {
			
			System.out.println("No estoque da loja contém: "+ inventario.get(i));
			
		}
		
		entradaProdu.close();
		entradaQtd.close();

	}

}

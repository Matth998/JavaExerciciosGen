package br.com.generation.exercicio05;

public class Patinete {

	private String marca;
	private String modelo;
	private String cor;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	void andando() {
		
		System.out.println("Andando...");
		
	}
	
	void para() {
		
		System.out.println("Parando...");
		
	}
	
	
}

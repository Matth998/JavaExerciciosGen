package br.com.generation.exercicio03;

public class Eletronico {

	private String produto;
	private String modelo;
	private String fabricante;
	private Integer valor;
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	
	void ligandoEletronico() {
		
		System.out.println(produto + " esta ligando...");
		
	}
	
	void mexendoNoEletronico() {
		
		System.out.println("Mexendo...");
		
	}
	
	void desligandoEletronico() {
		
		System.out.println(produto + " está desligando...");
		
	}
	
}

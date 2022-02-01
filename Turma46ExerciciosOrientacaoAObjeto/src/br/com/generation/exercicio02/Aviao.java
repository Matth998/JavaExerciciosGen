package br.com.generation.exercicio02;

public class Aviao {

	private String prefixo;
	private String modelo;
	private String fabricante;
	private Integer qtdsVoos;
	
	public String getPrefixo() {
		return prefixo;
	}
	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
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
	public Integer getQtdsVoos() {
		return qtdsVoos;
	}
	public void setQtdsVoos(Integer qtdsVoos) {
		this.qtdsVoos = qtdsVoos;
	}
	
	void decolagem() {
		
		System.out.println();
		System.out.println("O avião está decolando...");
		
	}
	
	void aterrissagem() {
		
		System.out.println();
		System.out.println("O avião está pousando...");
		
	}
	
}

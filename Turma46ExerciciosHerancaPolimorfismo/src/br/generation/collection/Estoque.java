package br.generation.collection;

public class Estoque {

	private String produto;
	private Integer qtd;

	public Estoque(String produto, Integer qtd) {
		super();
		this.produto = produto;
		this.qtd = qtd;
	}
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public Integer getQtd() {
		return qtd;
	}
	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}
	
	@Override
	public String toString() {
		return  qtd + " " + produto;
	}
	
	
	
}

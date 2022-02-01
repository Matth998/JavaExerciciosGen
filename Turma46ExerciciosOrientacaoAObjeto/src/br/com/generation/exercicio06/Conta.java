package br.com.generation.exercicio06;

public class Conta {

	private String numero;
	private String agencia;
	private Integer tipoDeConta;
	private Integer Saldo;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public Integer getTipoDeConta() {
		return tipoDeConta;
	}
	public void setTipoDeConta(Integer tipoDeConta) {
		this.tipoDeConta = tipoDeConta;
	}
	public Integer getSaldo() {
		return Saldo;
	}
	public void setSaldo(Integer saldo) {
		Saldo = saldo;
	}
	
	void abrirCc() {
		
		System.out.println("Abrindo conta corrente...");
		
	}
	
	void abrirCp() {
		
		System.out.println("Abrindo conta poupança...");
	}
	
	
}

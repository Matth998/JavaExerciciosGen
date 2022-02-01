package br.com.generation.exercicio06;

import java.util.Scanner;

public class Conta extends Titular{

	private String numero;
	private String agencia;
	Titular titular = new Titular();
	private Integer tipoDeConta;
	private Integer Saldo;
	Scanner entrada = new Scanner(System.in);
	
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

	public Scanner getEntrada() {
		return entrada;
	}

	public void setEntrada(Scanner entrada) {
		this.entrada = entrada;
	}

	void abrirCc() {
		
		System.out.println("Abrindo conta corrente...");
		
	}
	
	void abrirCp() {
		
		System.out.println("Abrindo conta poupança...");
	}
	
	
}

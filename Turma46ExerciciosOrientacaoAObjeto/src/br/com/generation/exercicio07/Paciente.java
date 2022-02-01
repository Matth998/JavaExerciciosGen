package br.com.generation.exercicio07;

public class Paciente {

	private String name;
	private String cpf;
	private Integer numeroTelefone;
	private Integer nivelDeUrgencia;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Integer getNumeroTelefone() {
		return numeroTelefone;
	}
	public void setNumeroTelefone(Integer numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	public Integer getNivelDeUrgencia() {
		return nivelDeUrgencia;
	}
	public void setNivelDeUrgencia(Integer nivelDeUrgencia) {
		this.nivelDeUrgencia = nivelDeUrgencia;
	}
	
	void urgente(){
		
		System.out.println("VOCÊ JÁ SERÁ ATENDIDO, VÁ PARA O CONSULTORIO, POR FAVOR!");
		
	}
	
	void moderado() {
		
		System.out.println("VOCÊ JÁ SERÁ ATENDIDO, AGUERTE UM POUCO!");
		
	}
	
	void semUrgencia() {
		
		System.out.println("SEU QUADRO NÃO É GRAVE, AGUARDE PARA SER ATENDIDO, POR FAVOR.");
		
	}
	
}

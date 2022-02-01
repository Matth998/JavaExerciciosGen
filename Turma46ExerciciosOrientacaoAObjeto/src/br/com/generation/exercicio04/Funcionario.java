package br.com.generation.exercicio04;

public class Funcionario {

	private String name;
	private String occupation;
	private String cpf;
	private Integer salario;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Integer getSalario() {
		return salario;
	}
	public void setSalario(Integer salario) {
		this.salario = salario;
	}

	void trabalho() {
		
		System.out.println(name + " está trabalhando.");
		
	}
	
	void saida() {
		
		System.out.println(name + " foi embora.");
		
	}
	
}

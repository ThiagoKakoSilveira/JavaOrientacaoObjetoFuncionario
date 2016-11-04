package modelosAbstratosOuInterfaces;

public abstract class Funcionario {
	protected String nome;
	protected double salario;
		
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// M�todos abstratos 
	public abstract double getBonus();		
}

package modelos;

import modelosAbstratosOuInterfaces.Autenticavel;

public class Cliente implements Autenticavel{
	private String nome, endereco;
	int senha;

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha){
			return true;
		}else{			
			return false;
		}
	}
	
	public int getSenha() {
		return senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}

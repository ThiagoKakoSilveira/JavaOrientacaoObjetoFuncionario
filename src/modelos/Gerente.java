package modelos;

import modelosAbstratosOuInterfaces.Autenticavel;
import modelosAbstratosOuInterfaces.Funcionario;

public class Gerente extends Funcionario implements Autenticavel{
	
	private int senha;

	public double getBonus(){
		return this.salario * 0.3;
	}
	
	public void cobraEntrega(){
		System.out.println("Está pronto!");
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha){
			return true;
		}else{			
			return false;
		}
	}
}

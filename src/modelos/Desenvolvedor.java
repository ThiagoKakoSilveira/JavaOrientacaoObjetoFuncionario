package modelos;

import modelosAbstratosOuInterfaces.Funcionario;

public class Desenvolvedor extends Funcionario{
	
	public double getBonus(){
		return this.salario * 0.25;
	}

}

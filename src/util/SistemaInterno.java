package util;

import modelosAbstratosOuInterfaces.Autenticavel;

public class SistemaInterno {
	public void autentica(Autenticavel a){
		
		int senha = 123; // no futuro,  pegaremos como par�metro de entrada
		
		if(a.autentica(senha) == true){
			System.out.println("Bem vindo ao Sistema!");
		}else {
			System.out.println("Senha incorreta!");
		}
	}

}

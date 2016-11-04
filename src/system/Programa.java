package system;

import modelos.Gerente;
import util.TotalizadorDeBonus;

public class Programa {
	public static void main(String[] args) {
		
		Gerente joaquim = new Gerente();
		joaquim.setSalario(2000.0);
		joaquim.cobraEntrega();
		
		System.out.println(joaquim.getBonus());
		
		TotalizadorDeBonus totalizadorDeBonus = new TotalizadorDeBonus();
		totalizadorDeBonus.adiciona(joaquim);
		
		System.out.println(totalizadorDeBonus.getTotal());
	}

}

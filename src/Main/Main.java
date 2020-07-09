package Main;
import java.util.ArrayList;
import java.util.List;

import Entities.Items;
import Entities.Orcamento;
import ImpostoStrategy.CalculadoraDeImpostos;
import ImpostoStrategy.ICMS;
import ImpostoStrategy.ICPP;
import ImpostoStrategy.IKCV;
import ImpostoStrategy.INPS;

public class Main {

	public static void main(String[] args) {
		List<Items> itens = new ArrayList<Items>() {{
			add(new Items("Lápis", 2, 2.0));
			add(new Items("Estojo", 1, 6.0));
			add(new Items("Mochila", 1, 80.0));
			add(new Items("Notebook", 1, 2000.0));
			add(new Items("Bolinha de gude", 10, 1.0));
		}};
		Orcamento orcamento = new Orcamento(itens);
		
		System.out.println(CalculadoraDeImpostos.getAliquota(orcamento, new ICMS(new ICPP(new IKCV()))));
	}
}

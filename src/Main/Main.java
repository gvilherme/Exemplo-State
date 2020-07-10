package main;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

import entities.Items;
import entities.Orcamento;
import impostoStrategy.CalculadoraDeImpostos;
import impostoStrategy.ICMS;
import impostoStrategy.ICPP;
import impostoStrategy.IKCV;
import impostoStrategy.INPS;

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
		
		System.out.println("Valor total antes do desconto em aprovação: " + orcamento.getValorTotal());
		orcamento.aplicaDescontoPeloEstado();
		System.out.println("Valor total depois do desconto de em aprovação: " + orcamento.getValorTotal());
		orcamento.aprova();
		orcamento.aplicaDescontoPeloEstado();
		System.out.println("Valor total depois do desconto aprovado: " + orcamento.getValorTotal());
		orcamento.encerra();
		orcamento.aplicaDescontoPeloEstado();
		
		System.out.println("Aliquota: " + CalculadoraDeImpostos.getAliquota(orcamento, new ICMS(new ICPP(new IKCV()))));
	}
}

package impostoStrategy;
import entities.Orcamento;

public class CalculadoraDeImpostos {
	
	public static double getAliquota(Orcamento orcamento, Imposto imposto) {
		return imposto.calculaImposto(orcamento);
	}
}

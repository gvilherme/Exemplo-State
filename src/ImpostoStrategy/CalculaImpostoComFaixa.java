package impostoStrategy;
import entities.Orcamento;

public abstract class CalculaImpostoComFaixa extends Imposto {

	@Override
	public double calculaImposto(Orcamento orcamento) {
		return executaUmaFaixa(orcamento) + calculaComposition(orcamento);
	}
		
	public CalculaImpostoComFaixa(Imposto imposto) {
		super(imposto);	
	}
	
	public CalculaImpostoComFaixa() {
		super();	
	}
	
	protected abstract double executaUmaFaixa(Orcamento orcamento);
	protected abstract double faixaMin(Orcamento orcamento);
	protected abstract double faixaMax(Orcamento orcamento);
}

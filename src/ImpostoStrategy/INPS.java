package ImpostoStrategy;
import Entities.Orcamento;

public class INPS extends CalculaImpostoComFaixa {
	
	public INPS() {
		super();
		// TODO Auto-generated constructor stub
	}

	public INPS(Imposto imposto) {
		super(imposto);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double executaUmaFaixa(Orcamento orcamento) {
		if (orcamento.getValorTotal() >= 1000) {
			return faixaMax(orcamento);
		}
		return faixaMin(orcamento);
	}

	@Override
	protected double faixaMin(Orcamento orcamento) {
		return orcamento.getValorTotal() * 0.05;
	}	
	
	@Override
	protected double faixaMax(Orcamento orcamento) {
		return orcamento.getValorTotal() * 0.1;
	}

}

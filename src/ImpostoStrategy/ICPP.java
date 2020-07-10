package impostoStrategy;
import entities.Orcamento;

public class ICPP extends CalculaImpostoComFaixa{
	
	public ICPP() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ICPP(Imposto imposto) {
		super(imposto);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double executaUmaFaixa(Orcamento orcamento) {		
		if (orcamento.getValorTotal() >= 500) {
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
		return orcamento.getValorTotal() * 0.07;
	}

	

}

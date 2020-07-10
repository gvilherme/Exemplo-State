package impostoStrategy;

import entities.Orcamento;

public class ICMS extends Imposto {

	
	
	public ICMS() {
		super();		
	}

	public ICMS(Imposto impostoComposition) {
		super(impostoComposition);		
	}

	@Override
	double calculaImposto(Orcamento orcamento) {		
		return orcamento.getValorTotal() * 0.1 + calculaComposition(orcamento);
	}

}

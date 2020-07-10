package states;

import exceptions.StateChangeNotSupportedException;

public class EmAprovacao implements EstadoDeOrcamento {

	@Override
	public double descontoParaOEstado(AceitaTrocaDeEstadoDeOrcamento orcamento) {		
		return orcamento.getValorTotal() * 0.05;
	}

	@Override
	public void aprova(AceitaTrocaDeEstadoDeOrcamento orcamento) {
		orcamento.setEstado(new Aprovado());
	}

	@Override
	public void reprova(AceitaTrocaDeEstadoDeOrcamento orcamento) {
		orcamento.setEstado(new Reprovado());		
	}

	@Override
	public void encerra(AceitaTrocaDeEstadoDeOrcamento orcamento) throws StateChangeNotSupportedException{
		throw new StateChangeNotSupportedException();		
	}

}

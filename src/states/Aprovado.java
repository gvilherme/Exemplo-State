package states;

import exceptions.StateChangeNotSupportedException;

public class Aprovado extends EstadoDeOrcamento {
	
	@Override
	protected double descontoParaOEstado(AceitaTrocaDeEstadoDeOrcamento orcamento) {		
		return orcamento.getValorTotal() * 0.02;
	}

	@Override
	public void aprova(AceitaTrocaDeEstadoDeOrcamento orcamento)throws StateChangeNotSupportedException {
		throw new StateChangeNotSupportedException();	
	}

	@Override
	public void reprova(AceitaTrocaDeEstadoDeOrcamento orcamento)throws StateChangeNotSupportedException {
		throw new StateChangeNotSupportedException();			
	}

	@Override
	public void encerra(AceitaTrocaDeEstadoDeOrcamento orcamento) {
		orcamento.setEstado(new Encerrado());	
	}

}

package states;

import exceptions.StateChangeNotSupportedException;

public class Aprovado implements EstadoDeOrcamento {
	
	@Override
	public double descontoParaOEstado(AceitaTrocaDeEstadoDeOrcamento orcamento) {		
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

package states;

import exceptions.SemDescontoParaOEstadoException;
import exceptions.StateChangeNotSupportedException;

public class Reprovado implements EstadoDeOrcamento {

	@Override
	public double descontoParaOEstado(AceitaTrocaDeEstadoDeOrcamento orcamento) throws SemDescontoParaOEstadoException {
		throw new SemDescontoParaOEstadoException();
	}

	@Override
	public void aprova(AceitaTrocaDeEstadoDeOrcamento orcamento) throws StateChangeNotSupportedException {
		throw new StateChangeNotSupportedException();
	}

	@Override
	public void reprova(AceitaTrocaDeEstadoDeOrcamento orcamento) throws StateChangeNotSupportedException {
		throw new StateChangeNotSupportedException();
	}

	@Override
	public void encerra(AceitaTrocaDeEstadoDeOrcamento orcamento){
		orcamento.setEstado(new Encerrado());
	}

}

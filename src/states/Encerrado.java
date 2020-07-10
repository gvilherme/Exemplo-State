package states;

import exceptions.SemDescontoParaOEstadoException;
import exceptions.StateChangeNotSupportedException;

public class Encerrado implements EstadoDeOrcamento {

	@Override
	public double descontoParaOEstado(AceitaTrocaDeEstadoDeOrcamento orcamento) throws SemDescontoParaOEstadoException {
		throw new SemDescontoParaOEstadoException();
	}

	@Override
	public void aprova(AceitaTrocaDeEstadoDeOrcamento orcamento) throws StateChangeNotSupportedException {
		throw new StateChangeNotSupportedException("Imposs�vel mudar estado de orc�amentos encerados.");

	}

	@Override
	public void reprova(AceitaTrocaDeEstadoDeOrcamento orcamento) throws StateChangeNotSupportedException {
		throw new StateChangeNotSupportedException("Imposs�vel mudar estado de orc�amentos encerados.");

	}

	@Override
	public void encerra(AceitaTrocaDeEstadoDeOrcamento orcamento) throws StateChangeNotSupportedException {
		throw new StateChangeNotSupportedException("Imposs�vel mudar estado de orc�amentos encerados.");
	}

}

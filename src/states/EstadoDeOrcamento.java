package states;

import exceptions.SemDescontoParaOEstadoException;
import exceptions.StateChangeNotSupportedException;

public interface EstadoDeOrcamento {
	public double descontoParaOEstado(AceitaTrocaDeEstadoDeOrcamento orcamento) throws SemDescontoParaOEstadoException;
	public void aprova(AceitaTrocaDeEstadoDeOrcamento orcamento) throws StateChangeNotSupportedException;
	public void reprova(AceitaTrocaDeEstadoDeOrcamento orcamento) throws StateChangeNotSupportedException;
	public void encerra(AceitaTrocaDeEstadoDeOrcamento orcamento) throws StateChangeNotSupportedException;
}

package states;

import exceptions.DescontoJaAplicadoException;
import exceptions.SemDescontoParaOEstadoException;
import exceptions.StateChangeNotSupportedException;

public abstract class EstadoDeOrcamento {
	
	protected boolean descontoJaAplicado;	
	
	public EstadoDeOrcamento() {
		super();
		this.descontoJaAplicado = false;
	}
	
	public double obtemDesconto(AceitaTrocaDeEstadoDeOrcamento orcamento) throws SemDescontoParaOEstadoException, DescontoJaAplicadoException {
		if (descontoJaAplicado) {
			throw new DescontoJaAplicadoException();
		}
		descontoJaAplicado = true;
		return descontoParaOEstado(orcamento); 
	}
	protected abstract double descontoParaOEstado(AceitaTrocaDeEstadoDeOrcamento orcamento) throws SemDescontoParaOEstadoException;
	public abstract void aprova(AceitaTrocaDeEstadoDeOrcamento orcamento) throws StateChangeNotSupportedException;
	public abstract void reprova(AceitaTrocaDeEstadoDeOrcamento orcamento) throws StateChangeNotSupportedException;
	public abstract void encerra(AceitaTrocaDeEstadoDeOrcamento orcamento) throws StateChangeNotSupportedException;		
}

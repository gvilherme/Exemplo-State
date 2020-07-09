package ImpostoStrategy;
import Entities.Orcamento;

public abstract class Imposto {
	
	protected Imposto impostoComposition;
			
	public Imposto(Imposto impostoComposition) {
		super();
		this.impostoComposition = impostoComposition;
	}
	
	public Imposto() {
		super();
	}

	abstract double calculaImposto(Orcamento orcamento);
	
	protected double calculaComposition(Orcamento orcamento) {
		return (impostoComposition != null ? impostoComposition.calculaImposto(orcamento) : 0);
	}
}

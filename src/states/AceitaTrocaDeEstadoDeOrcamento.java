package states;

public abstract class AceitaTrocaDeEstadoDeOrcamento {
	
	protected EstadoDeOrcamento estado;	
	
	public AceitaTrocaDeEstadoDeOrcamento() {
		super();
		this.estado = new EmAprovacao();
	}
	
	protected abstract void setEstado(EstadoDeOrcamento estado);
	
	protected abstract void setValorDepoisDoDescontoPeloEstado(double valorDoDesconto);
	
	protected abstract double getValorTotal();
	
	public void aplicaDescontoPeloEstado() {
		try {
			setValorDepoisDoDescontoPeloEstado(estado.obtemDesconto(this));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}
	
	public void aprova() {
		try {
			estado.aprova(this);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}
	
	public void reprova() {
		try {
			estado.reprova(this);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public void encerra() {
		try {
			estado.encerra(this);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
}

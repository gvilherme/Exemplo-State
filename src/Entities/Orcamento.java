package entities;
import java.util.Collections;
import java.util.List;

import states.AceitaTrocaDeEstadoDeOrcamento;
import states.EmAprovacao;
import states.EstadoDeOrcamento;

public class Orcamento extends AceitaTrocaDeEstadoDeOrcamento {
	private List<Items> items;
	private double valorTotal;	

	public Orcamento(List<Items> items) {
		super();
		this.items = items;
		atualizaValorTotal();		
	}

	public List<Items> getItems() {
		return Collections.unmodifiableList(items);
	}

	@Override
	public double getValorTotal() {		
		return valorTotal;
	}
	
	public void atualizaValorTotal() {
		valorTotal = 0;
		items.forEach(item -> valorTotal += item.getValorTotal());		
	}

	public EstadoDeOrcamento getEstado() {
		return estado;
	}

	@Override
	protected void setEstado(EstadoDeOrcamento estado) {
		this.estado = estado;
	}

	@Override
	protected void setValorDepoisDoDescontoPeloEstado(double novoValorTotal) {
		valorTotal -= novoValorTotal;		
	}
	
}

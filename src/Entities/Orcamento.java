package Entities;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	private List<Items> items;
	private double valorTotal;

	public Orcamento(List<Items> items) {
		super();
		this.items = items;
	}

	public List<Items> getItems() {
		return Collections.unmodifiableList(items);
	}

	public double getValorTotal() {
		setValorTotal();
		return valorTotal;
	}
	
	public void setValorTotal() {
		valorTotal = 0;
		items.forEach(item -> valorTotal += item.getValorTotal());
	}

}

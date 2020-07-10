package entities;

public class Items {
	private String itemName;
	private int qnt;
	private double valorUnit;
	private double valorTotal;
	
	
	public Items(String itemName, int qnt, double valorUnit) {
		super();
		this.itemName = itemName;
		this.qnt = qnt;
		this.valorUnit = valorUnit;
	}
	
	public String getItemName() {
		return itemName;
	}
	public int getQnt() {
		return qnt;
	}
	public double getValorUnit() {
		return valorUnit;
	}
	public double getValorTotal() {
		return valorUnit * qnt;
	}	
	
}

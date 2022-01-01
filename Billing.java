package test;

public class Billing {
	protected String title;
	protected double price;
	protected boolean ask=false;
	protected String startDate;
	
	public Billing(String title, double price,String startDate) {
		this.title = title;
		this.price = price;
		this.startDate = startDate;
	}
}

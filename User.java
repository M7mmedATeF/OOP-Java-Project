package test;
import java.util.Scanner;

public class User {
	protected Billing[] bill = new Billing[10];
	protected String name;
	
	public User(Billing[] bill, String name) {
		this.bill = bill;
		this.name = name;
	}
	
	public void askToPay() {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < bill.length; i++) {
			if(bill[i]!=null)
				System.out.println((i+1)+"- "+"Title: "+bill[i].title+"| Price:"+bill[i].price);
		}
		try {
			System.out.print("Enter Billing's Num To Pay: ");
			int num = in.nextInt();
			bill[num-1].ask = true;
		}catch(NullPointerException msg) {
			msg.getMessage();
		}
		System.out.println("-------------------------");
	}
	
	public void removeBilling(int index) {
		this.bill[index] = null;
	}
	
	public void addBill(Billing bill) {
		for (int i = 0; i < this.bill.length; i++) {
			if(this.bill[i] == null) {
				this.bill[i] = bill;
			}
		}
	}
	
	public void displayBilling() {
		System.out.println(this.name +"'s Billings:");
		for (int i = 0; i < this.bill.length; i++) {
			if(this.bill[i] != null) {
				System.out.println((i+1)+"- "+"Title: "+bill[i].title+"| Price:"+bill[i].price);
			}
		}
		System.out.println("-------------------------");
	}
	
}

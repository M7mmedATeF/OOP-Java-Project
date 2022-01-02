package test;
import java.util.Scanner;

public class Admin {
	protected User[] users = new User[100];

	public Admin(User[] users) {
		this.users = users;
	}
	
	public void billingsPayment() {
		for (int i = 0; i < users.length; i++) {
			if(users[i] != null) {
				boolean noBilling = true;
				System.out.println("Requests of " + users[i].name +":");
				for (int j = 0; j < users[i].bill.length; j++) {
					if(users[i].bill[j] != null)
						if(users[i].bill[j].ask) {
							noBilling = false;
							System.out.println("  "+(j+1)+"- "+"Title: "+users[i].bill[j].title+"| Price:"+users[i].bill[j].price);
						}
				}
				if(!noBilling) {
					Scanner in = new Scanner(System.in);
					System.out.print("Enter Billing's Num To Accept or (-1) to skip: ");
					int num = in.nextInt();
					if(num >= 0)
						try {
							users[i].bill[num-1] = null;
						}catch(NullPointerException msg) {
							msg.getMessage();
						}
					System.out.println("-------------------------");
				}
			}
		}
	}

	public void addBilling() {
		Scanner in = new Scanner(System.in);
		System.out.println("Users: ");
		for (int i = 0; i < users.length; i++) {
			if(users[i] != null) {
				System.out.println((i+1)+"-  "+users[i].name);
			}
		}
		try {
			System.out.print("Enter User's Number to add a Billing: ");
			int num = in.nextInt();
			System.out.println("---------------------------");
			
			System.out.print("Billing's Title: ");
			String title = in.next();
			
			System.out.print("Billing's Price: ");
			double price = in.nextDouble();
			
			System.out.print("Billing's Date: ");
			String date = in.next();
			
			Billing b = new Billing(title,price,date);
			
			users[num-1].addBill(b);
		}catch(NullPointerException ex) {
			System.out.println("Worng Number");
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Maximum Billings Reached");
		}catch(Exception ex) {
			ex.getMessage();
		}finally {
			System.out.println("---------------------------");
		}
	}
}

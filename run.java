package test;

public class run {

	public static void main(String[] args) {
		/* Variables Deceleration */
		Billing[] b = new Billing[10];
		b[0] = new Billing("Billing 1",250,"25-dec-2020");
		b[1] = new Billing("Billing 2",90,"6-oct-2021");
		
		Billing[] b2 = new Billing[10];
		b2[0] = new Billing("Billing 1",100,"25-dec-2020");
		b2[1] = new Billing("Billing 2",120,"6-oct-2021");

		User[] user = new User[100];
		user[0] = new User(b,"Mohammed");
		user[1] = new User(b2,"Ahmed");
		Admin admin = new Admin(user);
		
		/* Starting Code */
		admin.users[0].askToPay();
		admin.users[1].askToPay();
		admin.billingsPayment();
		admin.users[0].displayBilling();
		admin.users[1].displayBilling();
		admin.addBilling();
		admin.users[0].displayBilling();
		admin.users[1].displayBilling();
		
	}

}

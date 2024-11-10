package anurag;
class bankClient{

	int balAmt = 5000;
	
	synchronized void withdraw(int amt) {
		System.out.println("Withdrawing money");
		balAmt -= amt;
		System.out.println("Current Balance: " + balAmt );
	}
	
	
	synchronized void deposit(int amt) {
		System.out.println("Withdrawing money");
		balAmt += amt;
		System.out.println("Current Balance: " + balAmt );
		notify();
		
	}
	
}
public class multiThread {

	public static void main(String args[]) {
		 bankClient b = new bankClient();
	
		new Thread() {
			public void run() {
			 b.withdraw(3000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				b.deposit(5000);
			}
		}.start();
	}
}



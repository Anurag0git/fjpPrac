package anurag;

public class first50PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		for(int i = 2; i<=50; i++) {
			if(isPrime(i)) System.out.println(i);
		}
		
		
		
	}
//
	public static boolean isPrime(int n) {
		for(int i = n-1; i>1; i--) {
			if(n%i==0) return false;
		}
		return true;

	}
}
package anurag;

public class sumAndAvgOfNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//			Sum of first 100 numbers and average of first 100 numbers
		
		System.out.println("Sum is : "+sum(100));
		System.out.print("Average is : "+sum(100)/100);
	
	}

	public static long sum(int n) {
		if(n == 1) return 1;
		return n+sum(n-1);
	}
	
	
}

package anurag;
import java.util.*;
public class excepHandling {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number you want to divide with: ");
		int num = sc.nextInt();
		
		
		try {
			System.out.println("Enter the divisor: ");
			int divisor = sc.nextInt();
			int ans = divisor / num;
			System.out.println("Quotient is: " + ans);
		}catch(ArithmeticException ae) {
			System.out.println("Cannot " +ae.getMessage());
		}
		
		int[] arr = new int[3];
		try {
			arr[0] =2;
			arr[1] =3;
			arr[2] =5;
			arr[3] =6;
			
		}catch(Exception e) {
			System.out.println("Cannot " +e.getMessage());
		}
	}

}

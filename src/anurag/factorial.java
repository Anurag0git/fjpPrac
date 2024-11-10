package anurag;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(fact(5));
		
	}
	
	public static long fact(int n) {
		long ans = 1;
		
		if(n<=1) return 1;
		for(int i = 1; i<=n; i++) {
			ans *= i;
		}
		return ans;
	}

}

package anurag;

public class constructorOverloading {

	int x;
	int y;
	
	constructorOverloading(){
		x = 4;
		y = 5;
	}
	
	constructorOverloading(int a, int b){
		x = a;
		y = b;
	}
	
	
	public void display() {
		System.out.println("x: "+ x + " y: " + y );
	}
	
	
	
	public static void main(String args[]) {
		
		constructorOverloading c1 = new constructorOverloading();
		constructorOverloading c2 = new constructorOverloading(10, 20);
		
		
		c1.display();
		c2.display();
		
	}
}

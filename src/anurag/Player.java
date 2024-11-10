package anurag;

public class Player {

	
	public static void main(String[] args) {

		footballPlayer f = new footballPlayer("ramesh", 40);
		cricketPlayer c = new cricketPlayer("suresh", 32);
		hockeyPlayer h = new hockeyPlayer("raj", 38);
		
		System.out.println( f.name +" is a FootBall player.");
		System.out.println( c.name +" is a Cricket player.");
		System.out.println( h.name +" is a Hockey player.");

	}

}

class P{
	String name;
	int age;
	
	public P(String name, int age) {
	
		this.name = name;
		this.age = age;
		}
}


class footballPlayer extends P{

	public footballPlayer(String name, int age) {
		super(name, age);
	}
}

class cricketPlayer extends P{

	public cricketPlayer(String name, int age) {
		super(name, age);
	}
	
}

class hockeyPlayer extends P{

	public hockeyPlayer(String name, int age) {
		super(name, age);
	}
	
}
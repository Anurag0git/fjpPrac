package anurag;

import java.util.Scanner;

public class Rectangle {


	 double width;
	double length;
	double area; 
	String color;
	
	
	void get_width(){
		Scanner sc = new Scanner(System.in);
		width = sc.nextDouble();
	}
	
	void get_length(){
		Scanner sc = new Scanner(System.in);
		length = sc.nextDouble();
	}
	
	void find_area(){
		area = length*width;
	}
	
	void get_color(){
		Scanner sc = new Scanner(System.in);
		color = sc.next();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Rectangle a = new Rectangle();
	Rectangle b = new Rectangle();
	
	System.out.println("Enter the length of rectangle 1");
	a.get_length();

	System.out.println("Enter the width of rectangle 1");
	a.get_width();

	System.out.println("Enter the color of rectangle 1");
	a.get_color();
	
	System.out.println("Enter the length of rectangle 2");
	b.get_length();
	
	System.out.println("Enter the width of rectangle 2");
	b.get_width();
	
	System.out.println("Enter the color of rectangle 2");
	b.get_color();
	
	
	a.find_area();
	b.find_area();
	if(a.area == b.area && a.color.equals(b.color)  ) {
		System.out.println("Matching");
	}
	else System.out.println("Not Matching");
}
}
package com.del.app.interfacedemo;

interface Printable{
	void print();
}

//class Printer implements Printable{
//	public void print() {
//		System.out.println("Hello World");
//	}
//}

interface Calculator{
	int calculate(int a, int b);
}

public class InterfaceExample {

	public static void main(String[] args) {
		
		Printable obj = ()-> System.out.println("Hello Everyone");
		
		obj.print();
		
		Calculator adder = (a,b)-> a+b;
		
		int output = adder.calculate(10, 15);
		System.out.println("Output = "+output);
		
		Calculator multiplyer = (a,b) -> a*b;
		output  = multiplyer.calculate(10, 15);
		
		System.out.println("Output = "+output);
		
	}
	
}

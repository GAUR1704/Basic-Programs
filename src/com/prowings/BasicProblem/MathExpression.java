package com.prowings.BasicProblem;

public class MathExpression {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		System.out.println("The value of x : " + x + ", y : " + y);
		
		int i = (4*x)*(4*x);
		
		int j = (5*y)*(5*y)*(5*y);
		
		int Z =(i+j)/2*x*y;
		
		System.out.println("The value of Math Expression is : "+ Z);

	}

}



package oop1;

public class Addition {
	int x;
	int y;
	//return type method name()
	void add () {
		int sum = x+y;
		System.out.println(sum);
		
	}//end add
	
	int add(int a, int b, int c) {
		int sum = a+b+c;
		return sum;
	
	}//end add

	double add (double a, double b, double c) {
		double sum = a+b+c;
		return sum;
		
	}//end add
	public static void main(String[] args) {
		
		Addition a1 = new Addition();
		a1.x=10;
		a1.y=20;
		a1.add();
		
		Addition a2 = new Addition();
		a2.x=100;
		a2.y=200;
		a2.add();
		
		
		

	}//end main

}//end class

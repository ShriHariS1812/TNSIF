package org.tnsif.cpg.C2TC.demo;

public class VariableDemo {
	int a=10; //intstance Variable :Variable Declared inside a class.
	void print()
	{
		String msg="this is a local variable";//Local Variable: Variable Declared inside a method.
		System.out.println(msg);
	}
	static String hari="this is a static variable";//Static Variable: Variable declared with Static keyword
	public static void main(String[] args) {
		VariableDemo obj=new VariableDemo();
		System.out.println("instance variable " +obj.a);
		obj.print();
		System.out.println(hari);

	}

}

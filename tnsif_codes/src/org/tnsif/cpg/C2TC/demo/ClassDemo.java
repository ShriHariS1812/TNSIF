package org.tnsif.cpg.C2TC.demo;

class Student {
	int id;
	String name;

	void display() {
		System.out.println("student information: Name & ID:" + name + "  " + id);
	}
}

public class ClassDemo {
	public static void main(String[] args) {
		Student obj = new Student();
		obj.id = 18;
		obj.name = "Virat";
		obj.display();
	}

}
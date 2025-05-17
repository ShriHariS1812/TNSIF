package org.tnsif.cpg.C2TC.demo;

public class TypeCastingDemo {

	public static void main(String[] args) {
		//Implicit Casting
		byte b=18;  //1 byte
		int i=b;  //4 byte
		System.out.println(i);
		
		
		float v=46.27f;
		double k=v;
		System.out.println(k);
		
		//Explicit Casting 
		double s=18.09d;
		long h=(long)s;
		System.out.println(h);
		
		float ss=14.12f;
		int p=(int)ss;
		System.out.println(p);
	}

}

package org.tnsif.cpg.C2TC.demo;

public class AssignmentOperator {
		public static void main(String[] args) {
			int a=10;
			
			//add and assign
			a+=5; //a=a+5
			System.out.println("a after +=  " +a);
			
			a-=3; // a=a-3 Subtract and assign
			System.out.println("a after -=  "  +a);
			
			a*=2;  //a=a*2 Multiply and assign
			System.out.println("a after *=  "  +a);
			
			a/=4; //a=a/4 Divide and assign
			System.out.println("a after /=  " +a);
			
			a%=3; //a=a%3 Modulus and assign
			System.out.println("a after %=  " +a);

		}
}

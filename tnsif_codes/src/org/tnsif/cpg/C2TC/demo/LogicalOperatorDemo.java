package org.tnsif.cpg.C2TC.demo;

public class LogicalOperatorDemo {
		public static void main(String[] args) {
			int a=10, b=5 ,c=20;
			
			//logical AND
			System.out.println("(a>b) && (b<c):" + ((a>b) && (b<c)));
			//1 * 1 =1
					
			//logical or
			System.out.println("(a>b) || (b<c):"  + ((a>b) || (b<c)));
			//1 + 1 =1
			
			
			//logical NOT
			System.out.println("!(a>b): "+ !(a>b));
			
			// true ~false
			

		}
}

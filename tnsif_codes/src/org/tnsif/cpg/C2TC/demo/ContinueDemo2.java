package org.tnsif.cpg.C2TC.demo;

public class ContinueDemo2 {
		public static void main(String[] args) {
			for(int i=1;i<100;i++)
			{
				if(i==5 || i== 45)
				{
					continue;
				}
				System.out.println(i);
			}

		}
}

package org.tnsif.cpg.C2TC.demo;
class Continue {
	void display() {
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
public class ContinueDemo {
		public static void main(String[] args) {
			int i=1;
			while (i<=100)
			{
				if(i==7 || i==11 || i==45 || i==16)
				{
					i++;
					continue;
					
				}
				System.out.println(i);
				i++;
			}
			Continue obj=new Continue();
			obj.display();
		}
}

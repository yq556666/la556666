package testPaper;

import javax.security.auth.x500.X500Principal;

public class loopTest 
{
	static int i = 7;
	public static void print()
	{
		int k = i;
		for(int x=1; x<=9;x++)
		{
			for(int y=1;y<=x;y++)
			{
				System.out.print(y+"*"+x+"="+(x*y)+"\t");
			}
		System.out.println();
		break;
		}
	System.out.println("game over");
	}
	public static String testMethod(int n)
	{
		String r = "none";
		switch (n) {
		case 1:
			r= "one";
		case 2:
			r= "two";
		case 3:
			r ="three";
		default:
			r= "lala";
		
		}
		return r;
	}
	
	public static void main(String[] args)
	{
		String teString = loopTest.testMethod(1);
		System.out.println(teString);
		boolean tt = teString.valueOf();
		System.out.println(tt);
	}
}

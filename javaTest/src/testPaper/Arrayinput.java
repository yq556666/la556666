package testPaper;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Arrayinput 
{
	public void reverseArray(int [] intArray)
	{
		for(int i = intArray.length-1; i>=0; i--)
		{
			System.out.print(intArray[i] + ",");
		}

	}
	public static void main(String[] args) 
	{
		int[]a = {1,2,3};
		Arrayinput kk = new Arrayinput();
		kk.reverseArray(a);
		int a1 =1;
		int b = 2;
		int c= a1<b?a1:b;
		System.out.println("\n"+c);
	}
}


package testPaper;

import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;

public class forLoop 
{
	static int x =3;
	public static void main(String[] args)
	{
		int i = 3;
		while (i >= 0)
		{
			System.out.print(" " + i);
			--i;
		}
	System.out.println();
	
	String str1 = "banana";
	String str2 = "PIE";
	
	System.out.print(str1.compareTo(str2));
	for(int x=0; x<=5;x++);
	System.out.println("\n" +x);
	ArrayList<Double> marks = new ArrayList<Double>();
	marks.add(3.0);
	marks.add(2.5);
	marks.add(4.7);
	marks.add(3, 3.9);
	marks.add(1, 1.5);
	marks.remove(2);
	marks.remove(1);
	int c =marks.lastIndexOf(3.9);
	boolean d = marks.contains(2.5);
	int e =marks.indexOf(4.7);
	System.out.println(e);
	int j = 0;
	try 
	{
		j=1;
		throw new MyException(j);
		j=2;
	}catch(MyException  e1)
	{
		j = e1.getErrorCode();
	}catch (Exception e2)
	{
		j=3;
	}
	System.out.println(j);
	}
}


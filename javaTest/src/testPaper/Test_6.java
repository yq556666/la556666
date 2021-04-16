package testPaper;

import java.util.Arrays;

import org.omg.CORBA.PUBLIC_MEMBER;

import Problem.StaticMethod;

public class Test_6 
{
	 int x =3;
	public static void main(String[] args)
	{
		//for(int x =0; x<5; x++);
		//System.out.print(x);
		/*Test_6 kkTest_6 = new Test_6();
		kkTest_6.x =2;
		System.out.println(kkTest_6.x);
		String aString ="2.4";
		double d= Double.parseDouble(aString);
		double a =Math.round((d/3));
		System.out.print(a);
		System.out.println(aString.toUpperCase());
		Double kkDouble= 2.0;
		String ddString=Double.toString(2.0);*/
		String aString = "tdad";
		String bString ="acds";
		String cString= aString+bString;
		char[] tt = cString.toCharArray();
		Arrays.sort(tt);
		String d= new String(tt);
		System.out.println(d);
		char kk = 'c';
		String bbbbbbString= tt.toString();
	}
}



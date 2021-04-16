package testPaper;

import org.omg.CORBA.PUBLIC_MEMBER;

import Problem.StaticMethod;

public class Test10_1 extends Test10{
	public int addCount() {
        return count += 2;
	}
        public static void main(String[] args)
        {
        	Test10_1 ddTest10_1 =new Test10_1();
        
        	int count = ddTest10_1.addCount();
        	int b =3;
        	int a =b/2;
        System.out.println(count);
        System.out.println(a);
        }
}


package testPaper;

import java.util.InputMismatchException;
import java.util.Scanner;

public class printArray 
{
	public static void main(String[] args)
	{
		int number;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an integer");
		number = keyboard.nextInt();
		/**for(int i=0;i<=number;i++)
		{
			int j=i;
			while(j>0)
			{
				System.out.print("*");
				j--;
			}
			System.out.println("\n");
			int[] myarray = new int [10];
			for(int k=0;k<10;k++)
			{
				myarray[k]= (int) Math.pow(k, 2.0);
				System.out.println(myarray[k]);
			}
			
		}*/
		boolean flag = true;
		for(int i =2; i*i <= number;i++)
		{
			if(number %i == 0)
			{
				flag = false;
			}
		}
		if(flag == false)
		{
			System.out.println(number + "is not prime number;");
		}
		else 
		{
			System.out.println(number + "is prime number;");
		}
		
	}
}

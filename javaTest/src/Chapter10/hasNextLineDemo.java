package Chapter10;

import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class hasNextLineDemo 
{
	public static void main(String[] args)
	{
		Scanner read = null;
		PrintWriter write = null;
		try 
		{
			read = new Scanner(new FileInputStream("original.txt"));
			write = new PrintWriter(new FileOutputStream("number.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Problem opening files.");
			System.exit(0);
		}
		String line =null;
		int count =0;
		while(read.hasNextLine())
		{
			line = read.nextLine();
			count++;
			write.println(count + " "+ line);
		}
		read.close();
		write.close();
		
		
	}
}

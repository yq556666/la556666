package Chapter10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedReaderTest
{
	public BufferedReaderTest(FileReader fileReader) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		BufferedReader reader = null;
		
		try 
		{
			reader = new BufferedReader(new FileReader("morestuff2.txt"));
			String line = reader.readLine();
			System.out.println("The first read from the file is:");
			System.out.println(line);
			String line2 = reader.readLine();
			System.out.println("The second read from the file is:");
			System.out.println(line2);
		
		} catch (IOException e) 
		{
			System.out.println("Error reading from morestuff2.txt");
		}
	}
}

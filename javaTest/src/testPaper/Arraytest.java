package testPaper;

public class Arraytest 
{
	
	public static void main(String[] args)
	{
		int lowNumber = 0;
		int upperNumber =0;
		String test = "AJDDADSadadfefd";
		for(int i =0;i<test.length();i++)
		{
			char e =test.charAt(i);
			if(e>='a' && e <= 'z')
			{
				lowNumber++;
			}else if (e>='A'&& e<='Z') 
			{
				upperNumber++;
			}
		
		}
		System.out.println(lowNumber+ " "+ upperNumber);
	}
}


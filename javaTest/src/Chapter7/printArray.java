package Chapter7;

import java.util.Arrays;
import java.util.concurrent.Semaphore;

import javax.xml.bind.SchemaOutputResolver;

import testPaper.forLoop;

public class printArray 
{
	public static void main(String[] args) 
	{
		String sentence1 = "abc";
		String sentence2 = "ade";
		int index1=0;
		int index2=0;
		int index = 0;
		int number1 = sentence1.length();
		int number2 =sentence2.length();
		char[] sentence3 =new char[number1+number2];
		String sentence;
		char temp;
		sentence =sentence1 + sentence2;
		char [] sen =sentence.toCharArray();
		for(int i = 0; i <= (number1 + number2-2); i++)
		{
			char min;
			min = sen[i];
			for(int j=i+1; j< (number1+number2-1);j++)
			{
				if(sen[j] <= min)
				{
					min = sen[j];
					temp =sen[i];
					sen[i] = sen[j];
					sen[j] =temp;
				}
			}
		}
		if(sentence.contains("dd"))
		{
			System.out.println("Wow");
		}
		
		while(index1<number1 && index2 <number2)
		{
			if(sentence1.charAt(index1) < sentence2.charAt(index2))
			{
				sentence3[index] = sentence1.charAt(index1);
				index1++;
				index++;
			}
			else if((sentence1.charAt(index1) > sentence2.charAt(index2)))
			{
				sentence3[index] = sentence2.charAt(index2);
				index2++;
				index++;
			}
			else if(sentence1.charAt(index1) == sentence2.charAt(index2))
			{
				sentence3[index] = sentence1.charAt(index1);
				sentence3[index+1] = sentence2.charAt(index2);
				index1++;
				index2++;
				index =+ 2;
			}
			
		}
		String sentenceReturn = null;
		if(number1 == index1)
		{
			sentenceReturn = new String(sentence3);
			sentenceReturn += sentence2.substring(index2, number2); 
		}
		else
		{
			sentenceReturn = new String(sentence3);
			sentenceReturn += sentence1.substring(index1, number1);
		}
		
		System.out.println(sentenceReturn);
		for(int i =0; i<number1+number2;i++)
		{
			System.out.println(sen[i]);
		}
	String sentence4 = sentence1 + sentence2;
	char[] tempt = sentence4.toCharArray();
	Arrays.sort(tempt);
	String sentence5 = new String(tempt);
	System.out.println(sentence5);
	&&
	}
}

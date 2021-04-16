package Chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class golfScore 
{
	public static void main(String[] args)
	{
		ArrayList <Double> score = new ArrayList<Double>();
		System.out.println("This program reads golf score and shows");
		System.out.println("how much each differs from the average");
		System.out.println("Enter golf score: ");
		golfScore scores = new golfScore();
		scores.fillArrayList(score);
		scores.showDifference(score);
	}
	
	public void fillArrayList(ArrayList<Double> a)
	{
		System.out.println("Enter a list of noonegative numbers.");
		System.out.println("Mark the end of the list with a negative number.");
		Scanner keyboard = new Scanner(System.in);
		double next;
		int index = 0;
		next = keyboard.nextDouble();
		while(next >= 0)
		{
			a.add(next);
			next = keyboard.nextDouble();
		}
	}
	
	public  double computeAverage(ArrayList<Double> a)
	{
		double total = 0;
		//for (Double element : a);//A for-each loop is the nicest way to cycle through all the elements in a ArrayList
		//	total = total + element;
		for(int i=0; i < a.size(); i++)
		{
			total = total + a.get(i);
		}
	
		int numberOfScores = a.size();
		if (numberOfScores > 0)
		{
			return (total/numberOfScores);
		}
		else 
		{
			System.out.println("ERROR: Trying to average 0 number.");
			System.out.println("computeAverage returns 0.");
			return 0;
		}
	}
	
	public void showDifference(ArrayList<Double> a)
	{
		double average = computeAverage(a);
		System.out.println("Average of the " + a.size() +" score = " +average);
		System.out.println("The scores are:");
		for (int i=0; i < a.size(); i++ )
		{
			System.out.println(a.get(i) + " differs from average by " + (a.get(i) -average));
		}
	}
}

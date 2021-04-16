package Chapter9;

	import java.util.Scanner;
	import java.util.InputMismatchException;

	public class MismatchExceptionTest 
	{
	    public static void main(String[] args)
	    {
	        Scanner keyboard = new Scanner(System.in);
	        int number = 0; //to keep compiler happy
	        boolean done = false;

	        while (! done)
	        {
	            try
	            {
	            	
	                System.out.println("Enter a whole number:");
	                number = keyboard.nextInt();
	                done = true;
	                throw new InputMismatchException();
	             }
	             catch(InputMismatchException e)
	             {
	                 keyboard.nextLine();
	                 System.out.println("Not a correctly written whole number.");
	                 System.out.println("Try again.");
	             }
	        }

	        System.out.println("You entered " + number);
	    }
	}


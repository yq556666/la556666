package testPaper;

import org.omg.CORBA.PUBLIC_MEMBER;

public class IllegalOperationException extends Exception 
{
	public IllegalOperationException(String message)
	{
		super(message);
	}
	public IllegalOperationException() {
		// TODO Auto-generated constructor stub
	}
	public void throwMethod() throws IllegalOperationException
	{
		throw new IllegalOperationException();
	}
}

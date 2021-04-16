package testPaper;

public class MyException extends Exception 
{
	private int errorCode;
	public MyException(int k)
	{
		errorCode = k;
	}
	public int getErrorCode()
	{
		return errorCode;
	}
}

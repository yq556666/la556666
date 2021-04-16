package Chapter11;

public class Pair<T> 
{
	private T first;
	private T second;
	
	public Pair()
	{
		first = null;
		second = null;
	}
	
	public Pair (T firstItem, T secondItem)
	{
		first = firstItem;
		second = secondItem;
	}
	
	public T getFirst()
	{
		return first;
	}
	public T getSecond()
	{
		return second;
	}
	
	public void setFirst(T newfirst)
	{
		first = newfirst;
	}
	
	public void setSecond(T newSecond)
	{
		second = newSecond;
	}
	
	public String toString()
	{
		return ("first: " + first.toString()+ "\n" +"second: "+ second.toString());
	}
	
	public boolean equals(Object otherObject) 
	{
		if(otherObject == null)
		{
			return false;
		}
		else if(getClass() != otherObject.getClass())
		{
			return false;
		}
		else 
		{
			Pair<T> otherPair = (Pair<T>) otherObject;
			return (first.equals(otherPair.first) && second.equals(otherPair.second));
		}
	}
}

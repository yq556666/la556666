package Chapter8;

public class Player 
{
	private String name;
	private int Id;
	
	public Player()
	{
		
	}
	
	public Player(String name,int id)
	{
		this.name = name;
		this.Id=id;
	}
	public String getName()
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name =name;
	}
	
	public int getId() 
	{
		return Id;
	}
	
	public void setID(int id)
	{
		this.Id = id;
	}
	
}

package Chapter8;

public class Person 
{
	String name;
	int id;
	String information;
	public Person()
	{

	}
	public Person(String name,int id)
	{
		this.name= name;
		this.id = id;
	}
	/*public Person(String name, int id,String information)
	{
		this.name= name;
		this.id = id;
		this.information= information;
	}
	*/
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
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void printInformation()
	{
		System.out.println("person name is "+name+"\n"+"person id is "+id);
	}
}

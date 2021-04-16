package Chapter8;

public class Student extends Person
{
	String school;
	public Student()
	{
		super();
	}
	public Student(String name,int id)
	{
		super(name,id);
	}
	public Student(String name, int id, String school)
	{
		super(name,id);
		this.school =school;
	}
	public void printInformation() 
	{
		System.out.println("person name is "+name+"\n"+"person id is "+id+"\n"+"school is "+ school);
	}
	public void kiss() 
	{
		System.out.println("forbidding kiss");
	}
}

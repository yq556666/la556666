package Chapter8;

public class Test 
{
	public static void main(String[] args) 
	{
		Person person1 = new Person("jack",3);
		Student student1 = null;
		if(person1.getClass() == Student.class ) 
		{
			student1 = (Student) person1;
			student1.printInformation();
		}
		Student student2 = new Student("alex",2322,"QingHua");
		person1 = student2;
		person1.printInformation();
		
		


	}

}

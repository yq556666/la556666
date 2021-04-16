package Problem;

public class DeepCopy
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
	Teacher2 teacher = new Teacher2();
	teacher.setName("Delacey");
	teacher.setAge(29);
	
	Student3 student1 = new Student3();
	student1.setName("Dream");
	student1.setAge(18);
	student1.setTeacher(teacher);
	
	Student3 student2 = (Student3) student1.clone();
	System.out.println("拷贝后");
	System.out.println(student2.getName());
	System.out.println(student2.getAge());
	System.out.println(student2.getTeacher().getName());
	System.out.println(student2.getTeacher().getAge());
	System.out.println("修改老师的信息后");
	
	teacher.setName("Jam");
	System.out.println(student1.getTeacher().getName());
	System.out.println(student2.getTeacher().getName());
	}
}


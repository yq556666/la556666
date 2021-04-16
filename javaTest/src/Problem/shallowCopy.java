package Problem;

public class shallowCopy 
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Teacher teacher = new Teacher();
		teacher.setName("Delacey");
		teacher.setAge(29);
		
		Student2 student1 = new Student2();
		student1.setName("Dream");
		student1.setAge(18);
		student1.setTeacher(teacher);
		
		Student2 student2 = (Student2) student1.clone();
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

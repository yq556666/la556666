package Problem;

public class Student3 implements Cloneable
{
	private String name;
	private int age;
	private Teacher2 teacher2;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the teacher2
	 */
	public Teacher2 getTeacher() {
		return teacher2;
	}
	/**
	 * @param teacher2 the teacher2 to set
	 */
	public void setTeacher(Teacher2 teacher2) {
		this.teacher2 = teacher2;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		Student3 student = (Student3) super.clone();
		student.setTeacher((Teacher2)student.getTeacher().clone());
		return student;
	}
	
	
}

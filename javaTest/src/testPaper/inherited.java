package testPaper;

public class inherited extends Base
{
 public int addCount()
 {
	 return count++;
 }
 public static void main(String[] args)
 {
	 inherited testInherited = new inherited();
	 int i = testInherited.addCount();
	 System.out.println(i);
	 
 }
}

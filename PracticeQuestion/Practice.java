import java.util.Scanner;
class Practice
{
	public static void main(String[] args)
	{
		Student john=new Student("John",2);
		System.out.println(john.name);
		System.out.println(john.roll_no);
	}
}
class Student
{
	String name;
	int roll_no;
	Student(String name,int roll_no)
	{
		this.name=name;
		this.roll_no=roll_no;
	}
}
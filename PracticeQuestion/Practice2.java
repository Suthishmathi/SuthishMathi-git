import java.util.Scanner;
class Practice2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		int l=sc.nextInt();
		int b=sc.nextInt();
		Rectangle r=new Rectangle(l,b);
		System.out.println(r.area());
		l=sc.nextInt();
		b=sc.nextInt();
			Rectangle r1=new Rectangle(l,b);
			System.out.println(r1.area());
	}
}
class Rectangle
{
	int length,breadth;
	Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public int area()
	{
		int area1=length*breadth;
		return area1;
	}	
}
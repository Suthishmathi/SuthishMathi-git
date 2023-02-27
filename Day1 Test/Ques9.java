import java.util.Scanner;
class Ques9
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		int total=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
				total+=i;
		}
		if(total==num)
			System.out.println("True");
		else 
			System.out.println("False");
	}
}
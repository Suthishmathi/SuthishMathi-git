import java.util.Scanner;
class Ques6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Size : ");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(i==0)
				System.out.println(a[i]);
			else
				add(a,i);
		}
	}
	public static void add(int a[],int end)
	{
		int sum=0;
		for(int i=0;i<=end;i++)
		{
			sum+=a[i];
			if(i==end)
				System.out.print(a[i]+"=");
			else
			System.out.print(a[i]+"+");
		}
		System.out.println(sum);
	}
}
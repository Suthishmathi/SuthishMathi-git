import java.util.Scanner;
class SumOfInteger
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the target : ");
		int target=sc.nextInt();
		rec(a,target,0);
	}
	public static rec()
	{
		
	}
}
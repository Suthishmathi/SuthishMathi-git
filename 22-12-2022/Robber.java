import java.util.Scanner;
class Robber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int sum=0,sum1=0;
		for(int i=0;i<n;i++)
		{
			int num=sum+a[i];
			sum=sum>sum1?sum:sum1;
			sum1=num;
		}
		int res=(sum>sum1)?sum:sum1;
		System.out.println(res);
	}
}
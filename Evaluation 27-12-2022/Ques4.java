import java.util.Scanner;
class Ques4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Size : ");
		int n=sc.nextInt();
		int m=n;
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		}
		int sum=0,sum1=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				sum+=a[i][j];
				
			}
			m--;
		}
		m=n-1;
		for(int i=0;i<n;i++)
		{
			for(int j=m;j<n;j++)
			{
				sum1+=a[i][j];	
			}
			m--;
		}
		System.out.println(sum>sum1?sum:sum1);
	}
}	
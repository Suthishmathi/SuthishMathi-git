import java.util.Scanner;
class Ball
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the low limit : ");
		int lowLimit=sc.nextInt();
		
		System.out.println("Enter the High Limit : ");
		int highLimit=sc.nextInt();
		
		int n=highLimit-lowLimit+1;
		int m=n;
		int a[]=new int[n];
		int rem=0,sum=0;
		while(m!=0)
		{
			rem=m%10;
			sum+=rem;
			m/=10;
		}
		for(int i=1;i<=n;i++)
			System.out.print(i+" ");
		System.out.println();
		for(int i=1;n>0;i++)
		{
			if(i==lowLimit || i==sum)
			{
				System.out.print(2+" ");
				n-=2;
			}
			else
			{
				System.out.print(1+" ");
			--n;
			}
		}
		
	}
}
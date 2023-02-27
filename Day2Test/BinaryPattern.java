import java.util.Scanner;
class BinaryPattern
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double result=powerOf(2,n);
		for(int i=0;i<result;i++)
		{
			for(int j=n-1;j>=0;j--)
			{
				System.out.print((i/(int)powerOf(2,j))%2 + " ");
			}
			System.out.println();
		}
	System.out.println(result);
	}
	public static int powerOf(int n, int pow)
	{
		int temp=n;
		for(int i=1;i<pow;i++)
		{
			n*=temp;
		}
		return n;
	}
}
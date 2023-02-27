import java.util.Scanner;
class TruthTable1
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);	
		System.out.println("Enter the number :");
		int n = scan.nextInt();
		int rows=(int)pow(2,n);
		int a[][]=new int[rows][n];
		int temp[][]=printTable(a,n);
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
	
	public static int[][] printTable(int a[][],int n)
	{
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			for(int j=n-1;j>=0;j--)
			{
				a[i][k++]=(i/(int)pow(2,j))%2;
			}
			
		}
		return a;
	}
	public static int pow(int base,int power)
		{
				int temp=base;
			if(power==0)
				return 1;
			else
				{
					for(int i=1;i<power;i++)
					{
						base*=temp;
					}
				}
				return base;

		}
}
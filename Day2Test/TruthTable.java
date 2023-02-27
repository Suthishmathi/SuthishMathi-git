import java.util.Scanner;
class TruthTable
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);	
		System.out.println("Enter the number :");
		int n = scan.nextInt();
		
		printTable(n);
	}
	
	public static void printTable(int n)
	{
		int rows=(int)pow(2,n);
		System.out.println(rows);
		for(int i=0;i<rows;i++)
		{
			for(int j=n-1;j>=0;j--)
			{
				System.out.print((i/(int)pow(2,j))%2 + " ");
			}
			System.out.println();
		}
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
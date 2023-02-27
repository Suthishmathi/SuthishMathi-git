import java.util.Scanner;

class DiamondPattern
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number  : ");
		int n = sc.nextInt();
		int k = 1;
		int space = n/2;
		int limit = 0;
		while(limit<=n)
		{
		for(int i=space;i>=0;i--)
			System.out.print("  ");
		for(int i=0;i<k;i++)
			System.out.print("* ");
		if(limit<(n/2))
		{
			k+=2;
		space--;
		}
		else
		{
			k-=2;
		space++;
		}
		System.out.println();
		limit++;
		}
	}
}
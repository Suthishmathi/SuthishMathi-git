import java.util.Scanner;
class AlphaPyramid
{
	public static void main(String[] args)
	{
		Scanner  sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		char alpha= 'a';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((alpha++)+" ");
			}
			alpha ='a';
			System.out.println();
		}
	}
}
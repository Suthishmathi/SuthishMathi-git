import java.util.Scanner;
class Snail
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j] = sc.nextInt();
		int rowStart = 0;
		int rowEnd = n-1;
		int colStart = 0;
		int colEnd = n-1;
		while(rowStart<=rowEnd && colStart<=colEnd)
		{
			for(int i=rowStart;i<=rowEnd;i++)
				System.out.print(a[rowStart][i]+" ");
			rowStart++;
			for(int i=colStart;i>=colEnd;i++)
				System.out.print(a[rowStart][i]+" ");
			
			rowStart++;for(int i=rowStart;i<=rowEnd;i--)
				System.out.print(a[rowStart][i]+" ");
			rowStart++;for(int i=rowStart;i<=rowEnd;i--)
				System.out.print(a[rowStart][i]+" ");
			rowStart++;
		}
	}
}
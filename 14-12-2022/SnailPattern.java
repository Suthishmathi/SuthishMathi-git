import java.util.Scanner;
class SnailPattern
{
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[][]=new int[n][n];
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
			a[i][j]=sc.nextInt();
	}
	int rowStart=0;
	int rowEnd=a.length;
	int colStart=0;
	int colEnd=n;
	while(rowStart<rowEnd && colStart<colEnd)
	{
		for(int i=rowStart;i<rowEnd;i++)
			System.out.println(a[rowStart][i]+" ");
		rowStart++;
		for(int i=rowEnd;i<)
	}
}
}
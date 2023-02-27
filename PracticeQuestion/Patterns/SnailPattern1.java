import java.util.Scanner;
class SnailPattern1
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int a[][] = new int[row][col];
		
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				a[i][j] = sc.nextInt();
		int rowStart = 0;
		int rowEnd  = row;
		int colStart = 0;
		int colEnd = col;
		
		while(rowStart<rowEnd && colStart < colEnd)
		{
			for(int i = rowStart;i<rowEnd;i++)
				System.out.print(a[rowStart][i]+" ");
			rowStart++;
			
			for(int i=colStart;i<colEnd;i++)
				System.out.print(a[i][colEnd-1]+" ");
			colEnd--;
			
			for(int i = colEnd;i>=colStart;i--)
				System.out.print(a[colEnd-1][i]+" ");
			rowEnd--;
			
			for(int i=rowEnd ; i>=rowStart;i--)
				System.out.print(a[i][rowEnd-1]+" ");
			colStart++;
		}
	}
}
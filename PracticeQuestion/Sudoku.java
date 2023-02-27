import java.util.Scanner;
class Sudoku
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int table[][]=new int[9][9];
		for(int i=0;i<9;i++)
			for(int j=0;j<9;j++)
				table[i][j]=sc.nextInt();
			solution(table);
	}
	public static void solution(int a[][])
	{
		if(backTrack(a,0,0))
			print(a);
		else
			System.out.println("No solution");
	}
	public static  boolean backTrack(int a[][],int r,int c)
	{
		if(r==9)
		{
			c++;
		if(c==9)
			return true;
		else
			r=0;
		}
		if(a[r][c]!=0)
			return backTrack(a,r+1,c);
		for(int i=1;i<=9;i++)
		{
			if(solve(a,r,c,i))
			{
				a[r][c]=i;
				if(backTrack(a,r+1,c))
					return true;
				a[r][c]=0;
			}
		}
		return false;
	}
	public static boolean solve(int a[][],int r,int c,int num)
	{
		for(int i=0;i<9;i++)
			if(a[i][c]==num)
				return false;
			for(int i=0;i<9;i++)
				if(a[r][i]==num)
					return false;
				int index_1=(r/3)*3;
				int index_2=(c/3)*3;
				for(int i=0;i<3;i++)
					for(int j=0;j<3;j++)
						if(a[index_1+i][index_2+j]==num)
							return false;
						return true;
	}
	public static void print(int arr[][])
	{
		System.out.println("Sudoku Sol");
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
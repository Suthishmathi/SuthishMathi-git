import java.util.Scanner;
class Nqueen
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of matrix");
		int n=sc.nextInt();
		char table[][]=new char[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				table[i][j]='.';
			chess(table,n);
	}
	public static void chess(char c[][],int n)
	{
		if(backTrack(c,n,0))
			print(c,n);
		else
			System.out.println("No Solution ");
	}
	public static boolean backTrack(char c[][],int n,int m)
	{
		if(m==n)
			return true;
		for(int i=0;i<n;i++)
		{
			if(solve(c,n,i,m))
			{
				c[i][m]='Q';
				if(backTrack(c,n,m+1))
					return true;
				c[i][m]='.';
			}
		}
		return false;
	}
	public static boolean solve(char[][] c,int n,int r,int m)
	{
		for(int i=0;i<n;i++)
			if(c[i][m]=='Q')
				return false;
			for(int i=0;i<n;i++)
				if(c[r][i]=='Q')
					return false;
				for(int i=r,j=m;i<n && j>=0;i++,j--)
					if(c[i][j]=='Q')
						return false;
					for(int i=r,j=m;i>=0 && j>=0;i--,j--)
						if(c[i][j]=='Q')
							return false;
						return true;
	}
	public static void print(char c[][],int n)
	{
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
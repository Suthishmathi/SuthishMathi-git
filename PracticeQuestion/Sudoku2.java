import java.util.Scanner;
class Sudoku2 
{
	public static void main(String args[])
	{
		System.out.println("Sudoku Game Solver ");
		char a[][] = new char[9][9];
		Scanner sc=new Scanner(System.in);	
		for(int i = 0;i<9;i++)
			for(int j = 0;j<9;j++)
				a[i][j] = sc.next().charAt(0);
		
		if(solver(a,0,0))
		{
			for(int i = 0;i<9;i++){
				for(int j = 0;j<9;j++)
					System.out.print(a[i][j]+" "); 
				System.out.println();
			}
		}
		else
			System.out.println("No possibilities!!!!");
	}
	public static boolean solver(char a[][],int row,int col)
	{
		if(row == 9)
		{
			++col;
			if(col == 9)
				return true;
			else
				row=0;
		}
		if(a[row][col] != '.')
			return solver(a,row+1,col);
		for(int i = 49;i <= 57;i++)
		{
			if(check(a,row,col,i))
			{
				a[row][col] = (char)i;
				if(solver(a,row,col))
					return true;
				a[row][col] = '.';
			}
			
		}
		return false;
	}
	public static boolean check(char a[][],int row,int col,int num)
	{
		for(int i = 0;i<9;i++)
			for(int j=0;j<9;j++)
				if(a[i][col] == num)
					return false;
		for(int i = 0;i<9;i++)
			for(int j=0;j<9;j++)
				if(a[row][i] == num)
					return false;
		int row_index = (row/3)*3;
		int col_index = (col/3)*3;
		
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				if(a[i+row_index][i + col_index] == num)
					return false;
		return true;
	}
}
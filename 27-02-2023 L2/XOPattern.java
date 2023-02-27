import java.util.Scanner;
class XOPattern
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number1 ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the number2 ");
		int num2 = sc.nextInt();
		int  start = 0,
		end = num2,
		limit =0;
		char letter = 'X';
		char a[][] = new char[num2][num1];
		
		while(limit<num2)
		{
			if(limit%2 == 0)
				letter = 'X';
			else
				letter = 'O';
			for(int i=start;i<end;i++)
			{
				for(int j = start;j<num1;j++)
				{
					if(i == start|| i == num1 || j == start || j == num1)
						a[i][j] = letter;
				}
			}
			start++;end--;limit++;num1--;
		}
		for(int i=0;i<num2;i++)
			{
				for(int j = 0;j<a[0].length;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
	}
}
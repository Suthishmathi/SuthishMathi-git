import java.util.Scanner;
class Ques2
{
	public static void main(String[] args)
	{
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int n = num;
		int start = 0;
		int end = num-1;
		int arr[][] = new int[num][num];
		
		while(num!=0)
			{
		for(int i=start;i<=end;i++)
		{
			for(int j=start;j<=end;j++)
			{
				if(i == start || j == start)
				{
					arr[i][j] = num;
				}
			}
			
		}
		start++;num--;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
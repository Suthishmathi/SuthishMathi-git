import java.util.Scanner;
public class Task4{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int m=(n*2)-1;
		int s=m;
		int r=m-1;
		int limit=0;
		int l=0;
		int arr[][]=new int [m][m];
		while (limit<m) 
		{
		for (int i=l;i<=r;i++)
		{
			for (int j=l;j<=r;j++)
			{
				if(i==l||i==r||j==l||j==r)
					arr[i][j]=n;
			}
		}
		l++;n--;r--;limit++;
	}
	for (int i=0;i<s;i++) {
		for(int j=0;j<s;j++) {
			System.out.print(arr[i][j]);
	
	}
		System.out.println();
	}
	
		
	}
}
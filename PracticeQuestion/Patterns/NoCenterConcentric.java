import java.util.*;
public class NoCenterConcentric{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = scan.nextInt();
		print(n);
	}
	public static void print(int n) {
		int s=2*n-1;
		int r=s-1;
		//int limit=0;
		int l=0;
		int arr[][]=new int [s][s];
		while (n!=0) {
		for (int i=l;i<=r;i++)
		{
			for (int j=l;j<=r;j++)
			{
				if(i==l||i==r||j==l||j==r) {
					 arr[i][j]=n;
			}
				
			}
		}
		l++;n--;r--;limit++;
	}
	for (int i=0;i<s;i++){ 
		for(int j=0;j<s;j++) {
			System.out.print(arr[i][j]);
		}
		System.out.println();
	}
	}

}
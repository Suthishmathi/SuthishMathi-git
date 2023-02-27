import java.util.Scanner;

public class Task21{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		int max=0;
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++) {
			if (i==0)
			{
				max=a[i];
				System.out.print(max+" ");
			}
		else if(max<a[i])
		{
			max=a[i];
				System.out.print(max+" ");
		}
		}
		
	}
}

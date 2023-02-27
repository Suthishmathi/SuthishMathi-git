import java.util.Scanner;

class Ques1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size :");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n-1;i+=2)
		{
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}
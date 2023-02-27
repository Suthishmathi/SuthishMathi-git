import java.util.Scanner;
class Ques1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		ascending(a);
		
		descending(a);
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
	public static void ascending(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}	
	public static void descending(int a[])
	{
		int mid=a.length/2;
		for(int i=mid;i<a.length;i++)
		{
			for(int j=mid;j<a.length-1;j++)
			{
				if(a[j]<a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
}
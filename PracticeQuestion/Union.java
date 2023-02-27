import java.util.Scanner;
class Union
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first array size : ");
		int n=sc.nextInt();
		System.out.println("Enter the second array size : ");
		int m=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
		int k=0,count=0;
		System.out.println("Enter the first array elements : ");
		for(int i=0;i<m+n;i++)
		{
			if(i<n)
				a[i]=sc.nextInt();
			else
			{
				if(count==0)
				{
					System.out.println("Enter Second Array element : ");
					b[k]=sc.nextInt();
					k++;
					
				}
				else
				{
					b[k]=sc.nextInt();
					k++;
				}
			}
		}
		count=0;
		k=0;
		for()
		System.out.println("first array elements : ");
		for(int i=0;i<m+n;i++)
		{
			if(i<n)
			{

			System.out.print(a[i]+" ");
			}
			else
			{
				if(count==0)
				{
					System.out.println("Second Array element : ");
					System.out.print(b[k]+" ");
					k++;
					count++;
				}
				else
				{
					System.out.print(b[k]+" ");
					k++;
				}
			}
		}
		
	}
}
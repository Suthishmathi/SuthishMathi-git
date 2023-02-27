import java.util.Scanner;
class Test3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter the target value : ");
		int target=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int total=0;
			for(int j=i;j<n;j++)
			{
				total+=a[j];
				if(total==target)
				{
					for(int m=i;m<=j;m++)
						System.out.print(a[m]+" ");
					System.out.println();
					}
			}
		}
		
	}
}
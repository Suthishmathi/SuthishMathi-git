import java.util.Scanner;
class Test2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ther arrays size : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		//int temp[]=new int[n];
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			//temp[i]=a[i];
		}
		
		for(int i=0;i<n;i++)
		{
			int max=100;
			for(int j=0;j<n;j++)
			{
				if(a[i]<a[j] && a[j]<max)
					max=a[j];
					
			}
				if(max==100)
				{
					System.out.println(a[i]+">");
					
				}
				else
				{
					System.out.print(a[i]+">"+max+"\n");
				}
		}
	}
}
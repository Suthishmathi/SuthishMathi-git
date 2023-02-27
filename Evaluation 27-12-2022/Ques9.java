import java.util.Scanner;
class Ques9
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Size : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n-1;i++)
		{
			if(a[i]==a[i+1])
			{
				a[i]=a[i]+a[i];
				a[i+1]=0;
			}
		}
	for(int i=0;i<n;i++)
	{
			for(int j=i;j<n;j++)
			{
				if(a[i]==0 && a[j]!=0)
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		
	}
	for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");
	
	}
}
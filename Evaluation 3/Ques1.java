import java.util.Scanner;
class Ques1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		System.out.println("Enter the array elements : ");
		int a[]=new int[n+1];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			if(i==0)
				sum+=a[i];
			else if(a[i]!=0 && a[i]%2==0 && a[i+1]%2!=0)
				{
					sum+=a[i];
					a[i+1]=0;
					continue;
				}
			else 
					sum+=a[i];
		}
		System.out.println(sum);
	}
}
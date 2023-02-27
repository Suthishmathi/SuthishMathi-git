import java.util.Scanner;
class Price
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter theb array size : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter the transaction limit : ");
		int transactionLimit=sc.nextInt();
		int profit=0;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]<a[i+1])
			{
				transactionLimit--;
				profit+=a[i+1]-a[i];
				i++;
			}
			if(transactionLimit==0)
				break;
		}
		System.out.println(profit);
	}
}

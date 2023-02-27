import java.util.Scanner;
class NumberOfElements
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int n=sc.nextInt();
		int posNum=0,negNum=0,oddNum=0,evenNum=0,zero=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==0)
			{
				zero++;
			}
			else if(a[i]<0)
			{
				negNum++;
				if(a[i]%2==0)
				{
					evenNum++;
				}
				else
					oddNum++;
			}
			else if(a[i]>0)
			{
				posNum++;
				if(a[i]%2==0)
				{
					evenNum++;
				}
				else
					oddNum++;
			}
		}
		System.out.println("positive number :  "+posNum+
							"\nnegative Number : "+negNum+
							"\nOdd number : "+oddNum+
							"\nEven number : "+evenNum+
							"\nZero : "+zero);
	}
}
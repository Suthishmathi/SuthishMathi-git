import java.util.Scanner;
class Ques4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		for(int i=0;i<size;i++)
			a[i] = sc.nextInt();
		int sum = 0,sum1 = 0;
		 for(int i=0;i<size;i++)
		{
			sum = met(a,0,i);
			sum1 = met(a,i+1,size);
			if(sum == sum1)
			{
				System.out.println("The pivot index is "+i);
				return;
			}
		}
		System.out.println(-1);
	}
	public static int met(int a[],int start,int mid)
	{
		int sum = 0;
		for(int i = start;i<mid;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
}
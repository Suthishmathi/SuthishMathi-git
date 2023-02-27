import java.util.Scanner;
class Ques5
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of arrays");
		int n=sc.nextInt();
		int a[]=new int[n];
		int c;
		int count[]=new int[n];
		System.out.println("Enter the array elements :");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			c=1;
			if(a[i]!=-1)
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[i]==a[j])
					{
						c++;
						a[j]=-1;
					}
				}
				count[i]=c;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(findMax());
		}
	}
	public int findMax(int a[])
	{
		int max = 0,index = 0;
		for(int i=0;i<n;i++)
		   {
			if(max < a[i])
				{
				   max = a[i] 
				   index = i;
				}
		   }
		a[index] = 0;
		return max;	
	}
		
}
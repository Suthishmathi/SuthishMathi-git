import java.util.Scanner;
class Ques2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements : ");
		int count=0;
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int total=0;
			for(int j=i;j<n;j++)
			{
				total+=a[j];
				if(total==15)
				{
					System.out.println((i+1)+" "+(j+1));
					return;
					
					//count++;
					//for(int m=i;m<=j;m++)
						//System.out.print(a[m]+" ");
					//System.out.println();
					}
			}
		}
		System.out.println(count);
	}

}
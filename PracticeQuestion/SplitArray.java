import java.util.Scanner;
class SplitArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		int mid,mid1,k=0,count=0;
		if(n%2==0)
		{
			mid=n/2;
			mid1=mid;
		}
		else{
			mid=n/2;
			mid1=mid+1;
		}
		int b[]=new int[mid1];
		int c[]=new int[mid];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(i<mid1)
			{
				b[i]=a[i];
				System.out.print(b[i]+" ");
			}
			else
			{
				c[k]=a[i];
				if(count==0){
					System.out.print("\n"+c[k]+" ");
					++count;
					k++;
				}
				else
				{
					System.out.print(c[k]+" ");
				k++;
				}
			}
		}
		
	}
}
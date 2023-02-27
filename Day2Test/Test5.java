import java.util.Scanner;
class Test5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first array size :");
		int n=sc.nextInt();
		System.out.println("Enter the Second array size : ");
		int m=sc.nextInt();
		int a1[]=new int[n];
		int a3[]=new int[n+m];
		int k=0;
		System.out.println("Enter the first array elements : ");
		for(int i=0;i<n;i++)
			a1[i]=sc.nextInt();
		int a2[]=new int[m];
		System.out.println("Enter the second array elements : ");
		for(int i=0;i<m;i++)
			a2[i]=sc.nextInt();
		for(int i=0;i<m+n;i++)
		{
			if(i<n)
				a3[i]=a1[i];
			else{
				a3[i]=a2[k];
				k++;
			}
		}
		for(int i=0;i<n+m;i++)
		{
			if(a3[i]!=-16)
			{
			for(int j=i+1;j<m+n;j++)
			{
				if(a3[i]==a3[j])
				{
					a3[i]=-16;
					a3[j]=-16;
				}
			}
			
			}
		}
		int index=0;
		for(int i=0;i<m+n;i++)
		{
			if(a3[i]!=-16)
			{
				index=(i<n)?1:2;
				if(index==1)
				{
				System.out.println(a3[i]+"  is extra element in array "+index+" at index "+(i));
				}
				else if(index==2)
				System.out.println(a3[i]+"  is extra element in array "+index+" at index "+(i-m+1));
			}
		}
	
	}
}
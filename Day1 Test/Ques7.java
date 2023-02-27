import java.util.Scanner;
class Ques7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int index,c=0;
		for(int i=0;i<n;i++)
		{
			index=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[index])
				{
				   index=j; 
				}	
			}
			if(i<index){    
			int temp=a[index];
			a[index]=a[i];
			a[i]=temp;
			c++;
			}			
		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println(" \n"+c);
	}
}
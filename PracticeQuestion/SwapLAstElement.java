import java.util.Scanner;
class SwapLastElement
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int temp=a[n-1];
		for(int i=n-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		a[0]=temp;
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}
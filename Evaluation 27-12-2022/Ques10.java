import java.util.Scanner;
class Ques10
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Size : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter the Target : ");
		int target=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
				if(a[i]+a[j]==target)
				{
					count++;
					System.out.print("("+a[i]+","+a[j]+")");
					break;
				}
				System.out.println("   "+count);
	}
}
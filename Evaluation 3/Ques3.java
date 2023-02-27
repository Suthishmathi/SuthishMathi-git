import java.util.Scanner;
class Ques3
{
	public static void main(String[] args)
	{
		problem();
	}
	public static void problem()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first element :");
		int n1=sc.nextInt();
		System.out.println("Enter the second element : ");
		int n2=sc.nextInt();
		System.out.println("Enter the third value : ");
		
		int n3=sc.nextInt();
		int n4=n1*(n3+1);
			
			if(n2==n4)
			{
				for(int i=n1;i<=n2;i++,n1++)
				{
					System.out.print(n1+" ");
				}
			}
		
	}
}
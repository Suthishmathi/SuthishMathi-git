import java.util.Scanner;
class Cricket
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		int quo=0,sum=0;
		while(num>1)
		{
			quo=num/2;
			sum+=quo;
			num-=quo;
		}
		System.out.println(sum);
	}
}
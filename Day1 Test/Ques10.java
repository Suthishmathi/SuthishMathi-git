import java.util.Scanner;
class Ques10
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the target : ");
		int target=sc.nextInt();
		boolean result=false;
		for(int i=1;i<target;i++)
		{
			for(int j=i+1;j<target;j++)
			{
				if(i*i+j*j==target)
				{
					result=true;
					break;
				}
			}
		}
		System.out.println(result);
	}
}
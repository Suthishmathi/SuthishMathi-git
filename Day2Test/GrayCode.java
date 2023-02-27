import java.util.Scanner;
class GrayCode
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		String num=sc.next();
		char arr[]=num.toCharArray();
		grayCodeGenerator(arr,0);
	}
	public static void grayCodeGenerator(char a[],int i)
	{
		if(i==a.length)
			return;
		if(i==0)
		{
			System.out.print(a[i]);
			grayCodeGenerator(a,i+1);
		}
		else if(a[i]==a[i-1])
		{
			System.out.print("0");
			grayCodeGenerator(a,i+1);
		}
		else
		{
			System.out.print("1");
			grayCodeGenerator(a,i+1);
		}
	}
}
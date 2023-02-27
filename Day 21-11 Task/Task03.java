import java.util.Scanner;
class Task03
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of String : ");
		int n=sc.nextInt();
		String a[]=new String[n];
		for(int i=0;i<n;i++)
			a[i]=sc.next();
		for(int i=0;i<n;i++)
		{
			arrange(a[i]);
		}
	}
	public static void arrange(String word)
	{
		char temp;
		char[] w=word.toCharArray();
		for(int i=0;i<w.length-1;i++)
		{
			for(int j=0;j<w.length-i-1;j++)
			{
				if(w[j]<w[j+1])
				{
					temp=w[j];
					w[j]=w[j+1];
					w[j+1]=temp;
				}
		}
		}
		System.out.println(w);
	}
}
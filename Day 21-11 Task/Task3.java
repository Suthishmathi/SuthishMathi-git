import java.util.Scanner;
class Task03
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first word : ");
		String str1=sc.next();
		System.out.println("Enter the second word : ");
		String str2=sc.next();
		arrange(str1);
		arrange(str2);
		
	}
	public static void arrange(String word)
	{
		char temp;
		char[] w=word.toCharArray();
		for(int i=0;i<w.length-1;i++)
		{
			for(int j=i;j<w.length-i-1;j++)
			{
				if(w[j]<w[j+1])
				{
					temp=w[j];
					w[j]=w[j+1];
					w[j+1]=temp;
				}
		}
		}
		for(int i=0;i<w.length;i++)
		System.out.print(w[i]);
	}
}
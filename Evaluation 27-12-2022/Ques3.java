import java.util.*;
class Ques3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String ");
		String str1=sc.next();
		System.out.println("Enter the Second String ");
		String str2=sc.next();
		int k=0;
		int a[]=new int[str2.length()];
		for(int i=0;i<str2.length();i++)
		{
			for(int j=0;j<str1.length();j++)
			{
				if(str1.charAt(j)==str2.charAt(i) && k<str2.length())
				{
					a[i]=j;
					k++;
					break;
				}
			}
		}
		int min=999,max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		for(int i=min;i<=max;i++)
			System.out.print(str1.charAt(i));
	}
}
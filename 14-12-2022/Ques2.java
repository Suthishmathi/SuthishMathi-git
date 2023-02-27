import java.util.Scanner;
class Ques2
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		boolean c=false;
		int count,max=0;
		for(int i=0;i<s.length();i++)
		{
			count=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)!=s.charAt(j))
				{
					c=false;
					count++;
				}
				else if(s.charAt(i)==s.charAt(j))
				{
					c=true;
					break;
				}
			}
			if(c && count>max)
				max=count;
		}
		System.out.println(max);
	}
}
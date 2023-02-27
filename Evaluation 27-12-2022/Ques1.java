import java.util.Scanner;
class Ques1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=sc.nextLine();
		int a[]=new int [26];
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
				a[str.charAt(i)-'a']=1;
			else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
				a[str.charAt(i)-'A']=1;
		}
		boolean c=true;
		for(int i=0;i<26;i++)
			if(a[i]!=1)
			{
				c=false;
				break;
			}
				System.out.println(c);
	}
}
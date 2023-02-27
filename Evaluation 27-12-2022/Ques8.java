import java.util.Scanner;
class Ques8
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=sc.nextLine();
		String temp="";
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z')
				temp+=str.charAt(i);
		boolean c=true;
		for(int i=0,j=temp.length()-1;i<temp.length()/2 && j>(temp.length()/2);i++,j--)
		{
			if(temp.charAt(i)!=temp.charAt(j))
			{
				c=false;
				break;
			}
		}
		if(c)
			System.out.println("Palindrome");
		else 
			System.out.println("its not Palindrome");
	}
}
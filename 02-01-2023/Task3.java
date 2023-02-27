import java.util.Scanner;
class Task3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String st=sc.next();
		String temp="";
		int res=0,r=0;
		for(int i=0;i<st.length();i++)
		{
			temp+=st.charAt(i);
			res=rev(temp);
			if(res==1)
			{
				temp="";
				res=0;
				r++;
			}
		}
		if(r>1)
			System.out.println("Can split into palindrome substring");
		else
			System.out.println("Can't split into palindrome substring");
	}
	public static int rev(String str)
	{
		String str1="";
		for(int i=str.length()-1;i>=0;i--)
			str1+=str.charAt(i);
		if(str1.equals(str) && str1.length()>1)
			return 1;
		else 
			return 0;
	}
}
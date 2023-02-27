import java.util.Scanner;
class Ques1
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String1 ");
		String str1 = sc.next();
		
		System.out.println("Enter the String2 ");
		String str2 = sc.next();
		int count=0,k=str1.length(),l=str2.length();
		if(str1.length()<str2.length())
		{
			k = str2.length();
			l = str1.length();
		}
		int m = 0;
		for(int i=0;i<k;i++,m++)
		{
			if(i<l)
			{
				if(str1.charAt(i) != str2.charAt(m))
				{
					//m--;
					count++;
				}	
			}
			else if(str1.charAt(i) != str2.charAt(str2.length()-1))
				{
					m--;
					count++;
				}	
		}
		System.out.println(count);
		if(count == 1)
			System.out.println(true);
		else
			System.out.println(false);
	}
}
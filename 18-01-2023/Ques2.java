import java.util.Scanner;
class Ques2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.next();
		str = str.toLowerCase();
		boolean check = true;
OUTER : for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					check = false;
					System.out.println(check);
					break OUTER;
				}
			}
		}
		if(check)
			System.out.println(check);
	}
}
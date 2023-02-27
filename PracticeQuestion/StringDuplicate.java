import java.util.Scanner;
class StringDuplicate
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		char temp[] =str.toCharArray();
		for(int i=0;i<temp.length;i++)
		{
			if(temp[i]>='A' && temp[i]<='Z')
				temp[i]+=32;
		}
		System.out.println((char)1);
		for(int i=0;i<str.length();i++)
		{
			if(temp[i]!= 1)
			{
			for(int j=i+1;j<str.length();j++)
			{
				if(temp[i] == temp[j])
				{
					temp[j] = 1;
				}
			}
			System.out.print(temp[i]);
			}
		}
		
	}
}
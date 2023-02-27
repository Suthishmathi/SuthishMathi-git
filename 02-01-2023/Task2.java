import java.util.Scanner;
class Task2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String st=sc.next();
		char []str=st.toCharArray();
		for(int i=0;i<str.length;i++)
		{
			int count=1;
			if(str[i]!='-')
			{
				System.out.print(str[i]);
				for(int j=i+1;j<str.length;j++)
				{
					if(str[i]==str[j])
					{
						str[j]='-';
						count++;
					}
				}
				System.out.print(count);
			}
		}
	}
}
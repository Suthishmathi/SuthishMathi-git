import java.util.Scanner;
class Ques4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String st=sc.next();
			int op=0,cp=0;
			for(int i=0;i<st.length();i++)
			{
				if(st.charAt(i)=='(')
					op++;
				else if(st.charAt(i) == ')')
					cp++;
			}
			if(cp == 0 && op== 0)
				System.out.println("No parenthesis occured");
			else if(cp == op)
				System.out.println(0);
			else 
				System.out.println(1);
	}
}
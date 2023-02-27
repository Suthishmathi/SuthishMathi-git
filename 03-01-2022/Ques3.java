import java.util.Scanner;
class Ques3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String st=sc.next();
		st+=" ";
		String temp="";
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='i' || st.charAt(i)=='o' ||st.charAt(i)=='u'	)
			{
				if(st.charAt(i+1)=='a' || st.charAt(i+1)=='e' || st.charAt(i+1)=='i' || st.charAt(i+1)=='o' ||st.charAt(i+1)=='u')
				{
					temp+=st.charAt(i);
					temp+=st.charAt(i+1);	
				}
			}
			else
				temp+=st.charAt(i);
		}
			System.out.println(temp);
	}
}
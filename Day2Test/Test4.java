import java.util.Scanner;
class Test4
{
	static String word;
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence : ");		
		String str=sc.nextLine();
		int n=str.length()-1;
		 
		System.out.println(reverse(str,n));
	}
	public static String reverse(String a,int n)
	{
		 word="";
		 if(n==0)
			return word;
			if(word.charAt(n)==' ')
				rev(word);
			else 
				word+=a.charAt(n);
		return word+reverse(a,n-1);
	}
	public static void rev(String w)
	{
		String temp="";
		for(int i=0;i<w.length();i++)
		{
			temp+=w.charAt(i);
		}
		word=temp;
	}
}
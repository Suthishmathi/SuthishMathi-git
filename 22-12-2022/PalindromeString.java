import java.util.Scanner;
class PalindromeString
{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String word=sc.next();
		String res="";
		for(int i=0,j=word.length()-1;i<word.length()&&j>0;i++,j--)
		{
			if(word.charAt(i)!=word.charAt(j))
			{
				res+=word.charAt(j);
				i--;
			}
		}
		System.out.println(res+word);
	}
}
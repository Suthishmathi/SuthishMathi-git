import java.util.Scanner;
class Ques2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String word=sc.next();
		int total=0;
		for(int i=0;i<word.length();i++)
		{
			total*=26;
			total+=word.charAt(i)-'A'+1;
		}
		System.out.println(total);
	}
}
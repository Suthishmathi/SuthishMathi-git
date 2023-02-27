import java.util.Scanner;
class Task6_1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String word=sc.next();
		char arr[]=word.toCharArray();
		boolean a=true;
		String word1="",word2="";
		for(int i=0;i<word.length();i++)
		{
			if(arr[i]!=' ')
			{
			for(int j=i+1;j<word.length();j++)
			{	
				if(arr[i]==arr[j])
				{
					word1+=arr[i];
					word2=arr[j]+word2;
					arr[i]=' ';
					arr[j]=' ';
					break;
				}
			}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' ')
			{
				a=false;
				System.out.println(word1+arr[i]+word2);
				break;
			}
		}
		if(a)
			System.out.println(word1+word2);
	}
}
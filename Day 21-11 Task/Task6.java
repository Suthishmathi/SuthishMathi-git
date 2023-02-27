import java.util.Scanner;
class Task6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String word=sc.next();
		char arr[]=word.toCharArray();
		int mid;
		boolean a=true;
		String word1="",word2="";
		if(arr.length%2==0)
			 mid=arr.length/2;
		else 
			mid=(arr.length/2);
		for(int i=0;i<mid;i++)
		{
			for(int j=word.length()-1;j>=mid;j--)
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
	System.out.println(word1);
	System.out.println(word2);
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
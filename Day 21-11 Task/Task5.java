import java.util.Scanner;
class Task5
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence : ");
		String word=sc.next();
		int mid;
		if(word.length()%2==0)
			mid=word.length()/2;
		else 
			mid=(word.length()/2)-1;
		boolean result=true;
		for(int i=0,j=word.length()-1;i<=mid && j>=mid;i++,j--)
		{
			if(word.charAt(i+1)-word.charAt(i)==word.charAt(j)-word.charAt(j-1))
				result=true;
			else 
			{
				result=false;
				break;
			}
		}
		if(result)
			System.out.println("Equal Difference ");
		else
			System.out.println("Unequal Difference ");
	}
}
import java.util.Scanner;
class UniqueCharacter
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String  : ");
		String word = sc.next();
		//char c[] = word.toCharArray();
		char c[] = word.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i] >=65 && c[i] <=90)
				c[i] += 32;
		}
		boolean check = true;
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
				if(c[i] == c[j])
				{
					
					System.out.println(!check);
					check = false;
					break;
				}
		}
		if(check)
			System.out.println(check);
	}
}
import java.util.Scanner;
class Ques8
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word : ");
		String word=sc.next();
		char []w=word.toCharArray();
		for(int i=0;i<w.length;i++)
		{
			if(w[i]=='a'||w[i]=='e'||w[i]=='i'||w[i]=='o'||w[i]=='u')
			{
				for(int j=i+1;j<w.length;j++)
				{
				if(w[j]=='a'||w[j]=='e'||w[j]=='i'||w[j]=='o'||w[j]=='u')
				{
					char temp=w[i];
					w[i]=w[j];
					w[j]=temp;
				}
				}
			}
		}
		for(int i=0;i<w.length;i++)
			System.out.print(w[i]+" ");
	}
}
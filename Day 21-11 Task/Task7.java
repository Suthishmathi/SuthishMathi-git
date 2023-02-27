import java.util.Scanner;
class Task7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence : ");
		String word=sc.nextLine();
		 word+=" ";
		 String word1="";
		int k=0;
		String a[]=new String[10];
			for(int i=0;i<word.length();i++)
			{
				if(word.charAt(i)==' ')
				{
					a[k]=word1;
					word1="";
					k++;
				}
				else 
					word1+=word.charAt(i);
			}
			for(int i=0;i<k;i++)
			{
				for(int j=i+1;j<k;j++)
				{
					if(a[i].equals(a[j]))
						a[j]="null";
				}
			}
			for(int i=0;i<k;i++)
			{
				if(!a[i].equals("null"))
				System.out.print(a[i]+" ");
			}
	}
}
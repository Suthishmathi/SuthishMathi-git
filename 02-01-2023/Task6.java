import java.util.Scanner;
class Task6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String sentence=sc.nextLine();
		int k=0,index=99,count=0,min=99;
		boolean c=true;
		sentence+=" ";
		String temp="";
		System.out.println("Enter the String 1 : ");
		String word1=sc.next();
		System.out.println("Enter the String 2 : ");
		String word2=sc.next();
		String []str=new String[20];
			for(int i=0;i<sentence.length();i++)
			{
				if(sentence.charAt(i)==' ' || sentence.charAt(i)==',' ||sentence.charAt(i)=='?')
				{
					str[k]=temp;
					if(temp.equals(word1) )
					{
						if(index>k)
							index=k;
					}
					temp="";
					k++;
				}
				else if(sentence.charAt(i)>='a' && sentence.charAt(i)<='z' ||sentence.charAt(i)>='A' && sentence.charAt(i)<='Z')
					temp+=sentence.charAt(i);
			}
				for(int i=index+1;i<k;i++)
				{
					if(str[i].equals(word2))
					{
						if(count<min)
						{											
							min=count;
							count=0;
						}
						c=false;
					}
					else if(!str[i].equals(word2))
							count++;
				}
				if(c)
					System.out.println(-1);
				else
					System.out.println(min);
	}
}
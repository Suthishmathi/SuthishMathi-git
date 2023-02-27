import java.util.Scanner;
class OddEven
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String sentence=sc.nextLine();
		int k=0;
		String temp="";
		sentence+=" ";
		String a[]=new String[20];
		for(int i=0;i<sentence.length();i++)
			{
				if(sentence.charAt(i)==' ' || sentence.charAt(i)==',' ||sentence.charAt(i)=='?')
				{
					a[k]=temp;
					temp="";
					k++;
				}
				else if(sentence.charAt(i)>='a' && sentence.charAt(i)<='z' ||sentence.charAt(i)>='A' && sentence.charAt(i)<='Z')
					temp+=sentence.charAt(i);
			}
		System.out.println("Enter 1.Odd 2.Even");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			{
				for(int i=0;i<k;i+=2)
					reverse(a,a[i],i);
				break;
			}
			case 2:
			{
				for(int i=1;i<k;i+=2)
					reverse(a,a[i],i);
				break:        
		for(int i=0;i<k;i++)
			System.out.print(a[i]+"  ");
	}
	public static void reverse(String[] a,String str,int i)
	{
		String temp="";
		for(int j=str.length()-1;j>=0;j--)
			temp+=str.charAt(j);
		a[i]=temp;
	}
}

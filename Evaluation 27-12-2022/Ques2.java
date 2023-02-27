import java.util.Scanner;
class Ques2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Password : ");
		String pass=sc.next();
		int u=0,l=0,n=0,s=0;
		
		if(pass.length()>=8)
		{
			for(int i=0;i<pass.length();i++)
			{
				if(pass.charAt(i)>='a' && pass.charAt(i)<='z')
					l++;
				else if(pass.charAt(i)>='A' && pass.charAt(i)<='Z')
					u++;
				else if(pass.charAt(i)>='0' && pass.charAt(i)<='9')
					n++;
				else
					s++;
			}
			if(u>0 &&l>0 &&n>0 &&s>0 )
				System.out.println("Strong");
			else if(u>0 && l>0 && n>0 && s==0)
				System.out.println("Good");
			else if(u>0 || l>0 && n>0 && s>0)
				System.out.println("Medium");
			else 
				System.out.println("Weak");
		}
		else 
			System.out.println("Weak");
	}
}
import java.util.Scanner;
class Rec
{
static void call(String s,int n,int k)
{
	if(s[k] == ' ' || n == 0)
	{
		if(n == 0)
		{
			for(int i=k; s[i] != ' '; i++) 
			System.out.println(s[i]); 
		}
		else{
			for(int i=k+1; i<s.length() && s[i] != ' '; i++)
			System.out.println(s[i]);
			System.out.println(" "); 
			
			call(s,--n,k-1);
		}
	}
	else 
	{
		if(n)
		call(s,--n,k-1);
	}
}

public static void main(String []args)
 {
	String s;
	Scanner sc=new Scanner(System.in);
	int n = s.length() ;
	call(s,n,n);
}
}
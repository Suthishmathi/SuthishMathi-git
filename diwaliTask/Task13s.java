
import java.util.Scanner;

public class Task13s{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the word");
	String str=sc.next();
	String str2="";
	for(int i=0;i<=str.length()/2;i++)
	{
		for(int j=str.length()-1;j>=str.length()/2;j--)
		{
			if(str.charAt(i)!=str.charAt(j))
				{
				str2=str.charAt(j)+str2;
				i--;
				break;
				}	
		}
	}
	System.out.println(str2);
	sc.close();
}
}


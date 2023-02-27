import java.util.Scanner;

public class Task13{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the word");
	String str=sc.next();
	String str2="";
	for(int i=str.length()-1;i>=0;i--)
		str2+=str.charAt(i);
		if(str.equals(str2))
			System.out.println(str);
		else
		{
			for(int i=1;i<str.length();i++)
				str2+=str.charAt(i);
			System.out.println(str2);
		}
}
}

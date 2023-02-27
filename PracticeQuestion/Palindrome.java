import java.util.Scanner;
class Palindrome 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner (System.in);
	String s = sc.nextLine();
	System.out.println(pal(s));
}
public static boolean pal(String s)
{ 
	 String temp = "";
        s = s.toLowerCase();
		System.out.println(s);
        for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='0' && s.charAt(i)<='9')
                        temp+=s.charAt(i);
            }
			System.out.println(temp);
            for(int i=0,j=temp.length()-1;i<=temp.length()/2 && j>=temp.length()/2;i++,j--)
                if(temp.charAt(i) != temp.charAt(j))
                        {
                            return false;
                        }
                        return true;
			
}
}
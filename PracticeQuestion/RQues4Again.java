import java.util.Scanner;

public class RQues4Again{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string: ");
		String str=scan.next();
		int index=0;
		String s=CheckSub(str,0,index,"");
		System.out.println(s);
	}
	public static String CheckSub(String str,int i,int index,String s) {
		if(i==str.length()) {
			//System.out.println(index);
			return s;
		}
		for(int j=str.length()-1;j>=0;j--) {
			String str1="";
			for(int k=i;k<=j;k++) {
				str1+=str.charAt(k);
			}
			//System.out.println(str1);
			if(checkrep(str1)) {
				if(str1.length()>index) {
					index=str1.length();
                    s=str1;
				}
			}
		}
		CheckSub(str,i+1,index,s);
		return s;
	}
	public static boolean checkrep(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j))
					return false;
			}
		}
		return true;
	}
}
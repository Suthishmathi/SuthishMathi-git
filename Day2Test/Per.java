import java.util.Scanner;
import java.util.Arrays;
public class Per{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		char str[]=s.next().toCharArray();
		per(str,0,str.length-1);
	}
	public static void per(char str[],int l,int r){
		if(l==r){
			System.out.println(Arrays.toString(str));
			return;
		}
		for(int i=l;i<=r;i++){
			swap(str,i,l);
			per(str,l+1,r);
			swap(str,i,l);
		}
	}
	public static void swap(char str[],int i,int j){
		char temp=str[i];
		str[i]=str[j];
		str[j]=temp;
	}
}
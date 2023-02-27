import java.util.Scanner;
class Task16{
	 public static void main(String[] args)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the first array size");
		 int n=sc.nextInt();
		 String []a=new String[n];
		  for(int i=0;i<n;i++)
			 a[i]=sc.next();
		  System.out.println("Enter the second array size");
		 int m=sc.nextInt();
		 String []b=new String[m];
		  for(int j=0;j<m;j++)
		 b[j]=sc.next();
		 String str1="";
		 String str2="";
		for(int i=0;i<n;i++)
			 str1+=a[i];
		 for(int j=0;j<m;j++)
		 str2+=b[j];  y
	 if(str1.equals(str2))
		 System.out.println("True");
	 else
		 System.out.println("False");
	 }
}
import java.util.Scanner;

class GFG001
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int count=0;
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
		if(a[i]<0)
			count++;
	}
	System.out.println(count);
}
}
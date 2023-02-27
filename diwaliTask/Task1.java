import java.util.Scanner;

public class Task1{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of an array...");
	int n=sc.nextInt();
	int waterLevel=0;
	int a[]=new int[n];
	int first=a[0],second=a[0];
	for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		if(first<a[i]) {
			second=first;
			first=a[i];	
		}
		else if(a[i]>second && a[i]!=first) {
			second=a[i];
		}
	}
	for(int i=0;i<n-1;i++)
	{
		if(second-a[i+1]<0) 
			continue;
		else 
			waterLevel+=second-a[i+1];
	}
System.out.println("Water level is : "+waterLevel);
}
}

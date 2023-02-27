import java.util.Scanner;

public class Task10{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of first array");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter the elements");
	for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	System.out.println("Enter the size of Second array");
	int m=sc.nextInt();
	int b[]=new int[m];
	System.out.println("Enter the elements");
	for(int i=0;i<m;i++)
		b[i]=sc.nextInt();
	findMissing(a,b,n,m);
}
public static void findMissing(int arr1[],int arr2[],int n,int m) {
	int i,j;
	for(i=0;i<n;i++)
	{
		for(j=0;j<m;j++) {
			if(arr1[i]==arr2[j])
				arr1[i]=-1;
			}
		}
	for(i=0;i<n;i++)
	{
		if(arr1[i]!=-1)
			System.out.print (arr1[i]+" ");
	}
	}
	
}




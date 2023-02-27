package diwaliTask;
import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int n=sc.nextInt();
	System.out.println("Enter the array elements");
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();	
	}
	for(int i=0;i<n-1;i++) {
		for(int j=0;j<n-i-1;j++)
		{
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	convertToWave(a,n);
	}
	public static void convertToWave(int a[],int n) {
	for(int i=0;i<n-1;i+=2) {
		int temp=a[i];
		a[i]=a[i+1];
		a[i+1]=temp;
	}
	for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");
	}

}

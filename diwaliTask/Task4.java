package diwaliTask;

import java.util.Scanner;

public class Task4 {
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
				int temp[]=new int[10];
					findUnion(a,b,temp);
}
	public static void findUnion(int arr1[],int arr2[],int t[]) {
			 for(int i=0;i<arr1.length;i++) 
				 t[arr1[i]]=arr1[i];
				 for(int j=0;j<arr2.length;j++) 
					 t[arr2[j]]=arr2[j];
			for(int i=0;i<t.length;i++)
			{
				if(t[i]!=0)
					System.out.print(t[i]+" ");
			}
				 
	}
}

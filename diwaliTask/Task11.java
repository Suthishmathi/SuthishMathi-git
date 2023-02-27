import java.util.Scanner;

public class Task11{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int result=0;
		System.out.println("Enter the elements....");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]<a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
			result=a[0]*a[1]*a[2];
		System.out.println("Multiplication of "+a[0]+","+a[1]+" and "+a[2]+" is "+result);
	}

}

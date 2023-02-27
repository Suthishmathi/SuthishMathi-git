import java.util.Scanner;
public class Task15{
public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the array size");
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
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
			for(int i=0;i<n-1;i++)
			{
				if(a[i]+1!=a[i+1])
					System.out.println(a[i]+1);
			}
			if(a[n-1]!=n)
				System.out.println(n);
		}
}
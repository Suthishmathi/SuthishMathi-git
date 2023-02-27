import java.util.Scanner;

public class Task6{
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
		System.out.println(findExtra(a,b,n,m));
	}
	public static int findExtra(int arr1[],int arr2[],int n,int m) {
		int index=0,i,j;
		for(i=0;i<n;i++)
		{
			for(j=i;j<m;j++) {
				if(arr1[i]!=arr2[j])
					{
					index=i;
					i++;
					j--;
					}
				else if(arr1[i]==arr2[j] ) {
					break;
				}
			}
		}
		return index;
	}
}

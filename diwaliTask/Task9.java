import java.util.Scanner;
public class Task9{

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the first array size");
		int m=sc.nextInt();
		int a[]=new int[m];
		for(int i=0;i<m;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter the second array size");
		int n=sc.nextInt();
		int b[]=new int[n];
		for(int i=0;i<n;i++)
			b[i]=sc.nextInt();
		
		int temp[]=new int[m+n];
		medianOfArray(a,b,m,n,temp);
		
	}
	public static void medianOfArray(int arr1[],int arr2[],int m,int n,int t[]) {
	
		int k=0;
		float median;
		for(int i=k;i<m;i++,k++) 
			t[k]=arr1[i];
		for(int i=0;i<n;i++,k++)
			t[k]=arr2[i];
		for(int i=0;i<(m+n)-1;i++) {
			for(int j=0;j<(m+n)-i-1;j++)
			{
				if(t[j]>t[j+1])
				{
					int temp=t[j];
					t[j]=t[j+1];
					t[j+1]=temp;
				}
			}
		}
		System.out.println();
		int mid=t.length/2;
		if(t.length%2==0)
		{
			median=(float)(t[mid]+t[mid-1])/(float)2;
			System.out.println(median);
		}
		else {
			 median=t[mid];
			System.out.println((int)median);
		}
		
	}
}

import java.util.Scanner;

public class Task7{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array...");
		int n=sc.nextInt();
	
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		int result=thirdLargest(a,n);
		System.out.println(result);
	}
	public static int thirdLargest(int arr[],int n) {
		if(n<3)
		return -1;
		else
		{
			for(int i=0;i<n-1;i++) {
				for(int j=0;j<n-i-1;j++)
				{
					if(arr[j]<arr[j+1])
					{
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			return arr[2];
		}
	}

}

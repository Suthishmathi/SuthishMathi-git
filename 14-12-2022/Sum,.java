import java.util.Scanner;

public class Sum{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		int sum=s.nextInt();
		System.out.println(Count(0,arr,n,0,sum,0));
	}
	public static int Count(int ind,int arr[],int n,int s,int sum,int count){
		if(ind==n){
			if(s==sum)
				count++;
			return count;
		}
		return Count(ind+1,arr,n,s+arr[ind],sum,count)+Count(ind+1,arr,n,s-arr[ind],sum,count);
	}
}
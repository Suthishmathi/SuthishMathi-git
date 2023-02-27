import java.util.*;
class Frequency
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		int max=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]>max)
				max=a[i];
		}int count=0;
		int temp[]=new int[max+1];
		for(int i=0;i<n;i++)
		{
			count=1;
			if(a[i]!=-16)
			{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=-16;
					count++;
				}
			}
			temp[a[i]]=count;
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(temp));
		int k=0;
		int i=0;
		while(k!=n){
			int len=findMax(temp);
			while(i<temp[len]){
				a[k++]=len;
				i++;
			}
			temp[len]=0;
			i=0;
		}
		System.out.println(Arrays.toString(a));
	}
	public static int findMax(int arr[]){
		int ind=0;
		int max=0;
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				ind=i;
				max=arr[i];
			}
		}
		return ind;
	}
}
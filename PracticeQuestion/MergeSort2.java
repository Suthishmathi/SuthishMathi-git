import java.util.*;
class MergeSort2
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int a[] = new int[10001];
		
		for(int i=10000;i>=1;i--)
			a[i] = i;
		long n = System.currentTimeMillis();
		
		mergeSort(a,0,a.length);
		System.out.println(System.currentTimeMillis() - n);
		System.out.println(Arrays.toString(a));
		
}
	public static void mergeSort(int[] a,int start,int end)
	{
		if(end-start == 1)
			return;
		int mid = (start+end)/2;
		mergeSort(a,start,mid);
		mergeSort(a,mid,end);
		
		merge(a,start,mid,end);
	}
	public static void merge(int a[],int start,int mid,int end)
	{
		int[] joined = new int[end - start];
			int i = start,j = mid,k = 0;
			while(i<mid && j<end)
			{
				if(a[i]<a[j])
					joined [k++]= a[i++];
				else
					joined[k++] = a[j++];
			}
			while(i<mid)
				joined[k++]=a[i++];
			while(j<end)
			joined[k++] = a[j++];
		for(k=0;k<joined.length;k++)
			a[start+k] = joined[k];
	}
}
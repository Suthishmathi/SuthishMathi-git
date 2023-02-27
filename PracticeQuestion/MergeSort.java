import java.util.Scanner;
import java.util.Arrays;
class MergeSort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];
		
		for(int i=0;i<size;i++)
			a[i] = sc.nextInt();
		a = mergeSort(a);
		System.out.println(Arrays.toString(a));
	}
	public static int[] mergeSort(int a[])
	{
		if(a.length==1)
			return a;
		 int mid = a.length/2;
		 int left[] =  mergeSort(Arrays.copyOfRange(a,0,mid));
		 int right[] =  mergeSort(Arrays.copyOfRange(a,mid,a.length));
		 
		 return merge(left,right);
	}
	public static int[] merge(int left[],int right[])
	{
		int joined[] = new int[left.length+right.length];
		int i=0,j=0,k=0;
		while(i<left.length && j<right.length)
		{
			if(left[i]<right[j])
			{
				joined[k++] = left[i++];
			}
			else
			joined[k++] = right[j++];
		}
		while(i<left.length)
			joined[k++] = left[i++];
		while(i<right.length)
			joined[k++] = left[j++];
		return joined;
	}

}
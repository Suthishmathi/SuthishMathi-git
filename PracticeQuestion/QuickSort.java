class QuickSort
{
	public static void main(String[] args)
	{
		int a[] = {9,8,7,6,5,4,3,2,1};
		
		quicksort(a,0,a.length-1);
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	}
	static void quicksort(int[] a,int start,int end){
		if(start <= end){
			
			int l = start;
			int h = end;
			int mid = (l+h)/2;
			int pivot = a[mid];
			while(start <= end)
			{
				while(a[l]<pivot)
					l++;
				while(a[h]>pivot)
					h--;
				
				if(start<=end)
				{
					int temp = a[l];
					a[l] = a[h];
					a[h] = temp;
					start++;
					end--;
				}
			}
			quicksort(a,l,end);
			quicksort(a,start,h);
		}
	}
}
import java.util.*;
class CountingAlgorithm
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size");
		int size = sc.nextInt();
		int a[] = new int[size];
		int min = Integer.MAX_VALUE ,max =Integer.MIN_VALUE;
		for(int i =0;i<size;i++)
		{
			a[i] = sc.nextInt();
			if(a[i] > max)
				max = a[i];
			if(a[i] < min)
				min = a[i];
		}
		int countArray[] = new int[max-min+1];
		
		for(int i=0;i<size;i++)
			countArray[a[i]-min]++;
	System.out.println(Arrays.toString(countArray));
		int index=0;
		for(int i=0;i<countArray.length;i++) {
			while(countArray[i]>0) {
				a[index++]=i+min;
				countArray[i]--;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
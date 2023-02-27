import java.util.Scanner;
import java.util.Arrays;

class MinSwap
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];
		
		for(int i=0;i<size;i++)
			a[i] = sc.nextInt();
		//Selection Sort
		int count = 0;
		for(int i=0;i<size;i++)
		{
			int min = i;
			for(int j=i+1;j<size;j++)
			{
				if(a[min] > a[j])
					min = j;
			}
			if(min>i)
			{
				count++;
				int temp = a[min];
				a[min] = a[i];
				a[i] = temp;
			}
		}
		if(count<=2)
		System.out.println("The Count taken to sort the array : "+count);
		else
			System.out.println("The Count taken more than two swap to sort the array \n Not possible!!!!!");
		System.out.println(Arrays.toString(a));
	}
}
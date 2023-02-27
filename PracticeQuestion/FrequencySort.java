import java.util.Scanner;
import java.util.Arrays;
class FrquencySort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int size = sc.nextInt();
			int a[] = new int[n];
			int countArray[] = new int [n];
			for(int i=0;i<n;i++)
				a[i] = sc.nextInt();
			int count=0;
			for(int i=0;i<n;i++)
			{
				count=0;
				for(int j=0;j<n;j++)
				{
					if(a[i] == a[j])
					{
						count++;
					}
				}
				countArray[i] = count;
			}
			System.out.println(Arrays.toString(countArray));
			
			
	}
}
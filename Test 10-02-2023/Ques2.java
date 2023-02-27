import java.util.Scanner;
import java.util.Arrays;
class Ques2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st array Size :");
		int size = sc.nextInt();
		System.out.println("Enter the 2nd array Size :");
		int size1 =sc.nextInt();
		int a1[] = new int[size+size1];
		int a2[] = new int[size1];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		System.out.println("Enter the 1st array elements :");
		int k=0;
		for(int i=0;i<size+size1;i++)
		{
			if(i<size)
				a1[i] = sc.nextInt();
			else if(i == size)
			{
				System.out.println("Enter the 2nd array elements :");
				a1[i] = a2[k++] = sc.nextInt();
				
			}else{
				a1[i] = a2[k++] = sc.nextInt();
			
			}
		}
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i] > max)
				max = a1[i];
			if(a1[i] < min)
				min = a1[i];
		}
		int countArray[] = new int[max-min+1];
		
		for(int i = 0 ;i<size+size1;i++)
		{
				countArray[a1[i]-min]++;
		}
				System.out.println(Arrays.toString(countArray));
		int index=0;
		for(int i=0;i<countArray.length;i++) {
			while(countArray[i]>0) {
				a1[index++]=i+min;
				countArray[i]--;
			}
		}
		System.out.println(Arrays.toString(a1));
		System.out.println(max + "   "+min);
		System.out.println(Arrays.toString(a2));

		
		
	}
}
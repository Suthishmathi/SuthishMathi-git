import java.util.Scanner;
import java.util.Arrays;
class Ques02
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st array Size :");
		int size = sc.nextInt();
		System.out.println("Enter the 2nd array Size :");
		int size1 =sc.nextInt();
		int a1[] = new int[size];
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
				a2[k++] = sc.nextInt();
				
			}else{
				a2[k++] = sc.nextInt();
			
			}
		}
		for(int i=0;i<a1.length-1;i++)
		{
			for(int j=0;j<a1.length-i-1;j++)
			{
				if(a1[j]>a1[j+1])
				{
					int temp = a1[j];
					a1[j] = a1[j+1];
					a1[j+1] = temp;
				}
			}
		}
		for(int i=0;i<a2.length;i++)
		{
			
			for(int j=0;j<a1.length;j++)
			{
				if(a1[j] != -16)
				{
					if(a2[i] == a1[j])
					{
						System.out.print(a1[j]+" ");
						a1[j] = -16;
					}
				}
			
			}
		}
		//System.out.println(Arrays.toString(a1));
		for(int i=0;i<size;i++)
		{
			if(a1[i]!=-16)
			System.out.print(a1[i]+" ");
		}
	}
}
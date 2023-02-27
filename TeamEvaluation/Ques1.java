import java.util.Scanner;
class Ques1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array  size : ");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		int max = 0;
		for(int i=0;i<size;i++)
		{
			a[i] = sc.nextInt();
			if(a[i]>max)
				max = a[i];
		}
		int count = size;
		for(int i=0;i<size-1;i++)
		{
			if(a[i] < a[i+1])
			{
				if(max == a[i+1])
				{
					System.out.print(a[i+1]+" ");
					count--;
				}	
					System.out.print(a[i+1]+" ");
					count--;
			}
				
		}
		for(int i=0;i<count;i++)
				System.out.print(-1+" ");
		
		
	}
}
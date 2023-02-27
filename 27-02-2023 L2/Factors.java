import java.util.Scanner;
class Factors
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int size = sc.nextInt();
			int a[] = new int[size];
		for(int i=0;i<size;i++)
			a[i] = sc.nextInt();
		
		int temp[] = new int[size];
		int index = 0;
		while(index<size)
		{
			int count = 0;
			for(int i=1;i<=a[index];i++)
				if(a[index]%i == 0)
					count++;
			temp[index] = count;
			index++;
		}
		
		for(int i=0;i<size-1;i++)
		{
			for(int j = i+1;j<size-i-1;j++)
			{
				if(temp[j]<temp[j+1])
				{
					int temp1 = a[j];
					a[j] = a[j+1];
					a[j+1] = temp1;
					
					temp1 = temp[j];
					temp[j] = temp[j+1];
					temp[j+1] = temp1;
				}
			}
		}
		
		for(int i=0;i<size;i++)
			System.out.print(a[i]+"  ");
		
	}
}
//11.21  to  11.51
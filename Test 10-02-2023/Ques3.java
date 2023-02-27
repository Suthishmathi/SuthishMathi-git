import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
class Ques3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String a[] =new String[size];
		for(int i=0;i<a.length;i++)
			a[i] = sc.next();
		int index = size-1;
		String a2[] = new String[size];
		for(int i=0;i<a.length;i++)
		{
			int min = i;
			for(int j=0;j<a.length;j++)
			{
				if(a[min].charAt(0) < a[j].charAt(0))
					min = j;
				
			}
			//	System.out.print(a[min]+" ");
				a2[index--] = a[min];
				a[min]="#"+a[min];
		}
		//for(int i=a2.length-1;i>=0;i--)
			//System.out.print(a2[i]+" ");
		System.out.println(Arrays.toString(a2));
		//System.out.println(Arrays.toString(a));
	}
}

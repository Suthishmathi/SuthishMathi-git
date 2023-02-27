import java.util.Arrays;
class BubbleSort1
{
	public static void main(String[] args)
	{
		int a[] = new int[10001];
		for(int i=10000;i>=1;i--)
			a[i] = i;
		long n = System.currentTimeMillis();
			for(int i=0;i<a.length-1;i++)
			{
				for(int j=0;j<a.length-i-1;j++)
				{
					if(a[j]>a[j+1])
					{
						int temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
					}
				}
			}
		System.out.println(System.currentTimeMillis() - n);
		System.out.println(Arrays.toString(a));
	}
}
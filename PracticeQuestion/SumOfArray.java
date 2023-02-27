import java.util.Scanner;
class SumOfArray
{
	public static void main(String[] args)
	{
		int a[] ={1,2,3,4,5,6,7,8,9,10};
		int target = 20;

		
		
		/*for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				sum+=a[j];
				if(sum == target)
				{
					for(int m = i;m<=j;m++)
						System.out.print(a[m]+" ");
					System.out.println();
				}
			}
			sum = 0;
		}*/
		rec(a,target,0,"",0);
	}
	public static void rec(int a[],int target,int index,String str,int sum)
	{
		if(index == a.length)
		{	
			if(sum == target)
			System.out.println(str);	
			return;
		}
		rec(a,target,index+1,str+a[index]+" ",sum+a[index]);
		rec(a,target,index+1,str,sum);
	}

}
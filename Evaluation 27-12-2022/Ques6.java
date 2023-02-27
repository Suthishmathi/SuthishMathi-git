import java.util.Scanner;
class Ques6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Enter the 1 Tower : ");
		int tower1=sc.nextInt();
		System.out.println("Enter the 2 Tower : ");
		int tower2=sc.nextInt();
		boolean var=true;
		boolean var1=true;
		for(int i=0;i<n-2;i++)
		{
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<n;k++)
				{
					if(a[i]+a[j]+a[k]==tower1&&a[i]!='-'&&a[j]!='-'&&a[k]!='-'){
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
						a[i]='-';
						a[j]='-';
						a[k]='-';
						var=false;
				}
					else if(i==n-3&&var==true)
						System.out.println("Tower 1 is not possiable");	
					if(a[i]+a[j]+a[k]==tower2&&a[i]!='-'&&a[j]!='-'&&a[k]!='-')
					{
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
							a[i]='-';
							a[j]='-';
							a[k]='-';
							var1=false;
					}
					else if(i==n-3&&var1==true){
						System.out.println("Tower 2 is not possiable");
			}
				}
			}
		}
		//for(int i=0;i<n;i++)
			//System.out.print(a[i]+"  ");
	}
}
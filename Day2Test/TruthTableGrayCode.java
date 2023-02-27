import java.util.Scanner;
class TruthTableGrayCode
{
	static int k=0;
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);	
		System.out.println("Enter the number :");
		int n = scan.nextInt();
		int rows=(int)pow(2,n);
		int a[][]=new int[rows][n];
		int temp[][]=new int[rows][n];
		 a=printTable(temp,0,0,n);
		 String s="";
		 for(int i=0;i<rows;i++)
		{
			for(int j=0;j<n;j++)
			{
			System.out.print(a[i][j]);
			}
			System.out.println();
		}
	for(int i=0;i<rows;i++)
		{
			s="";
			for(int j=0;j<n;j++)
			{
			s+=a[i][j];
			}
			char c[]=s.toCharArray();
			grayCodeGenerator(c,temp,0,0,n);
		}  
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<n;j++)
			{
			System.out.print(temp[i][j]);
			}
			System.out.println();
		}
	}
	public static int[][] printTable(int a[][],int i,int j,int n)
	{
		if(i==a.length)
			return a;
		if(j<n)
		{
			a[i][k]=(i/(int)pow(2,j))%2;
			k++;
			printTable(a,i,j+1,n);
		}
		else{
			k=0;
			printTable(a,i+1,0,n);
		}
		return a;
	}
	public static int pow(int base,int power)
		{
				int temp=base;
			if(power==0)
				return 1;
			else
				{
					for(int i=1;i<power;i++)
					{
						base*=temp;
					}
				}
				return base;
		}
	public static void grayCodeGenerator(char c[],int a[][],int i,int j,int n)
	{
		if(i==a.length)
			return;
		if(j<n)
		{
		if(j==0)
		{
			a[i][j]=c[i]-48;
			grayCodeGenerator(c,a,i,j+1,n);
		}
		else if(a[j]==a[j-1])
		{
			a[i][j]=0;
			grayCodeGenerator(c,a,i,j+1,n);
		}
		else
		{
			a[i][j]=1;
			grayCodeGenerator(c,a,i,j+1,n);
		}
		}
		else{
			grayCodeGenerator(c,a,i+1,0,n);
		}
	}
}
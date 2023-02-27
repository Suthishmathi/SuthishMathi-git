import java.util.Scanner;
class Ques4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int a[] = new int[sc.nextInt()];
		for(int i=0;i<a.length;i++)
			a[i] = sc.nextInt();
	}
}

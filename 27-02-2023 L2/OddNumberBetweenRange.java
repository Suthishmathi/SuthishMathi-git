import java.util.Scanner;
class OddNumberBetweenRange
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting range : ");
		int firstNumber = sc.nextInt();
		System.out.println("Enter the ending range : ");
		int secondNumber = sc.nextInt();
		
		for(int i = firstNumber; i<secondNumber;i++)
			if(i%2!=0)
				System.out.print(i+" ");
	}
}
//11.15 to 11.20
import java.util.Scanner;
class TwistedPrime
{
	public static void main(String []args)
	{
				Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		int remainder=0,rev=0;
		int p=primeNumber(number);
		while(number!=0) {
			remainder=number%10;
			rev=rev*10+remainder;
			number/=10;
		}
		System.out.println(rev);
		int r=primeNumber(rev);
		if(p==1 && r==1)
			System.out.println("Twisted Prime Number");
		else 
			System.out.println("its not a twisted prime number");
		
	}
	public static int primeNumber(int number) {
		int count=0;
		if(number==0||number==1)
			count=1;
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) {
				count++;
				break;
			}
		}
		if(count==0)
			return 1;
		else
			return -1;
	}
}


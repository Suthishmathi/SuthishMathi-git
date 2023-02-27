import java.util.Scanner;
class GPay
{
	public static void main(String[] args)
	{
		System.out.println("~~~~~  Google Pay  ~~~~~");
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1.State Bank\n 2.Karnataka Bank \n 3.HDFC Bank ");
		byte choice = sc.nextByte();
		switch(choice)
		{
			case 1:
			{
				StateBank sbi = StateBank();
				sbi
			}
		}
 	}
}
class CustomerDetails
{
	String name;
	String password;
	String phnNumber;
	String bankName;
	int accntNumber;
	
	CustomerDetails(String name,String password,String phnNumber,String bankName,int accntNumber)
	{
		
	}
}
class StateBank implements Bank
{
	public void accntFind()
	{
		
	}
	public void transferAmount()
	{
		
	}
}
class KarnatakaBank implements Bank
{
	public void accntFind()
	{
		
	}
	public void transferAmount()
	{
		
	}
}
class HDFC implements Bank
{
	ArrayList<>
	public void accntFind()
	{
		
	}
	public void transferAmount()
	{
		
	}
}
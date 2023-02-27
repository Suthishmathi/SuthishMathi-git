import java.util.Scanner;
class BankL3
{
	
	public static void main(String[] args)
	{
		System.out.println("~~~~~~Welcome to Online Banking website~~~~~~~");
			UserDetails u=new UserDetails();
			u.detail();
	}
}
class UserDetails
{
	String name;
	int custId;
	int acct_num;
	int balance;
	String ePass;
	Scanner sc=new Scanner(System.in);
	static UserDetails ud[]=new UserDetails[10];
	static int accntNumallocation=494274,custIdallocation=1806;
	static int k=3;
	static String actName,enPass;
	static int actNum,cId,balanceAmount=10000;
	public UserDetails(int custId,int acct_num,String name,int balance,String ePass)
	{
		this.name=name;
		this.custId=custId;
		this.acct_num=acct_num;
		this.balance=balance;
		this.ePass=ePass;
	}
	public String toString()
	{
		return custId+"         "+acct_num+"           "+name+"          "+balance+"         "+ePass;
	}
	public void detail()
	{
	ud[0]=new UserDetails(1802,494270,"Suthish",10000,"ApipNbjm");
		ud[1]=new UserDetails(1803,494271,"Aadhil",10000,"Cbaoijoh");
		ud[2]=new UserDetails(1804,494272,"Anas",10000,"dbnqvt");
		ud[3]=new UserDetails(1805,494273,"Jameel",10000,"kbwb22");
		System.out.println("1.Admin \n2.Account User");
		byte n=sc.nextByte();
		switch(n)
		{
			case 1:
			{
				Admin adm=new Admin();
				adm.signUp();
				break;
			}
			case 2:
				logincontent();
				break;
		}
	}
	public void logincontent()
	{
		
		System.out.println("1.Create Account\n2.Login Existing account");
		byte choice=sc1.nextByte();
		switch(choice)
		{
			case 1:
				accountCreate();
				break;
			case 2:
				SignUp();
		}
	}
	public void accountCreate()
	{
		
	}
}
class Admin extends UserDetails
{
	Scanner sc1=new Scanner(System.in);
	public void signUp()
	{
		String name="NIbila";
		String pass="nibila@123";
		System.out.println("Enter the admin name : ");
		String admin_name=sc1.next();
		System.out.println("Enter the password");
		String admin_Pass=sc1.next();
		if(admin_name.equals(name) && admin_Pass.equals(pass))
			view();
	}
	public void view()
	{
		for(int i=0;i<k;i++)
			System.out.println(ud[i]);
	}
	
}
class OnlineBank
{
	public void content()
	{
		System.out.println("");
	}
}
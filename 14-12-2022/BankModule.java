import java.util.*;
import java.util.regex.*;

class BankModule
{
	static Scanner sc=new Scanner(System.in);
	static CustomerDetails cd[]=new CustomerDetails[10];
	static int accntNumallocation=49425774,custIdallocation=1806;
	static Bank b=new Bank();
	static int k=4;
	static int actNum,cId,balanceAmount=10000;
	public static void main(String[] args)
	{
		
		System.out.println("-----Welcome to the Zoho bank-----");
		cd[0]=new CustomerDetails(1802,49425770,"Suthish",10000,"ApipNbjm","Suthish@123");
		cd[1]=new CustomerDetails(1803,49425771,"Aadhil",10000,"Cbaoijoh","Aadhil@456");
		cd[2]=new CustomerDetails(1804,49425772,"Anas",10000,"dbnqvt","Anas@678");
		cd[3]=new CustomerDetails(1805,49425773,"Jameel",10000,"kbwb22","Jameel@001");
			mainContent();
	}
	public static void mainContent()
	{
		System.out.println(" 1.Admin \n 2.User");
		byte choice=sc.nextByte();
		switch(choice)
		{
			case 1:
			{
				Admin adm=new Admin();
				adm.login1();
			}break;
			case 2:
			content();
			break;
		}
	}
	public static void content()
	{
		System.out.println("1.Create Account \n2.Login with existing account \n3.Log Out");
		byte choice=sc.nextByte();
		switch(choice)
		{
			case 1:
				accountCreation();
				break;
			case 2:
				login();
				break;
			case 3:
				mainContent();
				break;
		}
	}
	public static void accountCreation()
	{
		String actName,enPass,orgPass;
		System.out.println("------Account creation -----");
		System.out.println("Enter the account holder name : ");
		String accountHolderName=sc.next();
		System.out.println("Enter the new password : ");
		String accountHolderPass=sc.next();
			boolean t=validatePass(accountHolderPass);
		if(t)
		{
			System.out.println("Enter the password for Confirmation : ");
			String conformPass=sc.next();
			if(accountHolderPass.equals(conformPass))
			{
				actName=accountHolderName;
				orgPass=conformPass;
				cId=custIdallocation++;
				enPass=encryption(accountHolderPass);
				actNum=accntNumallocation++;
			
			cd[k]=new CustomerDetails(cId,actNum,actName,balanceAmount,enPass,orgPass);
				
				b.bankLogin(k);
				k++;
				accntNumallocation++;
				custIdallocation++;
			}
			else 
			{
				System.out.println("Your password is incorrect");
				accountCreation();
			}
		}
		else 
		{
			System.out.println("Password is too short!!");
			accountCreation();
		}
	}
	public static String encryption(String pass)
	{
		char eArr[]=pass.toCharArray();
		String ePass="";
			for(int i=0;i<eArr.length;i++)
			{
				if(eArr[i]=='z' || eArr[i]=='Z')
					ePass+=eArr[i]-25;
				else				
				    ePass+=++eArr[i];
			}
			return ePass;
	}
	public void decrypt(String pass){
		char dArr[]=pass.toCharArray();
		String dPass="";
			for(int i=0;i<dArr.length;i++)
			{
				if(dArr[i]=='z' || dArr[i]=='Z')
					dPass+=dArr[i]+25;
				else				
				    dPass+=--dArr[i];
			}		
	}
	public static boolean validatePass(String pass)
	{
		String regex="^(?=.*[0-9][0-9])"+"(?=.*[a-z])(?=.*[A-Z])"+"(?=.*[@#$%^&*++-])"+"(?=\\S+$).{8,20}$";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(pass);
		return m.matches();
	}
	public static void login()
	{
			System.out.println("Enter the name : ");
			String aname=sc.next();
			System.out.println("Enter the password : ");
			String pass=sc.next();
			boolean check=true;
			for(int i=0;i<=k;i++)
			{
				if(cd[i].name.equals(aname) && cd[i].originalPassword.equals(pass))
					{
					b.bankLogin(i);
				check=false;
				break;
					}
			}
			if(check)
				login();
	}
}
class CustomerDetails
{
	int custId;
	int accntNum;
	String name;
	int balance;
	String encryptPass;
	String originalPassword;
	public CustomerDetails(int custId,int accntNum,String name,int balance,String encryptPass,String originalPassword)
	{
		this.custId=custId;
		this.accntNum=accntNum;
		this.name=name;
		this.balance=balance;
		this.encryptPass=encryptPass;
		this.originalPassword=originalPassword;
	}
	public String toString()
	{
		return custId+"       "+accntNum+"       "+name+"        "+balance+"         "+encryptPass;
	}
}
class Admin extends BankModule
{
	public void login1()
	{
		System.out.println("Enter the name : ");
			String aname=sc.next();
			String admin_name="Nibila";
			String admin_Pass="Nibila@123";
			System.out.println("Enter the password : ");
			String pass=sc.next();
			boolean check=true;
			for(int i=0;i<10;i++)
			{
				if(admin_name.equals(aname) && admin_Pass.equals(pass))
					{
					admin_Content();
				check=false;
				break;
					}
			}
			if(check)
				login1();
	}
	public void admin_Content()
	{
		while(true)
		{
		System.out.println("1.View \n2.Top 3 Customer\n3.Logout");
		byte choice1=sc.nextByte();
		if(choice1==1)
			view();
		else if(choice1==2)
			topCustomer();
		else if(choice1==3)
			mainContent();	
		}
	}
	public void topCustomer()
	{
		CustomerDetails dupe[]=cd;
		System.out.println("kwofpkw");
		for(int j=0;j<=k;j++)
		{
			for(int p=0;p<k-j-1;p++)
			{
				if(dupe[p].balance<dupe[p+1].balance)
				{
					System.out.println("adsad");
					CustomerDetails temp=dupe[p];
					dupe[p]=dupe[p+1];
					dupe[p+1]=temp;
				}
			}
		}
				for(int j=0;j<k;j++)
			System.out.println(cd[j]);
	}
	public void view()
	{
		for(int j=0;j<=k;j++)
			System.out.println(cd[j]);
	}
}
class Bank extends BankModule
{
	Scanner sc1=new Scanner(System.in); 
	public void bankLogin(int i)
	{
			boolean c=true;
			while(c){
				System.out.println("1.With Drawal\n"
				+"2.Cash Deposit \n"
				+"3.Account Transfer\n"
				+"4.Transaction History "
				+"\n5.Change Password \n "
				+"6.Password History"+"\n7.Logout");
			byte op=sc1.nextByte();
				switch(op)
				{
					case 1:
					{
						cashWithDraw(i);
						break;
					}
					case 2: 
					{	
						cashDeposit(i);
						break;
					}
					case 3:
					{
						accountTranfer(i);
						break;
					}
					case 4:
					{
						transactioHistory(i);
						break;
					}
					case 5:
					{
						changePassword(i);
						break;
					}
					case 6:
					{
							passHistory(i);
							break;
					}	
					case 7:
					{
						content();
						c=false;
						break;
					}					
			}
			}
	}
	static int count=0,transId=1;
	public void cashWithDraw(int i)
	{
		System.out.println("Enter the amount to withdraw  : ");
		int wd=sc1.nextInt();
		String transactionType="ATM Withdrawal";
		int amt=cd[i].balance;
		if(cd[i].balance-wd>=1000)
		{
			cd[i].balance-=wd;
			int bal=cd[i].balance;
			System.out.println("Your balance is "+cd[i].balance);
			tH[count]=new TransactionHistory(cd[i].name,transId,transactionType,amt,bal);
			transId++;
			count++;
		}
		else 
			System.out.println("Your a minimum a balance amount");
	}
	public void cashDeposit(int i)
	{
		System.out.println("Enter the account number : ");
		int an=sc1.nextInt();
		System.out.println("Enter the total cash : ");
		int dp=sc1.nextInt();
		int amt=cd[i].balance;
		String transactionType1="Cash Deposit";
		boolean check=true;
		for(int j=0;j<=k;j++)
		{
			if(cd[j].accntNum==an)
			{
				check=false;
				System.out.println("Confirm your name and then proceed  : ");
				System.out.println(cd[j].name);
				System.out.println("Enter 1.Yes 2.No");
				int op1=sc.nextInt();
				if(op1==1)
				{
					cd[j].balance+=dp;
					int bal=cd[j].balance;
					tH[count]=new TransactionHistory(cd[i].name,transId,transactionType1,amt,bal);
					transId++;
					count++;
					System.out.println("Your amount is deposited successfully");
					break;
				}
				else 
				{
					cashDeposit(i);
				break;
				}
			}
			
		}
		if(check)
			cashDeposit(i);
	}
	
	public void accountTranfer(int i)
	{
		System.out.println("Enter the account number : ");
		int at=sc1.nextInt();
		System.out.println("Enter the amount to transfer  : ");
		int transfer=sc1.nextInt();
		int amt=cd[i].balance;
		String transactionType2="Transfer";
		boolean c=true;
		for(int j=0;j<=k;j++)
		{
			if(cd[j].accntNum==at)
			{
				if(cd[i].balance-transfer>1000)
				{
				c=false;
				System.out.println("Confirm account holder  name and then proceed  : ");
				System.out.println(cd[j].name);
				System.out.println("Enter 1.Yes 2.No");
				int op1=sc1.nextInt();
				if(op1==1 && transfer>5000)
				{
					transactionType2+=cd[j].accntNum;
					cd[j].balance+=transfer;
					cd[i].balance-=transfer;
					cd[i].balance-=10;
					int bal=cd[i].balance;
					tH[count]=new TransactionHistory(cd[i].name,transId,transactionType2,amt,bal);
					count++;transId++;
					System.out.println("10 Rupees detected from your account for operation fee");
					System.out.println("Payment Successfulyy transfered to "+cd[j].name);
				}
				else if(op1==1 && transfer<5000)
				{
					cd[j].balance+=transfer;
					cd[i].balance-=transfer;
					transactionType2+=cd[j].accntNum;
					int bal=cd[i].balance;
					tH[count]=new TransactionHistory(cd[i].name,transId,transactionType2,amt,bal);
					count++;
					transId++;
					System.out.println("Payment Successfulyy transfered to "+cd[j].name);
				}
				
				else 
					accountTranfer(i);	
				}
				else 
				{
					System.out.println("Minimum balance is 1000 your exceeding balance");
					accountTranfer(i);
				}
			}
		}
		if(c)
		{
			System.out.println("Entered account is not correct \n Try again....");
			accountTranfer(i);
		}
	}
	List <String> oldp=new ArrayList<String>();

	List <String> username=new ArrayList<String>();
	TransactionHistory tH[]=new TransactionHistory[20];
	static int m=0;
	public void transactioHistory(int i)
	{
		System.out.println("\t\tName : "+cd[i].name);
		System.out.println("\tAccount Number : "+cd[i].accntNum);
		System.out.println("\t\tCustomer Id : "+cd[i].custId);
		System.out.println("Trans ID      Trans TYpe      Amount      Balance");
		
		for(int j=0;j<count;j++)
		{
			if(cd[i].name.equals(tH[j].uname))
			System.out.println(tH[j]);
		}
		
	}
	public void passHistory(int i){
		Iterator<String> iter= oldp.iterator();
		System.out.println("OLD PASSWORD"+"\t"+"NEW PASSWORD");
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
	public void changePassword(int i)
	{
		 int n=0;
		System.out.println("Enter the old password : ");
		String oldPassword=sc1.next();
		if(cd[i].originalPassword.equals(oldPassword))
		{
			System.out.println("Enter the new Password  : ");
				String np=sc1.next();
			String newPassword=encryption(oldPassword);
				System.out.println("Enter the confirm Password");
			String confirmPassword=sc1.next();
			if(confirmPassword.equals(np))
				{
					cd[i].encryptPass=newPassword;
					cd[i].originalPassword=confirmPassword;
					String changedPassword=oldPassword+"        "+confirmPassword;
					n++;
					oldp.add(changedPassword);
					username.add(cd[i].name);
					System.out.println("Your password is changed successfully");
					m++;
				}
		}
		else if(!cd[i].originalPassword.equals(oldPassword))
		{
			System.out.println("Entered password is mismatched");
			changePassword(i);
		}
	}
}
class TransactionHistory
{
	String  transType;
	String uname;
	int transId;
	int Amount;
	int Balance;
	public TransactionHistory(String uname,int transId,String transType,int Amount,int Balance)
	{
		this.uname=uname;
		this.transId=transId;
		this.transType=transType;
		this.Amount=Amount;
		this.Balance=Balance;
	}
	public String toString()
	{
		return transId+"      "+transType+"        "+Amount+"      "+Balance;
	}
}
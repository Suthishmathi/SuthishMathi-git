import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
class ZCoin
{
	public static void main(String[] args)
	{
			Agent ud=new Agent();
				ud.content();
	}
}
class UserDetail extends Agent
{
	String fullName;
	String emailID;
	long mobileNumber;
	int H_ID;
	String pwd;
	boolean userStatus=false;
	int RC;
	UserDetail(String fullName,String emailID,long mobileNumber,String pwd)
	{
		this.fullName=fullName;
		this.emailID=emailID;
		this.mobileNumber=mobileNumber;
		//this.H_ID=H_ID;
		this.pwd=pwd;
	}
	public String toString()
	{
		return fullName+"      "+emailID+"       "+mobileNumber+"       ";
	}
	
	
}
class Agent extends User
{
	public void content()
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("1.Agent Login \n2.User Login");
		byte choice=sc1.nextByte();
		switch(choice)
		{
			case 1:
				agentLogin();
				break;
			case 2:
				userContent();
				break;
		}
	}
		public void agentLogin()
		{
			
			String agentmailId="Nibila@Zohomail.com";
			String agentPwd="Nibila*123";
			System.out.println("Enter the Agent name : ");
			String aname=sc.next();
			System.out.println("Enter the password : ");
			String apwd=sc.next();
			if(aname.equals(agentmailId) && apwd.equals(agentPwd))
				{
						userManagment();				
				}
		}
		private void userManagment()
		{
			
			System.out.println("~~~~~~~~USER MANAGEMENT PORTAL~~~~~~~");
					System.out.println("1.User Request History"+
										"\n2.UserTransaction"+
										"\n3.Exit");
						byte ch1=sc.nextByte();
						switch(ch1)
						{
							case 1:
								userReqHistory();
								break;
							case 2:
								userTransHistory();
								break;
							case 3:		
								content();
								break;
						}		
		}
		static uid=3117;
private void userReqHistory()
{
	//for(int i=0;i<usr_det.size();i++)
		System.out.println(usr_det);
	System.out.println("User Name : ");
		String acc_name=sc.next();
		boolean c1=true;
	for(int i=0;i<usr_det.size();i++)
	{
		if(usr_det.get(i).fullName.equals(acc_name))
		{
			System.out.println("1.Accept\n2.Reject");
			byte ch4=sc.nextByte();
			if(ch4==1)
			{
				usr_det.get(i).userStatus=true;
				usr_det.get(i).H_ID=uid;
				uid++;
			}
			else
				false;
			userManagment();
			c1=false;
			break;
		}
	}
	if(c1)
	{
		System.out.println("User name not found");
		userReqHistory();
	}
}
		private void userTransHistory()
		{
			
		}
}
class User
{
	static ArrayList<UserDetail> usr_det=new ArrayList<>();
	//ArrayList<String> reqHistory=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	//UserDetail ud=new UserDetail();
	public void userContent()
	{
			Agent ag=new Agent();
		System.out.println("~~~~~~USER CONTENT PORTAL~~~~~~~");
		System.out.println("1.Create Account\n2.Login\n3.Exit");
		byte ch2=sc.nextByte();
		if(ch2==1)
			createAcc();
		else if(ch2==2)
		{
			System.out.println("~~~~~~~~~USER LOGIN PORTAL~~~~~~~");
				userLogin();
		}
		else if(ch2==3)
			ag.content();
	}
	public void createAcc()
	{
		System.out.println("~~~~~~USER ACCOUNT CREATION PORTAL~~~~~~~");
		System.out.println("Enter full name : ");
		String usr_name=sc.next();
		System.out.println("Enter Email ID : ");
		String usr_emailID=sc.next();
		System.out.println("Enter mobile number : ");
		long usr_mobNum=sc.nextLong();
		String usr_pwd=passValidate(usr_name);
		usr_det.add(new UserDetail(usr_name,usr_emailID,usr_mobNum,usr_pwd));
		System.out.println(usr_det);
		userContent();
	}
	private String passValidate(String usrName,String eID)
	{
		System.out.println("Enter the password : ");
		String pass=sc.next();
		int u=0,l=0,n=0,s=0;
		String mNum=
		if(usrName.equals(pass) || eID.equals(pass))
		{
			if(usrName.equals(pass))
			{
				System.out.println("User name will not be a password");
				return passValidate(usrName,eID);
			}
			else
			{
				System.out.println("email ID will not be a password");
				return passValidate(usrName,eID);
			}
		}
		else if(pass.length()>=8)
		{
			for(int i=0;i<pass.length();i++)
			{
				if(pass.charAt(i)>='a' && pass.charAt(i)<='z')
					l++;
				else if(pass.charAt(i)>='A' && pass.charAt(i)<='Z')
					u++;
				else if(pass.charAt(i)>='0' && pass.charAt(i)<='9')
					n++;
				else
					s++;
			}
			if(u>0 && l>0 && n>0 && s>0)	
					return pass;
			else 
			{
				System.out.println("Invalid password");
			return passValidate();
			}
		}
		else 
		{
			System.out.println("password must contain 8 letters!!!!");
			return passValidate();
		}
	}
	public void userLogin()
	{
		
		System.out.println("Enter the mail ID :");
		String mailID=sc.next();
		System.out.println("Enter the password : ");
		String password1=sc.next();
		boolean c=true;
		int i;
		for(i=0;i<usr_det.size();i++)
		{
			if(mailID.equals(usr_det.get(i).emailID) && password1.equals(usr_det.get(i).pwd) && usr_det.get(i).userStatus==true)
			{
				c=false;
				uContent(i);
				break;
			}
		}
		i--;
		if(c)
		{
			if(!usr_det.get(i).userStatus)
			{
			System.out.println(" admin not allowed!!");
				userContent();
			}
			else
			{
				System.out.println("Entered password incorrect!!!");
				userLogin();
			}
		}
	}
	public void uContent(int i)
	{
		boolean f=true;
		while(f)
		{
		System.out.println("1.Account Details \n2.Transaction History \n3.Change Password \n4.RC Transaction \n5.ZCoind Transaction\n"+
		"\n6.Deposit Amount\n"+"7.Exit");
		byte ch3=sc.nextByte();
		switch(ch3)
		{
			case 1:
				viewAccDet(i);
				break;
			case 2:
				transHistory(i);
				break;
			case 3:
				changePass(i);
				break;
			case 4:
				rcTransaction(i);
				break;
			case 5:
				zCoinTransaction(i);
				break;
			case 6:
				deposit(i);
				break;
			case 7:
			{
				userContent();
				f=false;
			}
			default:
				uContent(i);
		}
		}
	}
	public void viewAccDet(int i)
	{
			
			System.out.println("Name : "+usr_det.get(i).fullName);
			System.out.println("Email ID : "+usr_det.get(i).emailID);
			System.out.println("Mobile Number : "+usr_det.get(i).mobileNumber);
			System.out.println("ZID : "+usr_det.get(i).H_ID);
			uContent(i);
	}
	public void transHistory(int i)
	{
		
	}
	public void changePass(int i)
	{
		
	}
	public void rcTransaction(int i)
	{
		
	}
	public void zCoinTransaction(int i)
	{
		
	}
}
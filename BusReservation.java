import java.util.*;
class BusReservation
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		String seat[][]=new String[9][2];
		
		int a=1;
		for(int i=0;i<seat.length;i++)
		{
			for(int j=0;j<seat[0].length;j++)
			{
				if(i==6 && j == 0)  
					a=1;
				if(i<6)
					seat[i][j]=String.valueOf(a++);
				else 
					seat[i][j]="u"+String.valueOf(a++);
			}
		}
		
		mContent(seat);
	}
	public static void mContent(String seat[][])
	{
	
		Admin a=new Admin();
		System.out.println(" 1.Admin \n 2.User");
		byte choice=sc.nextByte();
		if(choice == 1)
			a.adminSignIn(seat);
		else if(choice == 2)
			a.loginContent(seat);
	}
}
class Admin extends User
{
	
	public void adminSignIn(String seat[][])
	{
		String name="Nibila";
		String pass="nibila@123";
		System.out.println("Enter the name : ");
		String aname=sc.next();
		System.out.println("Enter the password : ");
		String apass=sc.next();
		if(aname.equals(name) && apass.equals(pass))
			adminContent(seat);
		else
			adminSignIn(seat);
	}
	public void adminContent(String seat[][])
	{
		boolean c1=true;
		while(c1)
		{
		System.out.println(" 1.View Seat\n 2.Customer Details\n 3.Exit");
		byte choice1=sc.nextByte();
		if(choice1 == 1)
			viewSeat(seat);
		else if (choice1 == 2)
			custDetails();
		else if(choice1 == 3)
		{
			c1=false;
			BusReservation.mContent(seat);
		}
		}
	}
	public void viewSeat(String seat[][])
	{
		for(int i=0;i<seat.length;i++)
		{
			for(int j=0;j<seat[0].length;j++)
			{
				System.out.print(seat[i][j]+"  ");
			}
			System.out.println();
		}
	}
	public void custDetails()
	{
		System.out.println(cus_info.size());
		System.out.println("Name       age       Gender       Ph No        Mail        Fare        PickUp       Drop             seat No");
		for(int i=0;i<cus_info.size();i++)
			System.out.println(cus_info.get(i));
	}
}
class CustomerInformation
{
	String name;
	int age;
	String gender;
	long phnNum;
	String mail;
	int fare;
	String seatNo;
	String pickUp;
	String drop;
	CustomerInformation(String name,int age,String gender,long phnNum,String mail,String pickUp,String drop,int fare,String seatNo)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phnNum = phnNum;
		this.mail = mail;
		this.pickUp = pickUp;
		this.drop = drop;
		this.fare = fare;
		this.seatNo = seatNo;
	}
	public String toString()
	{
		return name+"     "+age+"      "+gender+"     "+phnNum+"      "+mail+"      "+pickUp+"      "+drop+"       "+fare+"     "+seatNo;
	}
}
class User 
{
	Scanner sc=new Scanner(System.in);
	static ArrayList<CustomerInformation> cus_info=new ArrayList<CustomerInformation>();
	public void loginContent(String seat[][])
	{
		boolean c3=true;
		while(c3)
		{
		System.out.println("1.Book Ticket\n 2.Cancel Ticket\n 3.Exit");
		byte choice3 =  sc.nextByte();
		if(choice3==1)
			book(seat);
		else if(choice3 == 2)
			cancel(seat);
		else
			{
				c3=false;
				BusReservation.mContent(seat);
			}
		}
	}
	public void book(String seat[][])
	{
		System.out.println("Enter the number tickets to book");
		int n=sc.nextInt();
		int i=0;
		while(i<n)
		{
		System.out.println("Enter the name : ");
			String cust_name = sc.next();
		System.out.println("Enter the age : ");
			int cust_age = sc.nextInt();
		System.out.println("Enter the Gender : ");
			String cust_gender = sc.next();
		System.out.println("Enter the Phone number : ");
			long cust_phNum = sc.nextLong();
		System.out.println("Enter the E-mail ID : ");
			String cust_mail = sc.next(); 
		System.out.println("Enter the Pick Up : ");
			String cust_pickUp = sc.next();
		System.out.println("Enter the Drop ");
			String cust_drop = sc.next();
		boolean c2=true;
		String seat_no="";
		System.out.println(" 1.Book Sleeper\n 2.Book Seat ");
		byte choice2=sc.nextByte();
		
		if(choice2 == 1)
			seat_no = bookSleeper(seat);
		else if(choice2 == 2)
			seat_no = bookSeat(seat);
		cus_info.add(new CustomerInformation(cust_name,cust_age,cust_gender,cust_phNum,cust_mail,cust_pickUp,cust_drop,140,seat_no));
		i++;
		}
	}
	public String bookSeat(String seat[][])
	{
		System.out.println("Enter the seat number : ");
		String cust_seat = sc.next();
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<seat[0].length;j++)
			{
				if(seat[i][j].equals(cust_seat))
				{
	
					System.out.println("Your Ticket Booked (Seater) seat no : "+cust_seat);
					seat[i][j]=" ";
					return cust_seat;
				}
			}
		}
		return bookSeat(seat);
	}
	public String bookSleeper(String seat[][])
	{
		System.out.println("Enter the sleeper no : ");
		String cust_sleep = sc.next();
		for(int i=6;i<seat.length;i++)
		{
			for(int j=0;j<seat[0].length;j++)
			{
				if(seat[i][j].equals(cust_sleep))
				{
					System.out.println("Your Ticket Booked (Sleeper) seat no : "+cust_sleep);
					seat[i][j]=" ";
					return cust_sleep;
				}
			}
		}
		return bookSleeper(seat);	
	}
	public void cancel(String seat[][])
	{
		System.out.println("Enter the name : ");
			String cancel_name = sc.next();
		for(int i=0;i<cus_info.size();i++)
		{
			if(cus_info.get(i).name.equals(cancel_name))
			{
				int sno=0;
				String sno1="";
				if(cus_info.get(i).seatNo.charAt(0)=='u')
				{
					sno=Integer.parseInt(cus_info.get(i).seatNo.charAt(1))-1;
					sno1="u"+String.valueOf(sno);
				}
				else 
					{
						sno=Integer.parseInt(cus_info.get(i).seatNo)-1;
						sno1=String.valueOf(sno);
					}
				//int sno2=Integer.parseInt(cus_info.get(i).seatNo);
				
				for(int j=0;j<seat.length;j++)
				{
					for(int k=0;k<seat[0].length;k++)
					{
						if(sno1.equals(seat[j][k]))
						{
							
							if(k==seat[0].length-1)
								seat[++j][--k]=cus_info.get(i).seatNo;
							//if(j==5 && j == seat[0].length-1)
							else
								seat[j][++k]=cus_info.get(i).seatNo;
						}
					}
				}
				System.out.println("Your Ticket is cancelled");
				cus_info.remove(i);
			}
		}
	}	
}
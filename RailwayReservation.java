package zohoTask;

import java.util.Scanner;

public class RailwayReservation {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Booking bk=new Booking();
	System.out.println("~~~~~~~~WELCOME TO ONLINE RAILWAY TICKET RESERVATION~~~~~~~");
	System.out.println("Enter a user name:");
	String uname=sc.nextLine();
	System.out.println("Enter a passwrod :");
	String upwd=sc.next();
	System.out.println("Successfully logged in!!!!!");
	
	boolean t=true;
	while(t) {
		System.out.println(" 1.Ticket Booking\n 2.Ticket Cancel\n 3.Ticket Availability\n 4.Ticket Booed details\n5.Logout");
		byte choice=sc.nextByte();
		switch(choice) {
		case 1:
		{
				bk.passengerDetails();
				break;
		}
		case 2:
		{
			bk.cancelTicket();
			break;
		}
		case 3:
		{
			bk.ticketAvailability();
			break;
		}
		case 4:
		{
			bk.bookedDetails();
			break;
		}
		case 5:
			t=false;
			break;
		default:
			System.out.println("Enter a correct number!!!!!");
		
		}
	}
	}
}
class Booking {
	Scanner sc1=new Scanner (System.in);
	static int l=2,u=2,m=2,rac=2;
	static int n;
	static String pname[]=new String[10];
	static int age[]=new int[10];
	static String gender[]=new String[10];
	static String birth[]=new String[10];
	static int r=1,c=0,k=0;
	public  void passengerDetails() {
		System.out.println("Enter number of passenger to book the ticket");
		
		n=sc1.nextInt();
		for(int i=k;i<n;i++) {
			System.out.println("Enter a passenger name:");
				pname[k]=sc1.nextLine();
				pname[k]=sc1.nextLine();
			System.out.println("Enter a passenger age:");
				age[k]=sc1.nextInt();
			System.out.println("Enter a passenger gender");
				gender[k]=sc1.next();
			System.out.println("Birth perference:");
			if(age[i]<=5)
				{
				k++;
				continue;
				}
			else if(age[i]>=50)
			{
				if(l<=0)
					birthPreference();
				else
				{
					birth[i]="lower";				
					l--;
				}
			}
				birthPreference();
				k++;
		}
		System.out.println("SI No\t Name\t \t Age\t Gender \t Birth Preference");
		
		for(int i=0;i<pname.length;i++) {
			if(pname[i]!=null)
			System.out.println(r+"\t"+pname[i]+"\t\t"+age[i]+"\t"+gender[i]+"\t"+birth[i]);	
			
		}
		r++;
		System.out.println("Please checkt whether your entered details are correct");
	}
	public void cancelTicket() {
		
	}
	public void ticketAvailability() {
		 
		 		System.out.println("Lower Birth: "+l);
		 		System.out.println("Upper Birth: "+u);
		 		System.out.println("middle Birth: "+m);
		 		System.out.println("RAC:"+rac);
	}
	public void bookedDetails() {
		
		if(pname.equals(null))
			System.out.println("No Tickets are booked");
		else {
			System.out.println("SI No\t Name\t \t Age\t Gender \t Birth Preference");
		for(int i=0;i<pname.length;i++) {
			if(pname[i]!=null)
				System.out.println(r+"\t"+pname[i]+"\t\t"+age[i]+"\t"+gender[i]+"\t"+birth[i]);	
		}
		}
	}
	public void birthPreference(){
		System.out.println("1.Lower\n2.Middle\n3.Upper");
		int bp=sc1.nextInt();
		switch(bp) {
			case 1:
			{
				if(l<=0) {
					System.out.println("lower is already booked try others!!!");
					birthPreference();
				}
					else
					{
						birth[c]="Lower";
						c++;
						l--;
					}
				break;
			}
			case 2:
			{
				if(m<=0)
				{
					System.out.println("middle is already booked try others!!!");
					birthPreference();
				}
					else
					{
						birth[c]="Middle";
						c++;
						m--;
					}
				break;
			}
			case 3:
			{
				if(u<=0)
				{
					System.out.println("upper is already booked try others!!!");
					birthPreference();
				}
				else
				{
					birth[c]="Upper";
					c++;
					u--;
				}
				break;
			}
		}
	}
}

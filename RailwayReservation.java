package practice;

import java.util.Scanner;

public class RailwayReservation {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Booking bk=new Booking();
//	System.out.println("~~~~~~~~WELCOME TO ONLINE RAILWAY TICKET RESERVATION~~~~~~~");
//	System.out.println("Enter a user name:");
//	String uname=sc.nextLine();
//	System.out.println("Enter a passwrod :");
//	String upwd=sc.next();
//	System.out.println("Successfully logged in!!!!!");
	
	boolean t=true;
	while(t)
	{
		System.out.println(" 1.Ticket Booking\n 2.Ticket Cancel\n 3.Ticket Availability\n 4.Ticket Booed details\n 5.Print My Ticket\n 6.Logout");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
				bk.passengerDetails();
				break;
		case 2:
			bk.cancelTicket();
			break;
		case 3:
			bk.ticketAvailability();
			break;
		case 4:
			bk.bookedDetails();
			break;
		case 5:
			bk.print();
			break;
		case 6:
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
	static int l=2,u=2,m=2,rac=2,w=0;
	
	static String pname[]=new String[12];
	 static int age[]=new int[12];
	 static String gender[]=new String[12];
	static String berth[]=new String[12];
	static int pnrnum[]=new int[12];
	//static String fromto[]=new String[12];
	 int[] sino=new int[12];
	static int r=1,k=0;
	public  void passengerDetails() {
		System.out.println("Enter number of passenger to book the ticket");
		
		int n=sc1.nextInt();
		for(int i=0;i<n;i++,k++) 
		{
			if(w==2)
			{
				System.out.println("Tickets are Booked!!!!");
				break;
			}
			System.out.println("Enter a passenger name:");
				pname[k]=sc1.next();
				sino[k]=r;
			System.out.println("Enter a passenger age:");
				age[k]=sc1.nextInt();
			System.out.println("Enter a passenger gender");
				gender[k]=sc1.next();
			 if(l<=0&&u<=0&&m<=0&&rac<=0)
				{
					berth[k]="waiting List";
					w++;
				}
			else if(l<=0&&u<=0&&m<=0)
			{
				berth[k]="RAC";
				rac--;
			}
			
			else if(age[k]<=5)
			{
				berth[k]="-------";
				continue;
			}
			else if(age[k]>=50)
			{
				if(l<=0)
					berthPreference();
				else
				{
					berth[k]="lower";
					l--;
				}
			}
			else 
				berthPreference();
		}
		r++;
		System.out.println("Your Tickets are Booked Successfully\n*********Happy Journey*******");
		//System.out.println("SI No\t Name\t \t Age\t Gender \t Berth Preference\t From and To");
		
//		for(int i=0;i<pname.length;i++)
//		{
//			if(pname[i]!=null)
//			System.out.println(sino[i]+"\t"+pname[i]+"\t\t"+age[i]+"\t"+gender[i]+"\t"+berth[i]+"\t"+fromto[i]);	
//			
//		}
	}
	public void cancelTicket() {
		System.out.println("Enter the PNR number to cancel your booking");
		int pnr=sc1.nextInt();
		int pos;
		for(int i=0;i<pname.length;i++) {
			if(pnrnum[i]==pnr) {
				pos=i;
				for(int j=i;j<pname.length;j++) {
					if(berth[j]=="RAC") {
					pname[pos]=pname[j];
					age[pos]=age[j];
					gender[pos]=gender[j];
					pos[j]= p
					}
				}
			}
		}
	}
	public void ticketAvailability() {
		 		System.out.println("Lower Berth: "+l);
		 		System.out.println("Upper Berth: "+u);
		 		System.out.println("middle Berth: "+m);
		 		System.out.println("RAC:"+rac);
		 		System.out.println("Waiting List: "+w);
	}
	public void bookedDetails() {
		
		if(pname[0]==null)
			System.out.println("No Tickets are booked");
		else {
			System.out.println("SI No\t Name\t \t Age\t Gender \t Berth Preference \t From To");
		for(int i=0;i<pname.length;i++) {
			if(pname[i]!=null)
				System.out.println(sino[i]+"\t"+pname[i]+"\t\t"+age[i]+"\t"+gender[i]+"\t"+berth[i]+"Chennai to Goa");	
		}
		}
	}
	public void berthPreference(){
		System.out.println("1.Lower\n2.Middle\n3.Upper");
		int bp=sc1.nextInt();
		switch(bp) {
			case 1:
			{
				if(l<=0) {
					System.out.println("lower is already booked try others!!!");
					berthPreference();
				}
					else
					{
						berth[k]="Lower";
						l--;
					}
				break;
			}
			case 2:
			{
				if(m<=0)
				{
					System.out.println("middle is already booked try others!!!");
					berthPreference();
				}
					else
					{
						berth[k]="Middle";
						m--;
					}
				break;
			}
			case 3:
			{
				if(u<=0)
				{
					System.out.println("upper is already booked try others!!!");
					berthPreference();
				}
				else
				{
					berth[k]="Upper";
					u--;
				}
				break;
			}
		}
	}
	public void print() {
		System.out.println("Enter the serial number of your Ticket");
		int si=sc1.nextInt();
		for(int i=0;i<pname.length;i++) {
			System.out.println("SI.No\t Name\t Age \t Gender\t Berth Status \t From and To");
			if(sino[i]==si){
				System.out.println(sino[i]+"\t"+pname[i]+"\t"+age[i]+"\t"+berth[i]+"\t Chennai to Goa");
			}
		}
	}
}
import java.util.Scanner;
class LoginModule
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
			
			Admin adm=new Admin();
			User usr=new User();
				System.out.println("---------------Welcome To The Login Page------------");
				System.out.println("Press 1 for Admin and 2 for User\n 1-Admin\n 2-User");
			String adminName="Sridhar";
			String password="Vembu@123";
			byte choice=sc.nextByte();
				switch(choice)
				{
					case 1:
						SignIn(adminName,password);
						adm.content();
						break;
					case 2:
						SignUp();
						usr.ucontent();
						break;
				}
				
				
		}
		public static void  SignUp(){
			System.out.println("-------------Signup Page------------");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a name ");
			String uname=sc.next();
			System.out.println("Enter a password");
			String upwd=sc.next();
			validator(uname,upwd);
		}
		
		public static void validator(String uname,String password) {
			int upper=0,lower=0,number=0,special=0;
			String p=password;
			if(p.length()>=8) 
			{
				
				for(int i=0;i<p.length();i++) {
					if(p.charAt(i)>=48 &&p.charAt(i)<=57) 
						number++;
					else if (p.charAt(i)>=65 &&p.charAt(i)<=90) 
							upper++;
					else if	(p.charAt(i)>=97 &&p.charAt(i)<=122)	
						lower++;
					else if(p.charAt(i)>=33 &&p.charAt(i)<=47||p.charAt(i)==64)
							special++;
				}
				if(upper>=1 && lower>=1 && number>=1&&special>=1) {
					System.out.println("Password validated");
						SignIn(uname,p);
				}
				else
				{
					System.out.println("password must contain atleast one upper ,lower, number and spwcial");
					SignUp();
				}
			}
			else 
			{
				System.out.println("Entered password is too short \n Try again!!!");
				SignUp();
			}
		}
		public static void SignIn(String adminName,String password)
		{
			Scanner sc1=new Scanner(System.in);
			System.out.println("--------------SignIn Page-------------");
			System.out.println("Enter a  Name");
			String aname=sc1.next();
			System.out.println("Enter a Password");
			String pwd=sc1.next();
			if(aname.equals(adminName) && pwd.equals(password))
			{
				System.out.println("Welcome "+aname);	
			}
			else 
			{
				System.out.println("Entered username and password is incorrected \n try again......");
				SignIn(adminName,password);
				sc1.close();
			}
		}	
	}
	class Admin extends LoginModule
	{
		Scanner sc2=new Scanner(System.in);
		static String book[]=new String[50];
		static int id[]=new int[50];
		static int cost[]=new int[50];
		static int count[]=new int[50];
		
		int k=2;
		public void content() 
		{
			
			boolean t=true;
			while(true)
			{
				System.out.println(" 1. Add Book in a counter \n 2.View a Book \n 3.Update \n 4.Delete Book\n 5.Logout");
			int get=sc2.nextInt();
				switch(get) 
				{
					case 1:
						addBook();
						break;
					case 2:
						view();
						break;
					case 3:
						update();
						break;
					case 4:
						deleteBook();
						break;
					case 5:
						LoginModule.main(null);
						t=false;
						break;
					default:
						System.out.println("Enter a correct number ");
				}
			}
		}
		private void addBook()
		{
			System.out.println("Enter the number of books to take entry....");
			byte n=sc2.nextByte();
			System.out.println("Enter the Book ID and Book name");
			for(int i=0;i<n;i++) 
			{
				System.out.println("Enter the Book ID:");
					id[k]=sc2.nextInt();
						book[k]=sc2.nextLine();
				System.out.println("Enter the Book Name");
					book[k]=sc2.nextLine();
				System.out.println("Enter the Book Cost");
					cost[k]=sc2.nextInt();
				System.out.println("Enter the book count");
					count[k]=sc2.nextInt();
					k++;
			}
		}
		public void view()
		{
			System.out.println("SI.No \t Book ID \t Book Name \t Cost");
			book[0]="Ponniyin Selvan";book[1]="IronMan";
			id[0]=1;id[1]=2;
			cost[0]=250;cost[1]=200;
			count[0]=10;count[1]=10;
			byte s=0;
			for(int i=0;i<book.length;i++)
			{
				if(cost[i]!=0)
				{
					s++;
				System.out.println(s+".     \t"+id[i]+"     \t     "+book[i]+"       \t"+cost[i]+"\t"+count[i]);
				}
			}
		}
		public void update()
		{
			System.out.println("Enter the 1.Book ID or 2.Book name 3.Cost  to change");
			int choice1=sc2.nextByte();
			switch(choice1){
				case 1:
				{	
					System.out.println("Enter the book id to change ");
					int id2=sc2.nextInt();
					for(int i=0;i<book.length;i++)
						{
							if(id[i]==id2)
							{
								System.out.println("Enter the new Book id");
								id[i]=sc2.nextInt();
								break;
							}	
						}
					content();
				}
				break;
				case 2:
				{	
					System.out.println("Enter the book name to change ");
					String book1=sc2.next();
					for(int i=0;i<book.length;i++)
						{
							if(book[i]==book1)
							{
								System.out.println("Enter the new Book name");
							book[i]=sc2.next();
							break;
							}	
						}
						content();	
				}
				break;
				case 3:
				{	
					System.out.println("Enter the book cost to change ");
					int cost1=sc2.nextInt();
					for(int i=0;i<book.length;i++)
						{
							if(cost[i]==cost1)
							{
								System.out.println("Enter the new Book cost");
							cost[i]=sc2.nextInt();
							break;
							}	
						}	
				}
				break;
			}
		}
		private void  deleteBook()
		{
			System.out.println("Enter a Book ID to delete a book from a counter");
			 byte id1=sc2.nextByte();
			 for(int i=0;i<book.length;i++)
			 {
				 if(id[i]==id1)
				 {
					 book[i]=null;
					 id[i]=0;
					 cost[i]=0;
					 count[i]=0;
				 }
			 }
		}
	}
class User extends Admin
{
	Admin adm1=new Admin();
	public void ucontent() {
	System.out.println("--------------Welcome to zoho library--------------");
	System.out.println("1.Read\n2.View\n3.Buy");
	int get=sc2.nextInt();
	switch(get) 
	{
			case 1:
				read();
				break;
			case 2:
				adm1.view();
				ucontent();
				break;
			case 3:
				buy();
				break;
	}
	}
	private void read() {
		System.out.println("The Summary of the Ponniyin Selvan");
		System.out.println("The story revolves around Vandiyathevan, a charming, brave and brilliant young man who sets out across the Chola land to deliver a message from the Crown Prince Aditha Karikalan to the King and the Princess. \n The story shuttles between Vandiyathevan's travels in Chola country and the young Prince Arulmozhivarman's (later known as Raja Raja Chola) travels in Sri-Lanka. \n The narrative deals with attempts by his sister Kundavai to bring back Arulmozhivarman to establish political peace in a land seemingly beset with unrest and civil war plotted by vassals and petty chieftains.");
	}
	private void buy() {
		
	}
}




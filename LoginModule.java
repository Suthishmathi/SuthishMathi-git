import java.util.Scanner;
class LoginModule
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Admin adm=new Admin();
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
			}
			sc.close();
	}
	public static void SignIn(String adminName,String password)
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter a Admin Name");
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
class Admin
{
	Scanner sc2=new Scanner(System.in);
	String book[]=new String[50];
	int id[]=new int[50];
	int cost[]=new int[50];
	public void content() {
		System.out.println(" 1. Add Book in a counter \n 2.View a Book \n 3.Update \n 4.Delete Book");
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
			default:
				System.out.println("Enter a correct number ");
				content();
		}
	}
	public  void addBook()
	{
		System.out.println("Enter the number of books to take entry....");
		byte n=sc2.nextByte();
		System.out.println("Enter the Book ID and Book name");
		for(int i=2;i<n+2;i++) {
			System.out.println("Enter the Book ID:");
				id[i]=sc2.nextInt();
					book[i]=sc2.nextLine();
			System.out.println("Enter the Book Name");
				book[i]=sc2.nextLine();
				System.out.println("Enter the Book Cost");
				cost[i]=sc2.nextInt();
		}
		content();
	}
	public void view()
	{
		System.out.println("SI.No \t Book ID \t Book Name \t Cost");
		book[0]="Ponniyin Selvan";
		id[0]=1;
		id[1]=2;
		book[1]="IronMan";
		cost[0]=250;
		cost[1]=200;
		byte s=0;
		for(int i=0;i<book.length;i++)
		{
			
			if(book[i]!=null&& id[i]!=0&&cost[i]!=0)
			{
				s++;
			System.out.println(s+".     \t"+id[i]+"     \t     "+book[i]+"         \t    "+cost[i]);
			}
		}
		content();
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
					content();	
			}
			break;
		}
	}
	public void  deleteBook()
	{
		System.out.println("Enter a Book ID to delete a book from a counter");
		 byte id1=sc2.nextByte();
		 for(int i=0;i<book.length;i++)
		 {
			 if(id[i]==id1)
			 {
				 book[i]=null;
				 id[i]=0;
			 }
		 }
		 content();
	}
}




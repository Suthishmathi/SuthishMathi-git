import java.util.Scanner;

public class LoginForm 
   {
	public static void main(String[] args)
     {
		Scanner sc=new Scanner(System.in);
		System.out.println("Hai!! Good morning ....\n1.Admin\n2.Employee\nclick 1 or 2 ");
		
		byte input=sc.nextByte();
		SignUp su=new SignUp();
		
			switch(input)
		        {
			   case 1:
				System.out.println("1.Signup\n2.signin");
				int get=sc.nextInt();
				switch(get)
				{
					case 1:
					        su.signup1();
					break;
					case 2:
						System.out.println("Case 2.....");
						break;
			 		 default:
						System.out.println("Enter a correct number!!!!!");
					        break;
				}
				break;
			    case 2:
				  System.out.println("1.Signup\n2.Signin");
				int get1=sc.nextInt();
				switch(get1)
				{
					case 1:
					        su.signup1();
					break;
					case 2:
						System.out.println("Case 2.....");
						break;
			 		 default:
						System.out.println("Enter a correct number!!!!!");
					        break;
				}
				break;
			}
		
    } 
  }
class SignUp extends LoginForm
   	{

	public void signup1() 
     {
		SignIn si=new SignIn();
		Scanner sc1=new Scanner(System.in);
			System.out.println("Enter a user name:");
				String name=sc1.nextLine();
			System.out.println("Enter a password");
				String pwd=sc1.nextLine();
			System.out.println("Username and password are saved succesfully!!!!");
			si.signin1(name,pwd);
		//String[] arr  = new String[50];
		//arr[0]=sc.next();
		//System.out.println("in signup");
    }

}
class SignIn extends SignUp
{
   public void signin1(String uname,String upwd)
	{
		System.out.println("Your now in Signin page:" );
	   Scanner sc2=new Scanner(System.in);
		System.out.println("Enter a User name:");
			String name1=sc2.next();
		System.out.println("Enter a user password:");
			String pwd1=sc2.next();
		if(name1.equals(uname) && pwd1.equals(upwd))
		    System.out.println("Login Succesfullyyyy!!!!");
		else 
		    System.out.println("Entered username or password mismatched!!!!");
	}

}

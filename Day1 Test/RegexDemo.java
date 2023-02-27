import java.util.regex.*;
class RegexDemo
{
	public static void main(String[] args)
	{
		System.out.println(validate("Zoho123"));
	}
	public static boolean validate(String password){
		String regex="^(?=.*[0-9])"+"(?=.*[a-z])(?=.*[A-Z])"+"(?=.*[@#$%^&*++-])"+"(?=\\S+$).{8,20}$";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(password);
		System.out.println();
		return m.matches();
	}
}

import java.io.File;

class FileDemo
{
	public static void main(String []args)throws Exception
	{
		File f=new File("C:\\Users\\Administrator\\FileCreation\\file\\file.txt");
		System.out.println(f.exists());
		f.delete();
		if(f.exists()==false)
			f.createNewFile();
		System.out.println(f.exists());
	}
	
}
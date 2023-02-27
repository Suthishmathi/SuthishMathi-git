import java.util.Scanner;
class AnagramWord
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int size = sc.nextInt();
		
		String word[] = new String[size];
		
		for(int i=0;i<size;i++)
			word[i] = sc.next();
		for(int i=0;i<word.length;i++)
		{
			int index = 0;
			System.out.print(word[i]+"  "); 
			boolean check = false;
			for(int j=0;j<word.length;j++)
			{
				if(i!=j)
				{
				char firstArray[] = word[i].toCharArray();
				char secondArray[] =  word[j].toCharArray();
				int count = 0;
				
				if(firstArray.length == secondArray.length)
				{
					for(int k = 0;k<firstArray.length;k++)
					{
						for(int m=0;m<secondArray.length;m++)
						{
							if(firstArray[k] == secondArray[m])
							{
								secondArray[m] = ' ';
								count++;
								check = true;
							}
						}
					}
				}
				if(count == firstArray.length && check)
				{
					System.out.print(word[j]+"  "); 
					word[j] = " ";
				}
				}
			}
			word[i] = " ";
			if(check)
				System.out.println();
		}
	}
}
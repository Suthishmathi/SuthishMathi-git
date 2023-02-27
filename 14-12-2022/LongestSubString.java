import java.util.*;
class LongestSubString
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size :");
		int n=scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>(n);
		for(int i=0;i<n;i++)
		{
			list.add(i+1);
		}
		
		find(list);	
	}
	public static void find(ArrayList<Integer> list)
	{
		if(list.size()==1)
		{
			System.out.println(list);
			return;
		}
        for(int i=0;i<list.size();i+=1)
		{
			list.remove(i);
		}
		Collections.reverse(list);
		find(list);
	}
}
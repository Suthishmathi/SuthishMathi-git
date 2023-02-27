import java.util.*;
public class FrequencySort{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array Size :");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Array Elements :");
		for(int i=0;i<n;i++)
			arr[i]= scan.nextInt();
		
		freqSort(arr);
	}
	public static void freqSort(int arr[]) {
		int n = arr.length;
		int min=arr[0],max=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		int temp[] = new int[max-min+1];
		for(int i=0;i<temp.length;i++) {
			temp[arr[i]-min]++;
		}
		System.out.println(Arrays.toString(temp));
		int index=0;
		for(int i=0;i<temp.length;i++) {
			while(temp[i]>0) {
				arr[index++]=i+min;
				temp[i]--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
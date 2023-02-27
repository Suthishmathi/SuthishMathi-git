import java.util.*;
public class Snail{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int row = scan.nextInt();
		System.out.println("Enter the number of columns :");
		int col= scan.nextInt();
		
		int arr[][]=new int[row][col];
		System.out.println("Enter the Array Elements :");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		print1(arr);
		
	}
	public static void print1(int arr[][]) {
		int colstart=0;
		int colend=arr[0].length;
		int rowstart=0;
		int rowend=arr.length;
		
		while(rowstart<rowend && colstart<colend) {
			
			for(int i=colstart;i<colend;i++) {
				System.out.print(arr[rowstart][i]+" ");
			}
			rowstart++;
			
			for(int i=rowstart;i<rowend;i++) {
				System.out.print(arr[i][colend-1]+" ");
			}
			colend--;
			
			for(int i=colend-1;i>=colstart;i--) {
				System.out.print(arr[rowend-1][i]+" ");
			}
			rowend--;
			
			for(int i=rowend-1;i>=rowstart;i--) {
				System.out.print(arr[i][colstart]+" ");
			}
			colstart++;		
		}
	}
}
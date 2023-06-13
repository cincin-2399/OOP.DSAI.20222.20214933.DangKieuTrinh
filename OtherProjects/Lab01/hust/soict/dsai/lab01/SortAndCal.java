package hust.soict.dsai.lab01;
import java.util.Scanner;
public class SortAndCal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please input the size of the list: ");
		int size = sc.nextInt();
		int[] arr=new int[size];
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		//sort the array
		for (int i=0;i<size;i++) {
			int min=i;
			for (int j=i+1;j<size;j++) {
				if (arr[i]>arr[j]) {
					min=j;
				}
			int tmp = arr[min];
			arr[min]=arr[i];
			arr[i]=tmp;
			}
		}
		
		//print out the array has sorted
		int sum=0;
		for (int i=0;i<size;i++) {
			sum+=arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		// calculate the sum of the array
		System.out.println("The sum of the array: "+ sum);
		System.out.println("The average of the array: "+ (sum/size));

	}

}

import java.util.Scanner;
public class NStarTriangle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of stars: ");
		int n=sc.nextInt();
		for (int i=0;i<n;i++) {
			for (int s=0;s<n-i;s++) {
				System.out.print(" ");}
			for (int st=0;st<2*i+1;st++) {
				System.out.print("*");}
			System.out.println();
		}
			
		}
	}
   

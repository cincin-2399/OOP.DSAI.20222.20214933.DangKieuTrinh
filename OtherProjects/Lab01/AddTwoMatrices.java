import java.util.Scanner;
public class AddTwoMatrices {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		// Enter number of rows
		System.out.println("Please enter the number of rows in the matrix: ");
		int row= input.nextInt();
		
		// Enter number of columns
		System.out.println("Please enter the number of columns in the matrix: ");
		int col= input.nextInt();
		
		int[][] matrix1 = new int[row][col];
		int[][] matrix2 = new int[row][col];
		int[][] result = new int[row][col];
		
		//enter the elements for the first matrix
	    System.out.println("Please enter the elements for the first matrix: ");
		for (int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				matrix1[i][j]=input.nextInt();
			}
		}
		
		//enter the elements for the second matrix
	    System.out.println("Please enter the elements for the second matrix: ");
		for (int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				matrix1[i][j]=input.nextInt();
			}
		}
		
		//compute the result matrix
		for (int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				result[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		
		//print out the result:
		System.out.println("Adding the two matrices we got: ");
		for (int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

}

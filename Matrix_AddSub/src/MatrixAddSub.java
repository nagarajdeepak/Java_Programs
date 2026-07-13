import java.util.Scanner;
public class MatrixAddSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[][] A = new int[3][3];
		int[][] B = new int[3][3];
		int[][] sum = new int[3][3];
		int[][] diff = new int[3][3];
		
		System.out.println("Enter elements of Matrix A:");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter elements of Matrix B:");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0;j<3; j++) {
				sum[i][j] = A[i][j] + B[i][j];
				diff[i][j] = A[i][j] - B[i][j];
			}
		}
		
		System.out.println("\nMatrix Addition:");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("\nMatrix Subtraction:");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(diff[i][j]+"\t");
			}
			System.out.println();
		}
		sc.close();
	}

}
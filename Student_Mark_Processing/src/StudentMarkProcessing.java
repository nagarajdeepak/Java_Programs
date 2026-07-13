import java.util.Scanner;
public class StudentMarkProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number Of Students: ");
		int n = sc.nextInt();
		
		int[][] marks = new int[n][3];
		String[] name = new String[n];
		int[] total = new int[n];
		double[] average = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("\nEnter Student Name: ");
			name[i] = sc.next();
			
			System.out.println("Enter The Marks For 3 Subjects:");
			for(int j=0; j<3; j++) {
				System.out.println("Subject "+(j+1)+": ");
				marks[i][j] = sc.nextInt();
				total[i] += marks[i][j];
			}
			average[i] = total[i]/3.0;
		}
		
		System.out.println("\nStudent Result");
		System.out.println("--------------------------------------");
		System.out.printf("%-10s %-5s %-5s %-5s %-7s %-8s %-6s\n",
                "Name", "S1", "S2", "S3", "Total", "Average", "Grade");
		
		int highest = total[0];
		
		for(int i=0; i<n; i++) {
			if(total[i]>highest)
				highest = total[i];
			
			String grade;
			
			if(average[i] >= 90)
				grade = "A+";
			else if(average[i] >= 80)
				grade = "A";
			else if(average[i] >= 70)
				grade = "B";
			else if(average[i] >= 60)
				grade = "C";
			else if(average[i] >= 50)
				grade = "D+";
			else
				grade = "F";
			
			System.out.printf("%-10s %-5d %-5d %-5d %-7d %-8.2f %-6s\n",
                    name[i], marks[i][0], marks[i][1], marks[i][2],
                    total[i], average[i], grade);
		}
		System.out.println("\n Toppers:");
		for(int i=0; i<n; i++) {
			if(total[i] == highest) {
				System.out.println(name[i]+"- Total marks: "+total[i]);
			}
		}
		sc.close();
	}
}

import java.util.Scanner;
public class TemperatureReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number Of Persons: ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		double[][] temp = new double[n][3];
		double[] avg = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("\nEnter Name: ");
			name[i] = sc.next();
			
			System.out.println("Enter 3 temperature readings (°C)");
			for(int j=0; j<3; j++) {
				System.out.println("Reading "+(j+1)+": ");
				temp[i][j] = sc.nextDouble();
				avg[i] = temp[i][j];
			}
			avg[i] = avg[i]/3;
		}
		System.out.println("\nTemperature Report");
		System.out.println("--------------------------------------");
		System.out.printf("%-10s %-8s %-8s %-8s %-10s %-15s\n",
                "Name", "T1", "T2", "T3", "Average", "Status");
		
		for(int i=0; i<n; i++) {
			String status;
			
			if(avg[i]>37.5)
				status = "Fever";
			else if(avg[i]<36.0)
				status = "Low Temp";
			else
				status = "Normal";
			
			 System.out.printf("%-10s %-8.1f %-8.1f %-8.1f %-10.2f %-15s\n",
	                    name[i], temp[i][0], temp[i][1], temp[i][2], avg[i], status);
		}
		sc.close();
	}
}
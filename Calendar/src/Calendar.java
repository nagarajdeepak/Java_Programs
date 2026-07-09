import java.util.Scanner;
public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Year: ");
		int year = sc.nextInt();
		
		int days;
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 !=0)){
			System.out.println(year+" Is a leap year");
			days =366;
		} else {
			System.out.println(year+" Is not a leap year");
			days =365;
		}
		
		int months =12;
		int weeks = days / 7 ;
		int remainingDays =  days % 7;
		
		System.out.println("Total Months: "+months);
		System.out.println("Total Days: "+days);
		System.out.println("Total Weeks: "+weeks);
		System.out.println("Remaining Days: "+remainingDays);

	}
}
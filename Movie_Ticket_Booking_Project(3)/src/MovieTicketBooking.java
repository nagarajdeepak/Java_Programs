import java.util.Scanner;
public class MovieTicketBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Theatre theatre = new Theatre(9, 10);
		int choice;
		
		do {
			System.out.println("\n===== Movie Ticket Booking System =====");
			System.out.println("1.Show Available Seats");
			System.out.println("2.Book Singal Ticket");
			System.out.println("3.Book Multiple Tickets");
			System.out.println("4.Cancel Ticket");
			System.out.println("5.Exit");
			System.out.println("Enter Choice: ");
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				theatre.showSeats();
				break;
			case 2:
				System.out.println("Enter Row: ");
				int row = sc.nextInt();
				
				System.out.println("Enter Seat Number: ");
				int col = sc.nextInt();
				
				theatre.bookSeat(row, col);
				break;
			case 3:
				  System.out.print("How many seats do you want to book? ");
				    int n = sc.nextInt();

				    int[] rows = new int[n];
				    int[] cols = new int[n];

				    for (int i = 0; i < n; i++) {

				        System.out.println("Seat " + (i + 1));

				        System.out.print("Enter Row: ");
				        rows[i] = sc.nextInt();

				        System.out.print("Enter Seat Number: ");
				        cols[i] = sc.nextInt();
				    }

				    theatre.bookMultipleSeats(rows, cols);
				    break;
			case 4:
				System.out.println("Enter Row: ");
				row = sc.nextInt();
				
				System.out.println("Enter Seat Number: ");
				col = sc.nextInt();
				
				theatre.cancelSeat(row, col);
				break;
			case 5:
				System.out.println("Thank You");
				break;
				default:
					System.out.println("Invalid choice");
			}
		} while(choice != 5);
		sc.close();
	}
}
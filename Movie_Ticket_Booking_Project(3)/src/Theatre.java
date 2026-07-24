public class Theatre {

	private boolean[][] seats;

    // ANSI Color Codes
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";

    public Theatre(int rows, int cols) {
        seats = new boolean[rows][cols];
    }

    // Display Seats
    public void showSeats() {

        System.out.println("\n========= SCREEN =========");
        System.out.println("🟩💺 = Available    🟥💺 = Booked\n");

        for (int i = 0; i < seats.length; i++) {

            System.out.print("Row " + (i + 1) + " : ");

            for (int j = 0; j < seats[i].length; j++) {

                if (seats[i][j]) {
                    System.out.print(RED + "💺 " + RESET);
                } else {
                    System.out.print(GREEN + "💺 " + RESET);
                }
            }

            System.out.println();
        }

        System.out.println("        ==========================");
    }

    // Book Ticket
    public void bookSeat(int row, int col) {

        if (row < 1 || row > seats.length || col < 1 || col > seats[0].length) {
            System.out.println("Invalid Seat Number!");
            return;
        }

        if (!seats[row - 1][col - 1]) {
            seats[row - 1][col - 1] = true;
            System.out.println("✅ Ticket Booked Successfully!");
        } else {
            System.out.println("❌ Seat Already Booked!");
        }
    }

    // Cancel Ticket
    public void cancelSeat(int row, int col) {

        if (row < 1 || row > seats.length || col < 1 || col > seats[0].length) {
            System.out.println("Invalid Seat Number!");
            return;
        }

        if (seats[row - 1][col - 1]) {
            seats[row - 1][col - 1] = false;
            System.out.println("✅ Ticket Cancelled Successfully!");
        } else {
            System.out.println("⚠ Seat is Already Available!");
        }
    }
    
    public void bookMultipleSeats(int[] rows, int[] cols) {

        if (rows.length != cols.length) {
            System.out.println("Invalid Input!");
            return;
        }

        // Validate all seats first
        for (int i = 0; i < rows.length; i++) {

            if (rows[i] < 1 || rows[i] > seats.length ||
                cols[i] < 1 || cols[i] > seats[0].length) {

                System.out.println("Invalid seat: Row " + rows[i] +
                                   " Seat " + cols[i]);
                return;
            }

            if (seats[rows[i] - 1][cols[i] - 1]) {
                System.out.println("Seat Row " + rows[i] +
                                   " Seat " + cols[i] +
                                   " is already booked.");
                return;
            }
        }

        // Book all seats
        for (int i = 0; i < rows.length; i++) {
            seats[rows[i] - 1][cols[i] - 1] = true;
        }

        System.out.println("✅ " + rows.length + " tickets booked successfully!");
    }
}
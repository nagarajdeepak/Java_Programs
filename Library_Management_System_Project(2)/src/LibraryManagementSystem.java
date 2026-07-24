import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LibraryManagementSystem {
	static Scanner sc = new Scanner(System.in);
	
	static class Book{
		int bookId;
		String title;
		String author;
		boolean issued;
		
		Book(int bookId, String title, String author){
			this.bookId = bookId;
			this.title = title;
			this.author = author;
			this.issued = false;
		}
	}
	
	static class Student{
		String studentName;
		String studentId;
		Book book;
		LocalDate issueDate;
		
		Student(String studentName, String studentId, Book book){
			this.studentName = studentName;
			this.studentId = studentId;
			this.book = book;
			this.issueDate = LocalDate.now();
		}
	}
	
	static ArrayList<Book> books = new ArrayList<>();
	static HashMap<String, Student> issuedBooks = new HashMap<>();
	
	public static void main(String[] args) {
		int choice;
		
		do {
			System.out.println("\n===== Library Management System =====");
			System.out.println("1.Add Book");
			System.out.println("2.Issue Book");
			System.out.println("3.Return Book");
			System.out.println("4.Search Book");
			System.out.println("5.Display Books");
			System.out.println("6.Exit");
			System.out.print("Enter Choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
				case 1:
					addBook();
					break;
				case 2:
					issueBook();
					break;
				case 3:
					returnBook();
					break;
				case 4:
					searchBook();
					break;
				case 5:
					displayBooks();
					break;
				case 6:
					System.out.println("Thank You");
					break;
					default :
						System.out.println("Invalid Choice");
			}
		} while (choice != 6);
	}
	
	static void addBook() {
		System.out.print("Enter Book ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		for(Book b : books){
		    if(b.bookId == id){
		        System.out.println("Book ID already exists.");
		        return;
		    }
		}
		
		System.out.print("Enter Book Name: ");
		String title = sc.nextLine();
		
		System.out.print("Enter Author Name: ");
		String author = sc.nextLine();
		
		books.add(new Book(id, title, author));
		
		System.out.println("Book Added SuccessFully");
	}
	
	static void issueBook() {
		System.out.print("Enter Student Name: ");
		String studentName = sc.nextLine();
		
		System.out.print("Enter Student ID: ");
		String studentId = sc.nextLine();
		
		System.out.print("Enter Book Name: ");
		String bookName = sc.nextLine();
		
		for(Book b : books) {
			if (b.title.equalsIgnoreCase(bookName)) {
				if(!b.issued) {
					b.issued = true;
					if(issuedBooks.containsKey(studentId)){
					    System.out.println("Student already has an issued book.");
					    return;
					}
					Student s = new Student(studentName, studentId, b);
					issuedBooks.put(studentId, s);
					
					System.out.println("\nBook Issued Successfully");
					System.out.println("Student Name: "+studentName);
					System.out.println("Student ID: "+studentId);
					System.out.println("Book Name: "+b.title);
					System.out.println("Issue Date :"+s.issueDate);
				} else {
					System.out.println("Book is already issued");
				}
				return;
			}
		}
		System.out.println("Book not found");
	}
	
	static void returnBook() {
		System.out.print("Enter Student ID: ");
		String studentId = sc.nextLine();
		
		if(issuedBooks.containsKey(studentId)) {
			Student s = issuedBooks.get(studentId);
			LocalDate returnDate = LocalDate.now();
			long days = ChronoUnit.DAYS.between(s.issueDate, returnDate);
			
			double fine = 0;
			
			if(days > 7) {
				fine = (days - 7)*5;
			}
			
			s.book.issued = false;
			
			issuedBooks.remove(studentId);
			
			System.out.println("\nBook Returned Successfully");
			System.out.println("Student Name: "+ s.studentName);
			System.out.println("Book Name: "+ s.book.title);
			System.out.println("Days Issued: "+days);
			System.out.println("Fine: Rs"+fine);
		} else {
			System.out.println("No record found for this student ID");
		}
	}
	
	static void searchBook() {
		System.out.print("Enter Book Name: ");
		String name = sc.nextLine();
		
		for(Book b : books) {
			if(b.title.equalsIgnoreCase(name)) {
				System.out.println("\nBook Found");
				System.out.println("BooK ID: " + b.bookId);
				System.out.println("Title: "+b.title);
				System.out.println("Author: "+b.author);
				
				if(b.issued)
					System.out.println("Status : Issued");
				else
					System.out.println("Status : Available");
				return;
			}
		}
		System.out.println("Book Not Found");
	}
	
	static void displayBooks() {
		if(books.isEmpty()) {
			System.out.println("No Books Available");
			return;
		}
		
		System.out.println("\n----- Book List -----");
		
		for(Book b : books) {
			System.out.println("----------");
			System.out.println("Book ID: " +b.bookId);
			System.out.println("Title: "+b.title);
			System.out.println("Author: "+b.author);
			
			if(b.issued)
				System.out.println("Status : Issued");
			else
				System.out.println("Status : Available");
		}
	}
}

/*
 * War and Peace
 * 
 * Leo Tolstoy
 * 
 * Ulysses
 * 
 * James Joyce
 * 
 * Utopia
 * 
 * Sir Thomas Moor
 * 
 * Waste Land
 * 
 * T.S Eliot
 * 
 * Treasure Island
 * 
 * R.L. Stevenson
 */
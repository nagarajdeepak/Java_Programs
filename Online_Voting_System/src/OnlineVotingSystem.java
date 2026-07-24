import java.util.*;
public class OnlineVotingSystem {
	static Scanner sc =new Scanner(System.in);
	
	static HashMap<String, Student> students = new HashMap<>();
	static HashMap<String, Boolean> voted = new HashMap<>();
	static HashMap<String, Integer> candidateVotes = new HashMap<>();
	static HashMap<String, String> voteHistory = new HashMap<>();
	
	public static void main(String[] args) {
		
		
		candidateVotes.put("Narendra Damodardas Modi(BJP)", 0);
		candidateVotes.put("Rahul Rajiv Gandhi (Congress)", 0);
		
		while(true) {
			System.out.println("\n-----Online Voting System-----");
			System.out.println("1.Register");
			System.out.println("2.Login & Vote");
			System.out.println("3.Display Result");
			System.out.println("4.Registered Studnets");
			System.out.println("5.Vote History");
			System.out.println("6.Exit");
			System.out.print("Enter Choice: ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
				case 1:
					register();
					break;
				case 2:
					login();
					break;
				case 3:
					displayResult();
					break;
				case 4:
					totalRegisteredStudents();
					break;
				case 5:
					displayVoteHistory();
					break;
				case 6:
					System.out.println("Thank you");
					System.exit(0);
			}
		}
	}
	
	static void register() {
		String username;

		while (true) {
		    System.out.print("Enter UserName: ");
		    username = sc.nextLine();

		    if (!username.matches("[A-Za-z]+")) {
		        System.out.println("Invalid username! Username should contain only alphabets.");
		        continue;
		    }
		    if (students.containsKey(username)) {
		        System.out.println("Username already exists. Try another username.");
		        continue;
		    }
		    break;
		}
		
		String password;
		while (true) {
	        System.out.print("Enter Password (6 digits): ");
	        password = sc.nextLine();

	        if (password.matches("\\d{6}")) {
	            break;
	        } else {
	            System.out.println("Invalid password! Password must contain exactly 6 digits.");
	        }
		}
		System.out.print("Enter Student Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Branch: ");
		String branch = sc.nextLine();
		
		System.out.print("Enter Joining Year: ");
		int year = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter ID Card Number: ");
		String studnetId = sc.nextLine();
		
		Student student = new Student(username, password, name, branch, year, studnetId);
		
		students.put(username, student);
		voted.put(username, false);
		System.out.println("\nRegistration Successful");
	}
	
	static void login() {
		System.out.print("Enter UserName: ");
		String username = sc.nextLine();
		
		System.out.print("Enter Password: ");
		String password = sc.nextLine();
		
		if(!students.containsKey(username)) {
			System.out.println("User Not Found");
			return;
		}
		
		Student student = students.get(username);
		
		if(!student.getPassword().equals(password)) {
			System.out.println("Wrong Password");
			return;
		}
		
		System.out.println("\n-----Studnet ID card-----");
		System.out.println("Student ID: "+student.getStudentId());
		System.out.println("Studnet Name: "+student.getStudnetName());
		System.out.println("Branch: "+student.getBranch());
		System.out.println("Joining Year: "+student.getJoiningYear());
		
		if(voted.get(username)) {
			System.out.println("\nYou have already voted");
			return;
		}
		castVote(username);	
	}

	static void castVote(String username) {
		try {
			ArrayList<String> list = new ArrayList<>(candidateVotes.keySet());
			System.out.println("\nCandidate List");
			
			for(int i=0; i<list.size(); i++) {
				System.out.println((i+1)+ ". "+list.get(i));
			}
			System.out.println("Select Candidate: ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			if(choice<1 || choice>list.size()) {
				throw new Exception("Invalid Candidate Selected");
			}
			
			String candidate = list.get(choice-1);
			
			candidateVotes.put(candidate, candidateVotes.get(candidate)+1);
			voted.put(username, true);
			
			Student s =students.get(username);
			voteHistory.put(s.getStudnetName(), candidate);
			System.out.println("Vote Submitted Successfully");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void displayResult() {
		System.out.println("\n-----Election Result-----");
		
		String winner ="";
		int max = -1;
		
		for(Map.Entry<String, Integer>entry : candidateVotes.entrySet()) {
			System.out.println(entry.getKey()+ " : "+entry.getValue());
			
			if(entry.getValue() > max) {
				max = entry.getValue();
				winner = entry.getKey();
			}
		}
		
		System.out.println("\nFinalist/Winner: "+winner);
		System.out.println("Total Votes: "+max);
	}
	
	static void totalRegisteredStudents() {
		System.out.println("\n------ Registered Students ------");
		System.out.println("Total Registered Studnets: "+students.size());
		
		int votedCount = 0;
		
		for(Boolean status : voted.values()) {
			if(status)
				votedCount++;
		}
		System.out.println("Students Voted : "+votedCount);
		System.out.println("Studnets Not Voted : "+(students.size()-votedCount));
	}
	
	static void displayVoteHistory() {
		System.out.println("\n-----> Vote History <-----");
		
		if(voteHistory.isEmpty()) {
			System.out.println("No voted have cast yet");
			return;
		}
		
		for(Map.Entry<String, String> entry : voteHistory.entrySet()) {
			System.out.println("Student : "+entry.getKey()+"---> Candidate : "+entry.getValue());
		}
	}
}
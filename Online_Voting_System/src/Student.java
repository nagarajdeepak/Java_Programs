
public class Student {
	private String username;
	private String password;
	private String studentName;
	private String branch;
	private int joiningYear;
	private String studentId;
	
	public Student(String username, String password, String studentName, String branch, int joiningYear, String studentId) {
		this.username = username;
		this.password = password;
		this.studentName = studentName;
		this.branch = branch;
		this.joiningYear = joiningYear;
		this.studentId = studentId;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getStudnetName() {
		return studentName;
	}
	
	public String getBranch() {
		return branch;
	}
	
	public int getJoiningYear() {
		return joiningYear;
	}
	
	public String getStudentId() {
		return studentId;
		
	}
}
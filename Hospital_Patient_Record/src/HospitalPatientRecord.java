import java.util.Scanner;

class Patient{
	
	private int patientId;
	private String patientName;
	private String disease;
	private double billAmount;
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
}
public class HospitalPatientRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Patient p = new Patient();
		
		System.out.println("Enter Patient ID: ");
		p.setPatientId(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Enter Patient Name: ");
		p.setPatientName(sc.nextLine());
		
		System.out.println("Enter Disease: ");
		p.setDisease(sc.nextLine());
		
		System.out.println("Enter Bill Amount: ");
		p.setBillAmount(sc.nextDouble());
		
		System.out.println("\n---------------- Patient Record-------------");
		System.out.println("Patient ID: "+p.getPatientId());
		System.out.println("Patient Name: "+p.getPatientName());
		System.out.println("Patient Disease: "+p.getDisease());
		System.out.println("Patient Bill Amount: "+p.getBillAmount());
		
		sc.close();
	}
}
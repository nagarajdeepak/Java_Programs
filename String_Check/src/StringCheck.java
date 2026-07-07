import java.util.Scanner;
public class StringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String str =sc.nextLine();
		
		if(str.isEmpty()){
			System.out.println("String is Empty");
		} else {
			System.out.println("String is not Empty");
			System.out.println("String length: "+str.length());
		}
		sc.close();
	}

}

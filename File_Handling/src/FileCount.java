import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "Student.txt";
		
		int vowels = 0;
		int digits = 0;
		int specialchars = 0;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			
			int ch;
			
			while((ch = br.read())!= -1) {
				char c = (char)ch;
				
				if("AEIOUaeiou".indexOf(c)!= -1) {
					vowels++;
				}
				
				else if(Character.isDigit(c)) {
					digits++;
				}
				
				else if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
					specialchars++;
				}
			}
			br.close();
			
			System.out.println("number of vowels: "+vowels);
			System.out.println("number of digits: "+digits);
			System.out.println("number of special characters: "+specialchars);
		} catch(IOException e) {
			System.out.println("Error reading the file");
		}
	}

}

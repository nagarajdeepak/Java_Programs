import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Orange");
		
		System.out.println("After add(): "+fruits);
		
		//add(index, elements)
		fruits.add(2, "Grapes");
		System.out.println("After add(index, element): "+fruits);
		
		//get()
		System.out.println("Elements at Index 1: "+fruits.get(1));
		
		//contains()
		System.out.println("Contains ");
	}
}
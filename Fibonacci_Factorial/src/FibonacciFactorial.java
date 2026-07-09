import java.util.Scanner;
public class FibonacciFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to find factorial: ");
		int num = sc.nextInt();
		
		int fact = 1;
	    int i = 1;
	    
	    do {
	    	fact = fact * i;
	    	i++;
	    } while (i <= num);
	    System.out.println("Factorial of "+num+"="+fact);
	    
	    //fibonacci series
	    System.out.println("\nEnter the number of terms for Fibonacci series: ");
	    int n = sc.nextInt();
	    
	    int first = 0, second = 1, count = 1;
	    
	    System.out.println("Fibonacci Series:");
	    
	    if(n>=1) {
	    	do {
	    		System.out.println(first+" ");
	    		
	    		int next = first+second;
	    		first = second;
	    		second = next;
	    		
	    		count++;
	    	} while (count<=n);	    
	    }
	    sc.close();
	}
}
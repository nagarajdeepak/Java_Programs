interface Addition{
	int add(int a, int b);
}
public class LambdaExpression {
	public static void main(String args[]) {
		
	Addition obj = (a,b)->a+b;
	
	System.out.println("Sum = "+obj.add(10, 30));
	}
}
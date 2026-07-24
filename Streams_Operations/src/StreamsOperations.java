import java.util.*;
import java.util.stream.Collectors;
public class StreamsOperations {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10,20,30,40,50,5,15);
		
		//stream() + filter()
		System.out.println("Even Numbers: ");
		numbers.stream().filter(n->n%2==0).forEach(System.out::println);
		
		//map()
		System.out.println("\n Squares of Numbers: ");
		numbers.stream().map(n->n*n).forEach(System.out::println);
		
		//sorted()
		System.out.println("\nSorted Number: ");
		numbers.stream().sorted().forEach(System.out::println);
		
		//distinct()
		System.out.println("\nDistinct Number: ");
		numbers.stream().distinct().forEach(System.out::println);
		
		//count()
		long count = numbers.stream().count();
		System.out.println("\nTotal Elements: "+count);
		
		//collect()
		List<Integer> evenList = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println("\nCollectede Evern Number: "+evenList);
		
		//max()
		int max = numbers.stream().max(Integer::compare).get();
		System.out.println("\nMaximum Number: "+max);
		
		//min()
		int min = numbers.stream().min(Integer::compare).get();
		System.out.println("Minimum Number: "+min);
		
		//reduce() -sum
		int sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println("Sum of Number: "+sum);
		}

}

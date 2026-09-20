package seleniumBasics;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class practiceTest {
	
	@BeforeEach
	void printStar() {
		System.out.println("***************************");
	}

	@Test
	void java() {
		List<Integer> list = List.of(3, 8, 15, 22, 7, 41, 12);
		System.out.println("Test 0 - Even numbers in Given Integer List: ");
		list.stream().filter(n -> (n % 2 == 0)).collect(Collectors.toList()).forEach(n -> System.out.println(n));
	}

	@Test
	void java1() {
		List<String> list = List.of("rahul", "akash", "ramesh", "ravi");
		System.out.println("Test 1 - String List to UpperCase: ");
		list.stream().map(n -> n.toUpperCase()).collect(Collectors.toList()).forEach(n -> System.out.println(n));
	}

	@Test
	void java2() {
		List<Integer> list = List.of(3, 8, 15, 22, 7, 41, 12);
		System.out.println("Test 2 - Numbers greater than 10: ");
		list.stream().filter(n -> n > 10).forEach(n -> System.out.println(n));
	}

	@Test
	void java3() {
		System.out.println("Test 3 - Filtering values greater than 4 : ");
		List<String> list = List.of("java", "sql", "junit", "postman", "swing");
		list.stream().filter(n -> n.length() > 4).forEach(n -> System.out.println(n));
	}

	@Test
	void java4() {
		System.out.println("Test 4 - Converting every name to titlecase: ");
		List<String> list = List.of("rahul", "akash", "ramesh", "ravi");
		list.stream().map(n -> n.substring(0, 1).toUpperCase() + n.substring(1).toLowerCase())
				.forEach(n -> System.out.println(n));
	}
	
	@Test
	void java5() {
		System.out.println("Test 5 - Sorting an Integer List");
		List<Integer> list = List.of(9, 2, 7, 4, 1);
		List<Integer> finalList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		finalList.stream().forEach(System.out :: println);
	}
	
	@Test
	void java6() {
		System.out.println("Test 6 - Sort by String length");
		List<String> list = List.of("Charlie", "Alice", "Bob");
		String output = list.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.joining(", "));
		System.out.println(output);
	}
}

package seleniumBasics;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class practiceTest {
	
	@BeforeAll
	static void printStarBefore() {
		System.out.println("*********************************************************");
	}
	
	@AfterEach
	void printStarAfter() {
		System.out.println("*********************************************************");
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
	
	@Test
	void java7() {
		System.out.println("Test 7 - Multiply numbers using reduce() ");
		List<Integer> list = List.of(1, 2, 3, 4, 5);
		Optional<Integer> multiplynum = list.stream().reduce((a,b) -> a*b);
		if(multiplynum.isPresent()){
			System.out.println(multiplynum);
		}
		else {
			System.out.println("Values are not present");
		}
	}
	
	@Test
	void java8() {
		System.out.println("Test 8 - Finding the max integer using reduce() function");
		List<Integer> list = List.of(4, 9, 2, 17, 5);
		Optional<Integer> max = list.stream().reduce(Integer::max);
		if(max.isPresent()){
			System.out.println(max);
		}
		else {
			System.out.println("Values are not present");
		}
	}
	
	@Test
	void java9() {
		List<String> words = List.of("tiger", "ant", "tea", "lion", "tomato", "apple", "bee", "avocado");
		System.out.println("Test 9 - groupingBy first letter");
		Map<Character,List<String>> firstword = words.stream().collect(Collectors.groupingBy(n->n.charAt(0),Collectors.toList()));
		System.out.println(firstword);
	}
	
	@Test
	void java10() {
		List<String> words = List.of("tiger", "ant", "tea", "lion", "tomato", "apple", "bee", "avocado");
		System.out.println("Test 10 - groupingBy length and count");
		Map<Integer,Long> Answer = words.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));
		System.out.println(Answer);
	}
	
	@Test
	void java11() {
		List<String> words = List.of("tiger", "ant", "tea", "lion", "tomato", "apple", "bee", "avocado");
		System.out.println("Test 11 - Group the words by first letter, but show only the length of each word ");
		Map<Character,List<Integer>> answer = words.stream().collect(Collectors.groupingBy(c->c.charAt(0),Collectors.mapping(n->n.length(), Collectors.toList())));
		System.out.println(answer);
	}
	
	@Test
	void java12() {
		List<String> words = List.of("tiger", "ant", "tea", "lion", "tomato", "apple", "bee", "avocado");
		System.out.println("Test 12 - Group the words by first letter, but show only the words in uppercase ");
		Map<Character,List<String>>answer = words.stream().collect(Collectors.groupingBy(c->c.charAt(0),Collectors.mapping(String::toUpperCase, Collectors.toList())));
		System.out.println(answer);		
	}
	
	@Test
	void java13() {
		List<Employee> emps = List.of(
			    new Employee("Arun",  "Dev",  60000),
			    new Employee("Bala",  "QA",   45000),
			    new Employee("Chitra","Dev",  75000),
			    new Employee("Divya", "HR",   40000),
			    new Employee("Eswar", "QA",   52000),
			    new Employee("Farah", "Dev",  68000)
			);
		System.out.println("Test 13 - Group employees by department");
		//I have added toString() method in Employee.java to convert the object into string
		Map<String, List<Employee>> answer = emps.stream().collect(Collectors.groupingBy(Employee::getDept));
		System.out.println(answer);	
	}
}

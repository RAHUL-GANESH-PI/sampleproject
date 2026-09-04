package seleniumBasics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class streamsTest {

	ArrayList<String> list = new ArrayList<>();

	@BeforeEach
	void setup() {
		list.add("Ram");
		list.add("Swetha");
		list.add("Dheena");
		list.add("Ravi");
	}

	@Test
	void filterbyLetterR() {
		assertTrue(Stream.of("Ram", "Ravi").collect(Collectors.toList())
				.equals(list.stream().filter(s -> s.startsWith("R")).collect(Collectors.toList())));
	}

	@Test
	void sortList() {
		assertTrue(Stream.of("Dheena", "Ram", "Ravi", "Swetha").collect(Collectors.toList())
				.equals(list.stream().sorted().collect(Collectors.toList())));
	}

	@Test
	void uppercaseList() {
		assertTrue(Stream.of("RAM", "SWETHA", "DHEENA", "RAVI").collect(Collectors.toList())
				.equals(list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList())));
	}
	
	@Test
	void countList() {
		assertEquals(4,list.stream().count());
	}
	
	@Test
	void findName() {
		assertTrue(list.stream().anyMatch(s->s.equalsIgnoreCase("Dheena")));
	}
	
	@Test
	void AllNameMatch() {
		assertEquals(true, list.stream().sorted().collect(Collectors.toList()).equals(list.stream().sorted().collect(Collectors.toList())));
	}
}

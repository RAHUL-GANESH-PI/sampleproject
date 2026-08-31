package seleniumBasics;

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

}

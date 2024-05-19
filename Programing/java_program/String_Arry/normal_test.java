package String_Arry;

import java.util.Arrays;
import java.util.stream.Collectors;

public class normal_test {

	public static void main(String[] args) {
		        String input = "everyone loves java";

		       
		String capitalized = Arrays.stream(input.split("\\s+"))
		.map(word -> word.substring(0, 1).toUpperCase() + word.substring(1)).collect(Collectors.joining(" "));

		        System.out.println(capitalized);
		    

	}
}

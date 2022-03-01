package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*program counts the number of vowels and consonants in a given string
 * 
 */
public class CountVowelsnConstants {
	private static Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

	public static void main(String[] args) {

		String ref = "MyNameisAnkita";
		long countOfChar = ref.chars().count();
		long vowel = ref.chars().filter(r -> vowels.contains((char) r)).count();
		long consonants = ref.chars().filter(r -> !vowels.contains((char) r)).count();
		System.out.println("countOfChar:" + countOfChar);
		System.out.println("vowel:" + vowel);
		System.out.println("consonants:" + consonants);

	}

}

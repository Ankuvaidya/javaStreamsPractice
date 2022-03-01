package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class LambdaPractice {

	public static void main(String[] args) {

		/*
		 * Given a list of integers, find out all the even numbers exist in the list
		 * using Stream functions?
		 */
		List<Integer> numArray = Arrays.asList(22, 12, 45, 123, 134, 33, 44, 55, 67, 89, 3, 56, 78, 45, 57, 78);
		numArray.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
		/*
		 * Given a list of integers, find out all the numbers starting with 1 using
		 * Stream functions?
		 */
		numArray.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);
		/*
		 * Q3 How to find duplicate elements in a given integers list in java using
		 * Stream functions?
		 */

		/*
		 * Since Set has the property that it cannot contain any duplicate element. So
		 * if we add the elements in a Set, it automatically discards the duplicate
		 * elements while addition itself.
		 */
		Set<Integer> dulplicateSet = new HashSet<>();
		// numArray.stream().filter(s->
		// !dulplicateSet.add(s)).forEach(System.out::println);
		Set<Integer> duplicates = numArray.stream().filter(s -> !dulplicateSet.add(s)).collect(Collectors.toSet());
		System.out.println("duplicates" + duplicates);

		/*
		 * Given the list of integers, find the first element of the list using Stream
		 * functions
		 */

		Optional<Integer> firstInteger = numArray.stream().findFirst();
		System.out.println("firstInteger: " + firstInteger.get());

		/*
		 * Q5 Given a list of integers, find the total number of elements present in the
		 * list using Stream functions?
		 */

		long count = numArray.stream().count();
		System.out.println("count :" + count);
		/*
		 * Q6 Given a list of integers, find the maximum value element present in it
		 * using Stream functions?
		 * 
		 */
		long max = numArray.stream().max(Integer::compare).get();
		System.out.println("max:" + max);
		/*
		 * Q Given a list of integers, sort all the values present in it in descending
		 * order using Stream functions?
		 */
		numArray.stream().sorted(Collections.reverseOrder()).forEach(System.out::print);
		/*
		 * Given a list of integers, sort all the values present in it using Stream
		 * functions?
		 */
		System.out.println("+________________________________+");
		List<Integer> num = numArray.stream().sorted().collect(Collectors.toList());
		System.out.println("num: " + num);
		// .forEach(System.out::println);

		/*
		 * Q7 Given a String, find the first non-repeated character in it using Stream
		 * functions?
		 */

	}

}

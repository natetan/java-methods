// Given a string, return the first non repeating character
// aab returns b
// atjhua returns t
// boom returns b

import java.util.Set;
import java.util.HashSet;

public class FirstNonRepeating {

	public static void main(String[] args) {
		System.out.println(function("aab")); // should return b
		System.out.println(function("apples")); // should return a
		System.out.println(function("yards")); // should return y
		System.out.println(function("too")); // should return t
	}

	public static String function(String s) {
		Set<String> unique = new HashSet<String>();
		Set<String> nonunique = new HashSet<String>();

		for (int i = 0; i < s.length(); i++) {
			if (unique.contains(s.charAt(i))) {
				nonunique.add(s.charAt(i));
			} else {
				unique.add(s.charAt(i));
			}
		}

		for (int i = 0; i < s.length(); i++) {
			
		}
	}
}
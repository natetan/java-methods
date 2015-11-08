// Given a string, return the first non repeating character
// aab returns b
// atjhua returns t
// boom returns b

import java.util.Set;
import java.util.HashSet;

public class FirstNonRepeating {

	public static void main(String[] args) {
		
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
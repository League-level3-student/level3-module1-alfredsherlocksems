package _00_Intro_To_ArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
    public static void main(String[] args) {
        // 1. Create an array list of Strings
        //    Don't forget to import the ArrayList class
    	ArrayList<String> bob = new ArrayList<String>();
        // 2. Add five Strings to your list
    	bob.add("a");
    	bob.add("b");
    	bob.add("c");
    	bob.add("d");
    	bob.add("e");
        // 3. Print all the Strings using a standard for-loop
    	for (int i = 0; i < bob.size(); i++) {
    		System.out.println(bob.get(i));
    	}
        // 4. Print all the Strings using a for-each loop
    	for (String s: bob) {
    		System.out.println(s);
    	}
        // 5. Print only the even numbered elements in the list.
    	for (int i = 0; i < bob.size(); i++) {
    		if (i % 2 == 0) {
    			System.out.println(bob.get(i));
    		}
    	}
        // 6. Print all the Strings in reverse order.
    	for (int i = bob.size() - 1; i >= 0; i--) {
    			System.out.println(bob.get(i));
    	}
        // 7. Print only the Strings that have the letter 'e' in them.
    	for (String s: bob) {
    		if (s.contains("e")) {
    			System.out.println(s);
    		}
    	}
    }
}

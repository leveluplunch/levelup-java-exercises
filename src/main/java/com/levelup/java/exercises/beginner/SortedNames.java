package com.levelup.java.exercises.beginner;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.google.common.collect.Lists;

/**
 * This program demonstrates a solution to the to Sorted names.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/beginner/sorted-names/'>Sorted names</a>
 * 
 */
public class SortedNames {
	
	public static void main(String[] args) {
		
		List<String> names = Lists.newArrayList();
		
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		String name;
		// Get the user's selection.
		do {
			System.out.print("Enter name (-1 to exit): ");
			name = keyboard.next();
			if (!name.equals("-1")) {
				names.add(name);	
			}
			
		} while (!name.equals("-1"));
		
		// sort collected names
		Collections.sort(names);
		
		// output names
		for (String name2 : names) {
			System.out.println(name2);
		}
	}

}

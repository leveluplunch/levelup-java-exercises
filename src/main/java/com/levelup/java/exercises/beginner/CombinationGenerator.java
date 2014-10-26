package com.levelup.java.exercises.beginner;

import java.util.Set;
import java.util.stream.Collectors;

import com.google.common.collect.Sets;

/**
 * Write a program that generate all combinations of a set returning only that satisfy a size of n.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/combination-generator/'>Combination generator</a>
 */
public class CombinationGenerator {

	public static void main(String[] args) {

		Set<Integer> general = Sets.newHashSet(1, 2, 3, 4);

		Set<Set<Integer>> combinations = generateCombinations(general, 3);
		
		System.out.println(combinations);
	}

	/**
	 * Method will generate possible combinations of 
	 * elements based on parameters
	 * 
	 * @param from
	 * @param size
	 * 
	 * @return possible combinations
	 * 
	 */
	public static Set<Set<Integer>> generateCombinations(
			Set<Integer> from,
			int size) {

		Set<Set<Integer>> elements = Sets.powerSet(from);

		Set<Set<Integer>> possibleCombinations = elements.stream().filter(p -> p.size() == size)
				.collect(Collectors.toSet());

		return possibleCombinations;
	}

}

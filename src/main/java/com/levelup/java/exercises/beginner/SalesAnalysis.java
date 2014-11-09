package com.levelup.java.exercises.beginner;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;

/**
 * This java exercises will demonstrate how to find statistics on sales
 * information.
 * 
 * @author Justin Musgrove
 * @see <a href=
 *      'http://www.leveluplunch.com/java/exercises/sales-analysis-data/'>Sales
 *      analysis data</a>
 * 
 */
public class SalesAnalysis {

	public static void main(String[] args) throws IOException {

		Path salesDataPath = Paths
				.get("src/main/resources/com/levelup/java/exercises/beginner/SalesData.txt")
				.toAbsolutePath();

		//read all lines into a list of strings 
		List<String> fileByLines = java.nio.file.Files
				.readAllLines(salesDataPath);

		//convert each string into a DoubleSummaryStatistics object
		List<DoubleSummaryStatistics> weeksSummary = new ArrayList<>();
		for (String row : fileByLines) {
			// split on comma, map to double
			weeksSummary.add(Arrays.stream(row.split(","))
					.mapToDouble(Double::valueOf).summaryStatistics());
		}

		displayWeeklyStats(weeksSummary);
		displaySummaryResults(weeksSummary);

	}

	public static void displayWeeklyStats(
			List<DoubleSummaryStatistics> weeksSummary) {

		for (int x = 0; x < weeksSummary.size(); x++) {
			DoubleSummaryStatistics weekStat = weeksSummary.get(x);

			System.out.println("Week #" + x + " sales: $" + weekStat.getSum());
			System.out.println("Average daily sales for week #" + x + ": $"
					+ weekStat.getAverage());
		}
	}

	public static void displaySummaryResults(
			List<DoubleSummaryStatistics> weeksSummary) {

		System.out.println("Total sales for all weeks: $"
				+ weeksSummary.stream().mapToDouble(p -> p.getSum()).sum());

		System.out.println("Average weekly sales: $"
				+ weeksSummary.stream().mapToDouble(p -> p.getSum()).average()
						.getAsDouble());

		System.out.println("The highest sales was $"
				+ weeksSummary.stream().mapToDouble(p -> p.getSum()).max()
						.getAsDouble());

		System.out.println("The lowest sales were made during "
				+ weeksSummary.stream().mapToDouble(p -> p.getSum()).min()
						.getAsDouble());

	}
}

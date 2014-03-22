package com.levelup.java.exercises.beginner;

import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

/**
 * Unit test for {@link PenniesForPay}
 * 
 * @author Justin Musgrove
 * @see <a
 *      href='http://www.leveluplunch.co/java/exercises/pennies-for-pay/'>Pennies
 *      for pay</a>
 * 
 */
public class PenniesForPayTest {

	@Test
	public void getPay_test() {

		List<Double> days = PenniesForPay.getPay(5, 1);

		assertThat(
				days,
				contains(new Double(1.0), new Double(2.0), new Double(4.0),
						new Double(8.0), new Double(16.0)));
	}

}

package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import com.google.common.collect.Lists;

/**
 * Unit test for {@link SlotMachineSimulation}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/'></a>
 * 
 */
public class SlotMachineSimulationTest {
	
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void get_reel_negative () {
		SlotMachineSimulation.getReel(-1);
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void get_reel_greater_than_6 () {
		SlotMachineSimulation.getReel(-1);	
	}
	
	
	@Test
	public void get_reel_cherries () {
		assertEquals("Cherries", SlotMachineSimulation.getReel(0));	
	}
	
	@Test
	public void get_random_reel () {
		assertNotNull(SlotMachineSimulation.getRandomReel());
	}

	@Test
	public void determine_pay_out_percentage_two () {
		
		List<String> randomStrings = Lists.newArrayList("one", "one", "two", "three");
		
		assertEquals(2, SlotMachineSimulation.determinePayOutPercentage(randomStrings));;
	}

	@Test
	public void determine_pay_out_percentage_one () {
		
		List<String> randomStrings = Lists.newArrayList("one", "two", "three");
		
		assertEquals(1, SlotMachineSimulation.determinePayOutPercentage(randomStrings));;
	}

	@Test
	public void determine_pay_out_percentage_zero () {
		
		List<String> randomStrings = Lists.newArrayList();
		
		assertEquals(0, SlotMachineSimulation.determinePayOutPercentage(randomStrings));;
	}

}

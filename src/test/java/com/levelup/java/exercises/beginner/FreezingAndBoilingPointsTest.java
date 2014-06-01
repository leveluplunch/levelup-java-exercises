package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.levelup.java.exercises.beginner.FreezingAndBoilingPoints.FreezeAndBoiling;

/**
 * Unit test for {@link FreezingAndBoilingPoints}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/freezing-boiling-points/'>Freezing and Boiling Points</a>
 */
public class FreezingAndBoilingPointsTest {

	@Test
	public void test_isEthylAlchoolFreezing() {

		FreezingAndBoilingPoints freezeAndBoilingPoints = new FreezingAndBoilingPoints();
		FreezeAndBoiling freezeAndBoiling = freezeAndBoilingPoints.new FreezeAndBoiling(
				-174);

		assertTrue(freezeAndBoiling.isEthylAlchoolFreezing());
	}

	@Test
	public void test_isEthylAlchoolBoiling() {

		FreezingAndBoilingPoints freezeAndBoilingPoints = new FreezingAndBoilingPoints();
		FreezeAndBoiling freezeAndBoiling = freezeAndBoilingPoints.new FreezeAndBoiling(
				172);

		assertTrue(freezeAndBoiling.isEthylAlchoolBoiling());
	}

	@Test
	public void test_isOxygenFreezing() {

		FreezingAndBoilingPoints freezeAndBoilingPoints = new FreezingAndBoilingPoints();
		FreezeAndBoiling freezeAndBoiling = freezeAndBoilingPoints.new FreezeAndBoiling(
				-400);

		assertTrue(freezeAndBoiling.isOxygenFreezing());
	}

	@Test
	public void test_isOxygenBoiling() {
		
		FreezingAndBoilingPoints freezeAndBoilingPoints = new FreezingAndBoilingPoints();
		FreezeAndBoiling freezeAndBoiling = freezeAndBoilingPoints.new FreezeAndBoiling(
				-362);

		assertTrue(freezeAndBoiling.isOxygenFreezing());
	}

	@Test
	public void test_isWaterFreezing() {
		
		FreezingAndBoilingPoints freezeAndBoilingPoints = new FreezingAndBoilingPoints();
		FreezeAndBoiling freezeAndBoiling = freezeAndBoilingPoints.new FreezeAndBoiling(
				10);

		assertTrue(freezeAndBoiling.isWaterFreezing());
	}

	@Test
	public void test_isWaterBoiling() {
		
		FreezingAndBoilingPoints freezeAndBoilingPoints = new FreezingAndBoilingPoints();
		FreezeAndBoiling freezeAndBoiling = freezeAndBoilingPoints.new FreezeAndBoiling(
				213);

		assertTrue(freezeAndBoiling.isWaterBoiling());
	}

}

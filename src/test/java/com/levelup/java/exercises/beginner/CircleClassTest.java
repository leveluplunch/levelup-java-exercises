package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.levelup.java.exercises.beginner.CircleClass.Circle;

/**
 * Unit test for {@link CircleClass}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/circle-class-program/'>Circle class test</a>
 */
public class CircleClassTest {

	@Test
	public void test_getArea() {

		CircleClass circleClass = new CircleClass();
		Circle circle = circleClass.new Circle(10);

		assertEquals(314.159, circle.getArea(), 0);
	}

	@Test
	public void test_getDiameter() {

		CircleClass circleClass = new CircleClass();
		Circle circle = circleClass.new Circle(10);

		assertEquals(20, circle.getDiameter(), 0);
	}

	@Test
	public void test_getCircumference() {

		CircleClass circleClass = new CircleClass();
		Circle circle = circleClass.new Circle(10);

		assertEquals(62.8318, circle.getCircumference(), 0);
	}

}
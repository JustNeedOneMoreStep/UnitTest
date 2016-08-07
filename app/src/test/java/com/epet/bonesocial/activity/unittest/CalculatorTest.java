package com.epet.bonesocial.activity.unittest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 日期: 2016/8/6
 * 时间: 15:44
 */
public class CalculatorTest {
	public Calculator mCalculator;
	@Before
	public void setUp() throws Exception {
		mCalculator = new Calculator();
	}
	//第三个参数是指结果和断言的值之间的差值,也就是误差
	@Test
	public void testSum() throws Exception {
		assertEquals(3.0d,mCalculator.sum(-1.542d,4.542d),0);
	}

	@Test
	public void testSubtract() throws Exception {
		assertEquals(1.1d,mCalculator.subtract(5.1d,4.0d),0.0000001);
	}

	@Test
	public void testMultiply() throws Exception {
		assertEquals(9.0d,mCalculator.multiply(2d,4.5d),0);
	}

	@Test
	public void testDivide() throws Exception {
		assertEquals(2.0d,mCalculator.divide(9d,4.5d),0);
	}
}
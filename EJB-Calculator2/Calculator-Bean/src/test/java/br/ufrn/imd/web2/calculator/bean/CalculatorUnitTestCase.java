package br.ufrn.imd.web2.calculator.bean;

import static org.junit.Assert.*;

import org.junit.Test;

import br.ufrn.imd.web2.calculator.bean.Calculator;
import br.ufrn.imd.web2.calculator.bean.NoInterfaceViewCalculatorBean;

public class CalculatorUnitTestCase {

	@Test
	public void testAdd() {
		final Calculator calc = new NoInterfaceViewCalculatorBean();
		final int expectedSum = 2 + 3 + 5;
		
		final int actualSum = calc.add(2, 3, 5);
		
		assertEquals("Addition did not return the expected result", expectedSum, actualSum);
	}

}

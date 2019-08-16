package Calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestCalc {
	
	@Test
	public void TestaSoma() {
		float r = Calc.calcula("+", 4, 5);
		Assert.assertEquals((float)9, r);
	}
	
	@Test
	public void TestaDivisao() {
		float r = Calc.calcula("/", 15, 3);
		Assert.assertEquals((float)5, r);
	}
	
	@Test
	public void TestaMult() {
		float r = Calc.calcula("*", 4, 3);
		Assert.assertEquals((float)12, r);
	}
	
	@Test
	public void TestaSub() {
		float r = Calc.calcula("-", 15, 3);
		Assert.assertEquals((float)12, r);
	}

}

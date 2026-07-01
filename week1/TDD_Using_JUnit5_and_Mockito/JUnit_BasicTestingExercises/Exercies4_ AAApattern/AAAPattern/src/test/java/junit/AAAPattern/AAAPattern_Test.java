package junit.AAAPattern;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
public class AAAPattern_Test {
	Calculator calculator;
	
	@BeforeEach
	public void setUp() {
		calculator=new Calculator();
	}
	@Test
	public void addTest() {
		long a=23;
		long b=98;
		long result=calculator.add(a, b);
		assertEquals(121,result);
	}
	@Test
	public void subtractionTest() {
		long a=123;
		long b=98;
		long result=calculator.subtraction(a, b);
		assertEquals(25,result);
	}
	@Test
	public void multiplyTest() {
		long a=23;
		long b=98;
		long result=calculator.multiply(a, b);
		assertEquals(2254,result);
	}
	@Test
	public void divideTest() {
		long a=258;
		long b=98;
		double result=calculator.divide(a, b);
		assertEquals(2.6326530612244,result,0.0001);
	}
	@AfterEach
	public void teardown() {
		calculator=null;
	}
}

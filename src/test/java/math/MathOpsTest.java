package math;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathOpsTest {
	int intA = 2;
	int intB = 2;
	double doubleA = 2.0;
	double doubleB = 2.0;
	int octalA = 002;
	int octalB = 002;
	int hexA = 0xF;//15
	int hexB = 0x3;//3
	int binaryA = 0b1111;//15
	int binaryB = 0b11;//3
	int intSqrt = 9;
	int octalSqrt = 020;
	double doubleSqrt = 9.0;
	
	/*
	 * We don't need to test every combination of int, octal, hex, and binary
	 * against each other because they are automatically converted in java
	 * 
	 * Generally, the tests cover 3 cases:
	 * int & int
	 * int & double
	 * double & double 
	 * 
	 * With some fun flavor in there double checking the automatic
	 * Java conversions 
	 */
	
	@Test
	public void testAdd() {
		int intResult = 0;
		double doubleResult = 0;
		
		//int + hex add
		intResult = MathOps.add(intB, hexA);
		assertTrue(intResult == 17);
		
		//octal + int add
		intResult = MathOps.add(intB, binaryB);
		assertTrue(intResult == 5);
		
		//double to double add
		doubleResult = MathOps.add(doubleA, doubleB);
		assertTrue(doubleResult == 4.0);
		
		//double + octal add
		doubleResult = MathOps.add(doubleA, octalA);
		assertTrue(doubleResult == 4.0);
		
		//double + binary add
		doubleResult = MathOps.add(doubleA, binaryB);
		assertTrue(doubleResult == 5.0);
		
		//hex to binary add
		intResult = MathOps.add(hexA, binaryA);
		assertTrue(intResult == 30);
	}	

	@Test
	public void testSubtract() {
		int iResult = 0;
		double dResult = 0;
		
		// int - int subtract
		iResult = MathOps.subtract(intA, intB);
		assertTrue(iResult == 0);
		
		// int - double subtract
		dResult = MathOps.subtract(binaryA, doubleB);
		assertTrue(dResult == 13);
		
		//double - double subtract 
		dResult = MathOps.subtract(doubleA, doubleB);
		assertTrue(dResult == 0);
		

	}

	@Test
	public void testMultiply() {
		int iResult = 0;
		double dResult = 0;
		
		//int * int multiply 
		iResult = MathOps.multiply(intA, intB);
		assertTrue(iResult == 4);
		
		//octal int * octal int multiply 
		iResult = MathOps.multiply(octalA, octalB);
		assertTrue(iResult == 004);		
		
		//hex int * binary int multiply 
		iResult = MathOps.multiply(hexA, binaryB);
		assertTrue(iResult == 45);

		//binary int * double multiply 
		dResult = MathOps.multiply(binaryA, doubleB);
		assertTrue(dResult == 30.0);
		
		//double * double multiply 
		dResult = MathOps.multiply(doubleA, doubleB);
		assertTrue(dResult == 4);
	}

	@Test
	public void testDivide() {
		int iResult = 0;
		double dResult = 0;
		
		//int / int divide
		iResult = MathOps.divide(intA, intB);
		assertTrue(iResult == 1);
		
		// octal int / octal int divide
		iResult = MathOps.divide(octalA, octalB);
		assertTrue(iResult == 1);
		
		// hex int / binary int divide 
		iResult = MathOps.divide(hexA, binaryB);
		assertTrue(iResult == 5);
		
		// binary int / double divide 
		dResult = MathOps.divide(binaryA, doubleB);
		assertTrue(dResult == 7.5);
		
		//double / double divide
		dResult = MathOps.divide(doubleA, doubleB);
		assertTrue(dResult == 1);
	}

	@Test
	public void testSqrt() {
		// int sqrt
		double result = MathOps.sqrt(intSqrt);
		assertTrue(result == 3.0);
		
		//double sqrt
		result = MathOps.sqrt(doubleSqrt);
		assertTrue(result == 3.0);
	}

	@Test
	public void testExponent() {
		int iResult = 0;
		double dResult = 0;
		
		//int ^ int exponent 
		iResult = MathOps.exponent(intA, intB);
		assertTrue(iResult == 4);
		
		//int ^ double exponent
		dResult = MathOps.exponent(intA, doubleB);
		assertTrue(dResult == 4);
		
		//double ^ int exponent
		dResult = MathOps.exponent(doubleA, intB);
		assertTrue(dResult == 4);
		
		//double ^ double exponent
		dResult = MathOps.exponent(doubleA, doubleB);
		assertTrue(dResult == 4);
	}
	
	@Test
	public void conversionTest() {
		/*
		 * Because java automatically converts between the different 
		 * whole number bases, I've opted to compare their string 
		 * representations. 
		 */
		
		//int to other bases
		assertTrue("1111".equalsIgnoreCase(MathOps.toBinaryString(15)));
		assertTrue("10".equalsIgnoreCase(MathOps.toOctalString(8)));
		assertTrue("F".equalsIgnoreCase(MathOps.toHexString(15)));
		
		// double to int to other bases
		assertTrue("1111".equalsIgnoreCase(MathOps.toBinaryString(MathOps.doubleToInt(15.1))));
		assertTrue("10".equalsIgnoreCase(MathOps.toOctalString(MathOps.doubleToInt(8.5))));
		assertTrue("F".equalsIgnoreCase(MathOps.toHexString(MathOps.doubleToInt(15.6))));

		//string int to parsed in value
		assertTrue(MathOps.stringToHexInt("F") == 15);
		assertTrue(MathOps.stringToOctalInt("010") == 8);
		assertTrue(MathOps.stringToBinaryInt("1111") == 15);
	}

}

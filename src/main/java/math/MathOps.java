package math;

import java.lang.Math;

/**
 * @author Kyle
 *
 */
public class MathOps {

	/**
	 * Adds 2 doubles together and returns the result
	 *  
	 * @param a
	 * @param b
	 * @return (double) result
	 *
	 */
	public static double add(double a, double b) {
		return a + b;
	}
	
	/**
	 * Adds 2 integers, hex, binary or octal numbers together and returns the result
	 * 
	 * @param a
	 * @param b
	 * @return (int) result
	 * 
	 */
	public static int add(int a, int b) {
		return a + b;
	}
	
	/**	
	 *  Subtracts integer b from a returns the result. Can be used for 
	 * integer, hex, binary, or octal numbers
	 * 
	 * @param a
	 * @param b
	 * @return (int) result
	 * 
	 */
	public static int subtract(int a, int b) {
		return a - b;
	}
	
	/**
	 * Subtracts b from a and returns the result
	 * 
	 * @param a
	 * @param b
	 * @return (double) result
	 * 
	 */
	public static double subtract(double a, double b) {
		return a - b;
	}
	
	/**
	 * Multiplies integers, hex, binary or octal numbers and returns the result
	 * 
	 * @param int a
	 * @param int b
	 * @return the int result
	 * 
	 */
	public static int multiply(int a, int b) {
		return a * b;
	}
	
	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public static double multiply(double a, double b) {
		return a * b;
	}
	
	/**
	 * Divides a by b and returns the result. Applicable for:
	 * integers, hex, binary, or octal numbers 
	 * 
	 * @param a the dividend 
	 * @param b the divisor
	 * @return (int) result
	 * 
	 * 
	 */
	public static int divide(int a, int b) {
		return a / b;
	}
	
	/**
	 * Divides a by b and returns the result
	 * @param a the dividend
	 * @param b the divisor
	 * @return (double) result
	 */
	public static double divide(double a, double b) {
		return a / b;
	}
	
	/**
	 * Returns the square root of the number parameter
	 * @param a the number to get the root of 
	 * @return (double) result
	 */
	public static double sqrt(double d) {
		return Math.sqrt(d);
	}
	
	/**
	 * Raises base 'a' to exponent 'pow' and returns the result
	 * 
	 * @param a the base to be multiplied
	 * @param pow the exponent to be raised to 
	 * @return (double) result
	 */
	public static double exponent(double a, double pow) {
		return Math.pow(a, pow);
	}
	
	/**
	 * Raises base 'a' to exponent 'pow' and returns the result
	 * 
	 * @param a the base to be multiplied
	 * @param pow the exponent to be raised to 
	 * @return (int) result
	 */
	public static int exponent(int a, int pow) {
		int res = a;
		for(int i = 1; i < pow; i++) {
			res *= a;
		}
		return res;
	}
	
	/* Converts double to int.
	 * WARNING:
	 * Floating point precision will be lost using this method!
	 */
	/**
	 * @param d the number to convert
	 * @return an integer representation of the input parameter
	 */
	public static int doubleToInt(double d) {
		return (int) d;
	}
	
	/**
	 * Converts an integer to an octal string representation
	 * @param i the int to be converted
	 * @return octal representation of the input parameter
	 */
	public static String toOctalString(int i) {
		//radix is base 8 (octal)
		return Integer.toOctalString(i);
	}
	
	/**
	 * Converts an integer to an binary string representation
	 * @param i the int to be converted
	 * @return binary representation of the input parameter
	 */
	public static String toBinaryString(int i) {
		//radix is base 2 (binary)
		return Integer.toBinaryString(i);
	}
	
	/**
	 * Converts an integer to an hex string representation
	 * @param i the int to be converted
	 * @return hex representation of the input parameter
	 */
	public static String toHexString(int i) {
		//radix is base 16 (hex)
		return Integer.toHexString(i);
	}
	
	/**
	 * Takes a string representation of an octal int and converts it
	 * to the int value.
	 * @param s - must be a string representation an octal number.
	 * @return int value of the octal string
	 */
	public static int stringToOctalInt(String s) {
		//radix is base 8 (octal)
		return Integer.parseInt(s, 8);
	}
	
	/**
	 * Takes a string representation of an binary int and converts it
	 * to the int value.
	 * @param s - must be a string representation an binary number.
	 * @return int value of the binary string
	 */
	public static int stringToBinaryInt(String s) {
		//radix is base 2 (binary)
		return Integer.parseInt(s, 2);
	}
	
	/**
	 * Takes a string representation of an hex int and converts it
	 * to the int value.
	 * @param s - must be a string representation an hex number.
	 * @return int value of the hex string
	 */
	public static int stringToHexInt(String s) {
		//radix is base 16 (hex)
		return Integer.parseInt(s, 16);
	}
	
	
}

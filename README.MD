Thanks for using this static math library!

Below is a quick overview of the library and important considerations.

Good things to remember: 
	Java automatically converts binary, octal, hex, and int to the same base. 

	Integers with bases other than 10 will be displayed in base 10 (regular int) 
	when output to the console.

	Binary bytes and shorts can be passed as int parameters and are automatically converted.

	Floating point precision is lost when converting from floating point/double to int.
	
	Lower precision numbers can be passed as a higher precision parameter.
	ie. 1 = 1.00 but the opposite is not the case 

USAGE:

1. Import MathOps into a java class of your choice.
2. Statically use MathOps wherever necessary:
	MathOps.add(1,2) = 3
	MathOps.toHexString(15) = "F";

Notes:
	See MathOpsTest for how to declare double, hex, octal, binary, and int variables
	in Java. 

	The conversion methods convert to and from string, to more easily view output,
	as java does the base conversion automatically.
	To convert between double and any of the integer bases, the floating point variable 
	must be cast to int first. ie:
		 MathOps.toHexString(MathOps.doubleToInt(3.14));

	When performing an operation on numbers of different precision levels,
	the integer number will be converted to floating point and the result will
	be in floating point.
	
	Square roots are rarely whole numbers, the user can choose to convert the result
	of the sqrt(double d) method to an int if desired, but the method itself will 
	always return floating point
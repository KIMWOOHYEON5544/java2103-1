package edu.utexas.cs;
/* CallingMethodsInSameClass.java
*
* illustrates how to call static methods a class
* from a method in the same class
* https://www.cs.utexas.edu/~scottm/cs307/codingSamples.htm
*/

public class CallingMethodsInSameClass
{
	public static void main(String[] args) {
		printOne();
		printOne();
		printTwo();
	}

	public static void printOne() {
		System.out.println("Hello World");
	}

	public static void printTwo() {
		printOne();
		printOne();
	}
}
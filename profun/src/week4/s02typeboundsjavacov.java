package week4;

import java.util.LinkedList;

import week3.Empty$;
import week3.NonEmpty;
import week3.IntSet;

class s02typeboundsjavacov{
	public static void main(String[] args) {
		
		// Note the syntax to access a singleton object of scala from java
		NonEmpty[] a = new NonEmpty[]{new NonEmpty(1, Empty$.MODULE$, Empty$.MODULE$)};
		IntSet[] b = a;
		b[0] = Empty$.MODULE$;
		NonEmpty s = a[0];
		
		// java.lang.ArrayStoreException gets thrown
		// We trade a compile time error for a runtime error
		
		// A runtime check is made to ensure that types can be assigned
		
		// So why was this design decision made for Java?
		
		// In Java < 1.5 there were no generics in place 
		// so in a method sort(Object[] a) the parameter had to be covariant
		// because generics were not available (once again! xD).
		
	}  
}
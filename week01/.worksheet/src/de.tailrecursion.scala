package de

import scala.annotation.tailrec

object tailrecursion {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(111); 
  println("Welcome to the Scala worksheet");$skip(713); 
  
  /*
  Tail recursion
	If a function calls itself as its last action, the function stack frame can be reused. This is called tail recursion.
	So its an iterative formulation just like a loop and executes as efficiently as a loop
	
	// Tail recursive
	def gcd(a: Int, b: Int): Int =
		if (b == 0) a else gcd(b, a%b)
	
	// Not tail recursive
	def factotial(n: Int): Int =
		if(n==0) 1 else n * factorial(n-1)
	
	The same applies if the call is made to another function. In such case such calls are called tail calls.
  */
  //Using @tailrec we make sure that if the compiler can not optimize for stackframe reuse it will throw an exception
  
  def factorial1(n: Int) : Int = if(n==1) 1 else n * factorial1(n-1)
  // Fails
  @tailrec;System.out.println("""factorial1: (n: Int)Int""");$skip(89);  def factorial2(n: Int) : Int = if(n==1) 1 else n * factorial2(n-1)
  // Works
  @tailrec;System.out.println("""factorial2: (n: Int)Int""");$skip(152);  def factorial3(n: Int) : Int ={
  	def loop(n:Int, res: Int) : Int =
  		if (n==1) res else loop(n-1, res*n)
  	factorial3(n)
  }
  // Works
  @tailrec;System.out.println("""factorial3: (n: Int)Int""");$skip(82);  def gcd(a: Int, b: Int) : Int = if(a==0) 0 else gcd(a, a%b);System.out.println("""gcd: (a: Int, b: Int)Int""")}
}

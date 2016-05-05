package de

object s02currying {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(76); 
  println("Welcome to the Scala worksheet");$skip(1005); 
  
  /*
  def sum(f: Int => Int): (Int, Int) => Int = {
  	def sumF(a: Int, b: Int): Int =
  		if(a>b) 0 else f(a) + sumF(a+1,b)
  	sumF
  }
  
  def sumInts = sum(x => x)
  def sumCubes = sum(x=>x*x*x)
  def fact(x:Int) : Int = if(x==1) 1 else x*fact(x-1)
  def sumFactorials = sum(fact)
  
  def cube(x:Int) = x*x
  sum(cube)(1, 10)
  sum(cube)
  */
  
  /*
  // Equivalent to the previous definition
  def sum(f: Int => Int)(a: Int, b:Int): Int = {
  	if(a>b) 0 else f(a) + sum(f)(a+1,b)
  }
  
  def sumInts = sum(x => x)_
  def sumCubes = sum(x=>x*x*x)_
  def fact(x:Int) : Int = if(x==1) 1 else x*fact(x-1)
  def sumFactorials = sum(fact)_
  
  def cube(x:Int) = x*x
  sum(cube)(1, 10)
  sum(cube)_
  */
  
  def op											// mapingAndReducing
  			(p: (Int, Int)=>Int)	// combining operation sum, product, etc...
  				(f: Int => Int)			// mapping opration power, division by 2, etc...
  					(a: Int, b:Int)		// actual parameters
  						: Int = {
		if(a>b) 0 else p(f(a), op(p)(f)(a+1,b))
  };System.out.println("""op: (p: (Int, Int) => Int)(f: Int => Int)(a: Int, b: Int)Int""");$skip(31); 
  def sumP(a:Int, b:Int) = a+b;System.out.println("""sumP: (a: Int, b: Int)Int""");$skip(22); 
  def sum = op(sumP)_;System.out.println("""sum: => (Int => Int) => ((Int, Int) => Int)""");$skip(30); 
  def sumSquare = sum(x=>x*x);System.out.println("""sumSquare: => (Int, Int) => Int""");$skip(17); val res$0 = 
  sumSquare(1,2);System.out.println("""res0: Int = """ + $show(res$0))}
}

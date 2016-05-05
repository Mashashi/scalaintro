package de

object s02currying {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
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
  }                                               //> op: (p: (Int, Int) => Int)(f: Int => Int)(a: Int, b: Int)Int
  def sumP(a:Int, b:Int) = a+b                    //> sumP: (a: Int, b: Int)Int
  def sum = op(sumP)_                             //> sum: => (Int => Int) => ((Int, Int) => Int)
  def sumSquare = sum(x=>x*x)                     //> sumSquare: => (Int, Int) => Int
  sumSquare(1,2)                                  //> res0: Int = 5
}
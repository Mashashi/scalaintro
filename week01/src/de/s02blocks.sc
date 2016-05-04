package de

object s02blocks {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  /*

  Block
	It contains a sequence of definitions or expressions
	The last elements if a block us an expression that defines its value
		This return expression can be preceded by auxiliary definitions
	Blocks are themselves expressions a block may appear everywhere an expression can
	The definitions inside a block are only visible from within the block
	The definitions inside a block shadow definitions of the same names outside the block
	
	Semicolons
	Semicolons are optional unless you want to put several definitions in one line
	If one wants to write a expression that spawns several lines you can use parenthesis
		(someLongExpression
			+ someOtherExpression)
	Or you can write the operator at the end of the first line
		someLongExpression +
		someOtherExpression
	
  */
  
  
  def sqrtIter(guess: Double, x:Double): Double =
  	if (isGoodEnough(guess, x)) guess
  	else sqrtIter(improve(guess,x),x)         //> sqrtIter: (guess: Double, x: Double)Double
  	
  def isGoodEnough(guess:Double, x:Double) =
  	Math.abs(guess * guess - x) < 0.001       //> isGoodEnough: (guess: Double, x: Double)Boolean
  
  def improve(guess:Double, x:Double) =
  	(guess + x / guess) / 2                   //> improve: (guess: Double, x: Double)Double
  
  def sqrt1(x: Double) = sqrtIter(1.0, x)         //> sqrt1: (x: Double)Double
  
  
  
  
  // Using block to better encapsulate
  def sqrt2(x: Double) = {
  	def sqrtIter(guess: Double, x:Double): Double =
			if (isGoodEnough(guess, x)) guess
			else sqrtIter(improve(guess,x),x)
	  def isGoodEnough(guess:Double, x:Double) =
			Math.abs(guess * guess - x) < x*0.001
		def improve(guess:Double, x:Double) =
			(guess + x / guess) / 2
		sqrtIter(1.0, x)
  }                                               //> sqrt2: (x: Double)Double
  
  
  sqrt1(2)                                        //> res0: Double = 1.4142156862745097
  sqrt1(4)                                        //> res1: Double = 2.0000000929222947
  sqrt2(1E60)                                     //> res2: Double = 1.0000788456669446E30
  
  
  
  
  // Using shadow variables to avoid overhead of passing parameters
  def sqrt3(x: Double) = {
  	def sqrtIter(guess: Double): Double =
			if (isGoodEnough(guess)) guess
			else sqrtIter(improve(guess))
	  def isGoodEnough(guess:Double) =
			Math.abs(guess * guess - x) < x*0.001
		def improve(guess:Double) =
			(guess + x / guess) / 2
		sqrtIter(1.0)
  }                                               //> sqrt3: (x: Double)Double
  
  
  
  {
	  val x = 0
	  def f(y: Int) = y +1
	  val result = {
	  	val x = f(3)
	  	x * x
	  } + x
  }
  
  
  
}
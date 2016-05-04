package de

object s02blocks {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  println("Welcome to the Scala worksheet");$skip(918); 
  
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
  	else sqrtIter(improve(guess,x),x);System.out.println("""sqrtIter: (guess: Double, x: Double)Double""");$skip(88); 
  	
  def isGoodEnough(guess:Double, x:Double) =
  	Math.abs(guess * guess - x) < 0.001;System.out.println("""isGoodEnough: (guess: Double, x: Double)Boolean""");$skip(70); 
  
  def improve(guess:Double, x:Double) =
  	(guess + x / guess) / 2;System.out.println("""improve: (guess: Double, x: Double)Double""");$skip(45); 
  
  def sqrt1(x: Double) = sqrtIter(1.0, x);System.out.println("""sqrt1: (x: Double)Double""");$skip(380); 
  
  
  
  
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
  };System.out.println("""sqrt2: (x: Double)Double""");$skip(17); val res$0 = 
  
  
  sqrt1(2);System.out.println("""res0: Double = """ + $show(res$0));$skip(11); val res$1 = 
  sqrt1(4);System.out.println("""res1: Double = """ + $show(res$1));$skip(14); val res$2 = 
  sqrt2(1E60);System.out.println("""res2: Double = """ + $show(res$2));$skip(369); 
  
  
  
  
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
  };System.out.println("""sqrt3: (x: Double)Double""");$skip(108); 
  
  
  
  {
	  val x = 0
	  def f(y: Int) = y +1
	  val result = {
	  	val x = f(3)
	  	x * x
	  } + x
  }}
  
  
  
}

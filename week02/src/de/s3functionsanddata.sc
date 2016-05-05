package de

class Rational(x: Int, y: Int) {
	
	/*
	require is used to enforce a precondition on the caller of a function
		- is the callers fault
	assert is used as to check the code of the function itself
		- not the callers fault
	*/
	require(y!=0, "Denominator must be nonzero "+y)
	
	def this(x: Int) = this(x, 1)
	
	
	private def gcd(x: Int, y: Int): Int = if(y==0) x else gcd(y, x % y)
	private val g = {/*println (gcd(x,y));*/ gcd(x,y)}
	
	val numer = x / g
	val denom = y /g
	
	def less(that: Rational) = numer*that.denom < that.numer*denom
	def <(that: Rational) = less(that)
	
	def max(that: Rational) = if(this less that) this else that
	
	def add(that: Rational) =
		new Rational(
			(numer * that.denom)+(that.numer * denom),
			(denom * that.denom)
		)
	def + (that:Rational) = add(that)
	def sub(that: Rational) =
		new Rational(
			(numer * that.denom)-(that.numer * denom),
			(denom * that.denom)
		)
	//def - (that:Rational) = sub(that)
	def - (that:Rational) = this + -that
	
	def neg = new Rational(-numer,denom)
	def unary_- = neg
	
	
	override def toString = numer + "/" + denom
}

object s3functionsanddata {

  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  new Rational(1,2).denom                         //> res0: Int = 2
  val x = new Rational(1,3)                       //> x  : de.Rational = 1/3
  val y = new Rational(5,7)                       //> y  : de.Rational = 5/7
  val z = new Rational(3,2)                       //> z  : de.Rational = 3/2
  
  x - y - z                                       //> res1: de.Rational = -79/42
  new Rational(2)                                 //> res2: de.Rational = 2/1
}


/*
The precedence of an operator is determined by its first character.
Following the next table order of Precedence Rules:
	<lowest>
	(all letters)
	|
	^
	&
	<>
	=!
	:
	+ -
	* / %
	(all other special characters)
	<highest>
*/
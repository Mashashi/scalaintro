package week2

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
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

object s3functionsanddata {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(1178); 

  println("Welcome to the Scala worksheet");$skip(26); val res$0 = 
  new Rational(1,2).denom;System.out.println("""res0: Int = """ + $show(res$0));$skip(28); 
  val x = new Rational(1,3);System.out.println("""x  : de.Rational = """ + $show(x ));$skip(28); 
  val y = new Rational(5,7);System.out.println("""y  : de.Rational = """ + $show(y ));$skip(28); 
  val z = new Rational(3,2);System.out.println("""z  : de.Rational = """ + $show(z ));$skip(15); val res$1 = 
  
  x - y - z;System.out.println("""res1: de.Rational = """ + $show(res$1));$skip(18); val res$2 = 
  new Rational(2);System.out.println("""res2: de.Rational = """ + $show(res$2))}
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

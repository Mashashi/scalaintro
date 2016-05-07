package de

object s3functionsanddata {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(84); 

  println("Welcome to the Scala worksheet");$skip(26); val res$0 = 
  new Rational(1,2).denom;System.out.println("""res0: <error> = """ + $show(res$0));$skip(28); 
  val x = new Rational(1,3);System.out.println("""x  : <error> = """ + $show(x ));$skip(28); 
  val y = new Rational(5,7);System.out.println("""y  : <error> = """ + $show(y ));$skip(28); 
  val z = new Rational(3,2);System.out.println("""z  : <error> = """ + $show(z ));$skip(15); val res$1 = 
  
  x - y - z;System.out.println("""res1: <error> = """ + $show(res$1));$skip(18); val res$2 = 
  new Rational(2);System.out.println("""res2: <error> = """ + $show(res$2))}
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

package de

object s3functionsanddata {

  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  new Rational(1,2).denom                         //> res0: <error> = 2
  val x = new Rational(1,3)                       //> x  : <error> = 1/3
  val y = new Rational(5,7)                       //> y  : <error> = 5/7
  val z = new Rational(3,2)                       //> z  : <error> = 3/2
  
  x - y - z                                       //> res1: <error> = -79/42
  new Rational(2)                                 //> res2: <error> = 2/1
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
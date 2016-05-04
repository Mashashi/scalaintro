package de

object s01Intro {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(73); 
  println("Welcome to the Scala worksheet");$skip(72); val res$0 = 
  
 	/*
 	Starting REPL
		scala
		sbt console
 	*/
 	
 	//Basics
	34+65;System.out.println("""res0: Int(99) = """ + $show(res$0));$skip(17); 
	def radius = 10;System.out.println("""radius: => Int""");$skip(17); 
	def pi = 3.1415;System.out.println("""pi: => Double""");$skip(13); val res$1 = 
	radius * pi;System.out.println("""res1: Double = """ + $show(res$1));$skip(29); 
	def square(x: Double) = x*x;System.out.println("""square: (x: Double)Double""");$skip(71); 
	def sumOfSquares(x: Double, y:Double): Double = square(x) + square(x);System.out.println("""sumOfSquares: (x: Double, y: Double)Double""");$skip(22); 
	def loop: Int = loop;System.out.println("""loop: => Int""")}
	
	/*
	Evaluation strategies
		call-by-value
		call-by-name
	*/
	
	/*
	If CBV evaluation of an expression e terminates, then CBN evaluation of e terminates, too.
	The other direction is not true.
	E.g:
		def loop1(x: Int, y:Int) = x
		def loop2(x: Int, y: => Int) = x
		loop1(1, loop1)
		loop2(1, loop2)
	Returns under CBN and not in CBN
	*/
	
	/*
	We use => to define call by name
		def constOne(x: Int, y: => Int) = 1
	*/
	
	/*
	def abs(x: Int) = if(x>=0) x else -x
		val -> is the definition of a var by CBV
		def -> is the definition of a var by CBN
	*/
	
	/*
	To stop evaluation in a scala worksheet press escape
	*/
}

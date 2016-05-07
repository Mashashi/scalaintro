package de

object s01Intro {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
 	/*
 	Starting REPL
		scala
		sbt console
 	*/
 	
 	//Basics
	34+65                                     //> res0: Int(99) = 99
	def radius = 10                           //> radius: => Int
	def pi = 3.1415                           //> pi: => Double
	radius * pi                               //> res1: Double = 31.415000000000003
	def square(x: Double) = x*x               //> square: (x: Double)Double
	def sumOfSquares(x: Double, y:Double): Double = square(x) + square(x)
                                                  //> sumOfSquares: (x: Double, y: Double)Double
	def loop: Int = loop                      //> loop: => Int
	
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
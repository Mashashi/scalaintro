package week3

import week2._

object s04organization {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
	
	new Rational(1,2 )                        //> res0: week2.Rational = 1/2
	
	def error(msg: String) = throw new Error(msg)
                                                  //> error: (msg: String)Nothing
	
	//error("test")
	
	/*
	+ AnyVal - Base time of primitives
	+ AnyRef - Is like the java.Object class
	
	+ Null - Subtype of every subtype of AnyRef
	+ Nothing - Subtype of every subtype of AnyVal and Null
	
	+ The type of null is Null and is a subtype of java.Object
	*/
	
	val x1 = null                             //> x1  : Null = null
	val x2 : Null = null                      //> x2  : Null = null
	if (true) 1 else false                    //> res1: AnyVal = 1
	
}
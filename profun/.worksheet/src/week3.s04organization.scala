package week3

import week2._

object s04organization {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(99); 
  println("Welcome to the Scala worksheet");$skip(22); val res$0 = 
	
	new Rational(1,2 );System.out.println("""res0: week2.Rational = """ + $show(res$0));$skip(49); 
	
	def error(msg: String) = throw new Error(msg);System.out.println("""error: (msg: String)Nothing""");$skip(290); 
	
	//error("test")
	
	/*
	+ AnyVal - Base time of primitives
	+ AnyRef - Is like the java.Object class
	
	+ Null - Subtype of every subtype of AnyRef
	+ Nothing - Subtype of every subtype of AnyVal and Null
	
	+ The type of null is Null and is a subtype of java.Object
	*/
	
	val x1 = null;System.out.println("""x1  : Null = """ + $show(x1 ));$skip(22); 
	val x2 : Null = null;System.out.println("""x2  : Null = """ + $show(x2 ));$skip(24); val res$1 = 
	if (true) 1 else false;System.out.println("""res1: AnyVal = """ + $show(res$1))}
	
}

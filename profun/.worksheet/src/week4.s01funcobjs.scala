package week4

import week3.{Nil, Cons, List}

object s01funcobjs {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(111); 
  println("Welcome to the Scala worksheet");$skip(681); 
  
  // the function A=>B is just an abbreviation for the class scala.Function1[A, B], which is roughly defined as follows:
  /*
  package scala
  trait Function1[A, B]{
  	def apply(x:A ): B
  }
  */
  
  /*
  
  An anonymous function such as
  	(x: Int) => x * x
  is expanded (eta-expansion from lambda calculus) to:
  
  {
	  class AnonFun exteds Function1[Int, Int] {
	  	def apply(x: Int) = x * x
	  }
	  new Anonfun
  }
  
  or for shorter using anonymous class syntax
  
  new Function1[Int, Int] {
  	def apply(x: Int) = x * x
  }
  
  Remark: Methods (class functions) are not themselves objects! A recurrence situation would happen.
  */
  
  val f1  = (x:Int) => x * x;System.out.println("""f1  : Int => Int = """ + $show(f1 ));$skip(71); 
  
  val f2 = new Function1[Int,Int]{
  	def apply(x: Int) = x * x
  };System.out.println("""f2  : Int => Int = """ + $show(f2 ));$skip(14); val res$0 = 
  f2.apply(7);System.out.println("""res0: Int = """ + $show(res$0));$skip(26); 
  
  println(List().head);$skip(26); 
  println(List(1,2).head)}
}

object List {
	def apply[T](x1: T, x2: T): List[T] = new Cons(x1, new Cons(x2, new Nil))
	def apply[T]() = new Nil
}

/*
In Scala, there is a language feature generally referred to as "The Apply Method" that has the following rules:
	1. Any object that has an apply method can be called with the .apply omitted.
	2. Functions are no more than objects.

Let's take a look at an example. Given the following abbreviated definition of class Array, and an instance a,

	class Array{
	  def get(index:Int) = { ...some code to get from the array... }
	  def apply(index:Int) = get(index)
	}
	
	val a = new Array(whatever)
	
	Then the following calls are essentially equivalent:
	
	a.apply(7)
	a(7)
	a.get(7)
 
*/

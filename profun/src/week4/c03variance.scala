package week4

import week3.NonEmpty
import week3.Empty

trait List[+T] {
	def isEmpty: Boolean
	def head: T
	def tail: List[T]
	
	// This would lead to an erro method parameters can not be covariant
	// def prepend(x: T): List[T] = new Cons(x, this)
	/*
	 The rule ensures the Liskov Substitution Principle is not violated
	 in a List[IntSet] one could do prepend(Empty)
	 but not
	 in a List[NonEmpty] prepend(Empty)
	 */
	def prepend [U >: T] (x: U): List[U] = new Cons(x, this)  
}

// val on the constructor just says the type constructor
// should also be a attribute of the class
class Cons[T](val head: T, val tail: List[T]) extends List[T]{
	def isEmpty = false
}

object Nil extends List[Nothing]{
	def isEmpty = true
	def head: Nothing = throw new NoSuchElementException("Nil.head")
	def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}
object test {
  val x: List[String] = Nil
}

object Main extends App{
  println("hey")
  // Remark: The variance inferance rule U >: T serves as a way do 
  // correct type inference is not restricting the types prepend may receive
  def f(xs:List[NonEmpty]) = xs prepend Empty 
}
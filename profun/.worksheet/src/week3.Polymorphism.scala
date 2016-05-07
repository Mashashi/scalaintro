package week3

object Polymorphism {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
  println("Welcome to the Scala worksheet")}
}

trait List[T] {
	def isEmpty: Boolean
	def head: T
	def tail: List[T]
}

// val on the constructor just says the type constructor
// should also be a attribute of the class
class Cons[T](val head: T, val tail: List[T]) extends List[T]{
	def isEmpty = false
}

class Nil[T] extends List[T]{
	def isEmpty = true
	def head: Nothing = throw new NoSuchElementException("Nil.head")
	def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}

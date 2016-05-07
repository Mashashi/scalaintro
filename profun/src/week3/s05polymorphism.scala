package week3

object s05polymorphism extends App{
  
  def singleton[T](elem:T) = new Cons(elem, new Nil[T])
  
  println(singleton(1))
  
  def nth[T](n: Int, xs: List[T]): T = {
      require(!xs.isEmpty, "OutOfBounds")
      if(n==0) xs.head else nth(n-1, xs.tail)
  }
  
  println( nth(2,new Cons(1, new Cons(2, new Cons(3, new Nil)))) )
  
  nth(10,new Cons(1, new Cons(2, new Cons(3, new Nil))))
  
  
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
	override def toString = head+""
}

class Nil[T] extends List[T]{
	def isEmpty = true
	def head: Nothing = throw new NoSuchElementException("Nil.head")
	def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}
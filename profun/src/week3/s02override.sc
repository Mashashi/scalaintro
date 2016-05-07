package de

object s02override {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  abstract class Base {
  	def foo = 1
  	def bar: Int
  }
  
  class Sub extends Base {
  	
  	//def foo = 2
  	override def foo = 2
  	//override def foo2 = 2
  	
  	/*override */ /*is optional*/ def bar = 3
  	
  }
}
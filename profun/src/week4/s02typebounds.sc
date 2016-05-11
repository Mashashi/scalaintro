package week4

import week3.IntSet
import week3.NonEmpty

object s02typebounds {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  /*
  Lower bound
  Upper bound
  Lower upper bound
  Covariance
  	Types in java are covariant
  	Types usually can be covariant when they are immutable
  	Types can be
  		covariant
  			class C[+A] { ... }
  		contravariant
  			class C[-A] { ... }
  		nonvariant
  			class C[A] { ... }
  */
  
  /*
  
  Say you have two function types:
  
	  type A = IntSet => NonEmpty
	  type B = IntSet => NonEmpty
  
  According to the Liskov Substitution Principle, which
  of the following should be true?
  
	  A <: B
	  B <: A
	  A and B are unrelated
  
  */
  
  /*
  In functions... are contravariant in their argument types and covariant in their result type.
  
	  package scala
	  trait Function[-T, +U]{
	  	def apply(x: T) : U
	  }
	  
	We can not use the variance modifiers(+,-) as we please... The rules are roughly...
	- covariant type parameters can only appear in method results
	- contravariant type parameters can only appear in method parameters
	- invariant type parameters can appear anywhere
  */
  
}
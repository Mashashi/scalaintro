package de

object s01hierarchyandobjects {
  println("Welcome to the Scala worksheet")
  
  //val t1 = new NonEmpty(3, new Empty, new Empty)
  val a1 = new NonEmpty(3, Empty, Empty)
  val a2 = a1 incl 4
  
  val b1 = new NonEmpty(2, Empty, Empty)
  val b2 = b1 incl 5
  val b3 = b2 incl 1
  
  a2 union b3
}
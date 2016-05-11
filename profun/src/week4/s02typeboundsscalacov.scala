package week4

import week3.{Empty, NonEmpty, IntSet}

object s02typeboundsscalacov extends App{
  val a: Array[NonEmpty] = Array(new NonEmpty(1, Empty, Empty))
  //val b: Array[IntSet] = a
  
  /*
  Types in scala are not covariant to make them we can use:
     val b: Array[_<:IntSet] = a
  But on contrary of java a error will still occur in 
  compile time in the next line of code
  */
  
  //b(0) = Empty
  val s: NonEmpty =a(0)
}
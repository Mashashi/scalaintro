package week3

import week2._ // Import all classes in de package. This is a wild card.

// Imports Empty and NonEmpty classes.
// This is a named import.
//import de.{Empty, NonEmpty}


// Imports can be made from either a package or a object


//--

// All member of pkg scala
// All member of pkg java.lang
// All member of pkg scala.Predef

// Int      scala.Int
// Boolean  scala.Boo1ean
// Object   java.lang.Object
// require  scala.Predef.require
// assert   scala.Predef.assert

// More info: scala-lang.org/api/current/

object s03organization {
  
  def main(args : Array[String]) : Unit= {
    println("hey")
    println(new week2.Rational(1,2))
    println(new Rational(1,2))
    
  }
  
}
package week4

object s04hierarchydecomposition {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(93); 
  println("Welcome to the Scala worksheet")
  
  // x.isInstanceOf[T]
  // x.asInstanceOf[T]
  
  /*
  Attempts seen:
  - classification and access methods (kind of visior)
  - type tests and casts: unsafe, low-level (kind of visior)
  - object-oriented decomposition: does (kind of composit)
  not always work, need to touch all classes
  to add a new method.
 	*/
 	
 	// https://en.wikipedia.org/wiki/Decomposition_(computer_science)
 	
 	// Case Classes
 	trait Expr
 	case class Number(val n : Int) extends Expr
 	case class Sum(e1: Expr, e2: Expr) extends Expr;$skip(1156); 
 	
 	// These objects are defined automatically...
 	// object Number { def apply(n: Int) = new Number(n) }
 	// object Sum { def apply(e1: Expr, e2: Expr) = new Sum(e1, e2) }
 	
 	// Rules for pattern matching code...
 	// 1. Match is followed by a sequence of cases, pat => expr
 	// 2. Each case associates an expression expr with a pattern pat
 	// 3. A MatchError exception is thrown if no pattern matches the value of the selector
 	// Note that pattern matching combines type chekcing and casting in a single structure
 	// With this we can have more security that cast type exceptions will not occur
 	
 	val Num = Number(1);System.out.println("""Num  : week4.s04hierarchydecomposition.Number = """ + $show(Num ));$skip(147); 
 	def eval(e : Expr) : Int = e match{
 		case Number(n) => n
 		case Sum(e1, Num) if Num.n ==1 => 1
 		case Sum(e1, e2) => eval(e1) + eval(e2)
 	};System.out.println("""eval: (e: week4.s04hierarchydecomposition.Expr)Int""");$skip(36); val res$0 = 
 	
 	eval(Sum(Number(5),Number(1)));System.out.println("""res0: Int = """ + $show(res$0))}
 	
 	/*
 	Sum(Number(5),Number(1)) match{
 		case Number(n) => n
 		case Sum(e1, e2) => eval(e1) + eval(e2)
 	}
 	*/
 	
 	/*
 	Patterns are constructed from:
 	+ constructors, e.g. Number, Sum
 	+ variables, e.g. n, e1, e2 (Always begin with lower case)
 	+ wildcard patterns _,
 	+ constants 1, true, val N = ... (contants must be upper case except for null, true, false)
 	Remarks:
 	+ Same variable can only appear once in a pattern
 	*/
 	
 	// Object decomposition as a method of the base class
 	/*trait Expr {
 		def eval: Int = this match {
 			case Number(n) => n
 			case Sum(e1, e2) => e1.eval + e2.eval
 		}
 	}
 	// Now when we want to add a new method we just have to change the base trait
 	// We can also mixin traits so we don't have to violate the open close principle
 	*/
}

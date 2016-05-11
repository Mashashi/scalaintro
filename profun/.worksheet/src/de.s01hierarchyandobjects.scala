package de

object s01hierarchyandobjects {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(87); 
  println("Welcome to the Scala worksheet");$skip(95); 
  
  //val t1 = new NonEmpty(3, new Empty, new Empty)
  val a1 = new NonEmpty(3, Empty, Empty);System.out.println("""a1  : <error> = """ + $show(a1 ));$skip(21); 
  val a2 = a1 incl 4;System.out.println("""a2  : <error> = """ + $show(a2 ));$skip(44); 
  
  val b1 = new NonEmpty(2, Empty, Empty);System.out.println("""b1  : <error> = """ + $show(b1 ));$skip(21); 
  val b2 = b1 incl 5;System.out.println("""b2  : <error> = """ + $show(b2 ));$skip(21); 
  val b3 = b2 incl 1;System.out.println("""b3  : <error> = """ + $show(b3 ));$skip(17); val res$0 = 
  
  a2 union b3;System.out.println("""res0: <error> = """ + $show(res$0))}
}

package week4

object s05lists {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(76); 
  println("Welcome to the Scala worksheet");$skip(152); 
  // lists...
  // are immutable and recursive
  // they are built using Cons cells
  
  
  val identityMat = List(List(1,0,0),List(0,1,0),List(0,0,1));System.out.println("""identityMat  : List[List[Int]] = """ + $show(identityMat ));$skip(121); 
  //val fruit = List("apples", "oranges", "pears")
  
  
  val fruit = "apples" :: ("oranges" :: ("pears" :: scala.Nil));System.out.println("""fruit  : List[String] = """ + $show(fruit ));$skip(50); 
  val nums1 = 1 :: (2 :: (3 :: (4 :: scala.Nil)));System.out.println("""nums1  : List[Int] = """ + $show(nums1 ));$skip(225); 
  // Note that operators ending in : start to evaluate from the right
  // So the paranthesis are unnecessary
  // Remark the fisrt object where the cons is applied as to be a list
  val nums2 = 1 :: 2 :: 3 :: 4 :: scala.Nil;System.out.println("""nums2  : List[Int] = """ + $show(nums2 ));$skip(48); 
  val nums3 = scala.Nil.::(4).::(3).::(2).::(1);System.out.println("""nums3  : List[Int] = """ + $show(nums3 ));$skip(24); 
  val empty = scala.Nil;System.out.println("""empty  : scala.collection.immutable.Nil.type = """ + $show(empty ))}
  
  // tail
  // isEmpty
  // head - calling on an empty list gives NoSuchElementException
  
  /*
  It is also possible to decompose lists into List Patterns...
  Nil
  p :: ps
  List(p1, ..., pn) same as p1 :: ... :: pn :: Nil
  */
  
}

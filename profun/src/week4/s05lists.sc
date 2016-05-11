package week4

object s05lists {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  // lists...
  // are immutable and recursive
  // they are built using Cons cells
  
  
  val identityMat = List(List(1,0,0),List(0,1,0),List(0,0,1))
                                                  //> identityMat  : List[List[Int]] = List(List(1, 0, 0), List(0, 1, 0), List(0, 
                                                  //| 0, 1))
  //val fruit = List("apples", "oranges", "pears")
  
  
  val fruit = "apples" :: ("oranges" :: ("pears" :: scala.Nil))
                                                  //> fruit  : List[String] = List(apples, oranges, pears)
  val nums1 = 1 :: (2 :: (3 :: (4 :: scala.Nil))) //> nums1  : List[Int] = List(1, 2, 3, 4)
  // Note that operators ending in : start to evaluate from the right
  // So the paranthesis are unnecessary
  // Remark the fisrt object where the cons is applied as to be a list
  val nums2 = 1 :: 2 :: 3 :: 4 :: scala.Nil       //> nums2  : List[Int] = List(1, 2, 3, 4)
  val nums3 = scala.Nil.::(4).::(3).::(2).::(1)   //> nums3  : List[Int] = List(1, 2, 3, 4)
  val empty = scala.Nil                           //> empty  : scala.collection.immutable.Nil.type = List()
  
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
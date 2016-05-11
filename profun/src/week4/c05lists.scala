package week4
object c05lists extends App{
  
  def isort(xs: scala.List[Int]) : scala.List[Int] = xs match {
  	case List() => 
  	  scala.Nil
  	case y :: ys => 
  	  insert(y, isort(ys))
  }
  def insert(x: Int, xs: scala.List[Int]) : scala.List[Int] = xs match{
  	case List() => 
  	  x :: xs
  	case y :: ys if (x < y) => 
  	  x :: xs
  	case y :: ys if (x > y) => 
  	  y :: insert(x, ys)
  }                                               
  
  println(isort(1 :: 2 :: -1 :: scala.Nil))
  
  println(1 :: 2 :: -1 :: scala.Nil)       
  println(scala.Nil.::(1))
  
}
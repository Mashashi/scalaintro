package de

import scala.annotation.tailrec

object s01 {
  println("Welcome to the Scala worksheet")
  
  
  /*
  def sum(f : Int => Int, a : Int, b : Int) : Int = {
  	if(a>b) 0 else f(a) + sum(f,a+1,b)
  }
  def id(i:Int) : Int = { i }
  sum(id, 1, 2)
  sum({(x:Int)=>2*x}, 1, 2)
  sum((x:Int)=>2*x, 1, 2)
  sum({x=>2*x}, 1, 2)
  sum(x=>2*x, 1, 2)
  */
  
  /*
  def sum(f : (Int, Int) => Int, a : Int, b : Int) : Int = {
  	if(a>b) 0 else f(a, a+1) + sum(f,a+1,b)
  }
  //sum({(x:Int, s:Int)=>2*x}) // Hear we cannot partially define the function
  sum({(x:Int, s:Int)=>2*x}, 1, 2)
  sum((x:Int, s:Int)=>2*x, 1, 2)
  sum({(x,s)=>2*x}, 1, 2)
  sum((x,s)=>2*x, 1, 2)
  sum((x,_)=>2*x, 1, 2)
  */
  
  @tailrec
  def sum(f: Int => Int, a: Int,b: Int) : Int = {
  	def loop(a: Int, acc: Int): Int ={
  		if(a>b) acc
  		else loop(a+1,acc+f(a))
  	}
  	loop(a,0)
  }
  sum(x=>1, 1,3)
  
  /*
  @tailrec
  def sum(f: Int => Int)(a: Int,b: Int) : Int = {
  	def loop(a: Int, acc: Int): Int ={
  		if(a>b) acc
  		else loop(a+1,acc+f(a))
  	}
  	loop(a,0)
  }
  sum(x=>1)(1,3)
  // sum(x=>1)_ // The _ denotes a partially applied function
  */
  
}
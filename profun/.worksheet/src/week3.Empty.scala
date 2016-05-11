package week3

/*
class Empty extends IntSet {
	def contains(x: Int): Boolean = false
	def incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty)
	override def toString = "."
}
*/

// We just need a single obj to represent Empty
// Its overkill to have several instances
// No other instances of Empty can be (or need to be created)
// Singletion objects are values, so Empty evaluates to itself
object Empty extends IntSet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(470); 
	def contains(x: Int): Boolean = false;System.out.println("""contains: (x: Int)Boolean""");$skip(58); 
	def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty);System.out.println("""incl: (x: Int)<error>""");$skip(92); 
	def union(other: IntSet) : IntSet ={
		//println(this+" u "+other +" = "+other)
		other
	};System.out.println("""union: (other: <error>)<error>""");$skip(29); 
	override def toString = ".";System.out.println("""toString: ()String""")}
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
	def contains(x: Int): Boolean =
		if (x < elem) left contains x
		else if (x > elem) right contains x
		else true
		
	def incl(x: Int): IntSet ={
		//println("(" + this + " i "+elem)
		if (x < elem)
			new NonEmpty(elem, left incl x, right)
		else if (x > elem)
			new NonEmpty(elem, left, right incl x)
		else this
	}
	// The solution for this is not trivial
	// The idea is to reduce the build of the union tree to a set of incl calls
	// Note that the recursive call is the outermost one
	def union(other: IntSet) : IntSet ={
		//println("(" + this +" u "+ other +")")
		//println("((" + left+" u "+ right +") u "+other+") i "+elem)
		((left union right) union other) incl elem
	}
	
	override def toString = "{" + left + elem + right + "}"

}

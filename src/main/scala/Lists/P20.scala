/*
P20 (*) Remove the Kth element from a list.
Return the list and the removed element in a Tuple. Elements are numbered from 0.
Example:

scala> removeAt(1, List('a, 'b, 'c, 'd))
res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
 */

package Lists

object P20 {
  def removeAt[A](pos: Int, list: List[A]): (List[A], A) = {
    if (list.isEmpty) throw new NoSuchElementException
    else (pos, list) match {
      case (_, Nil) => throw new NoSuchElementException
      case (0, _) => (list.tail, list.head)
      case (_, _) => {
        val (a,b) = removeAt(pos - 1, list.tail)
        (list.head :: a, b)
      }
    }
  }

  /*
  // Not using pattern matching
  def removeAt[A](pos: Int, list: List[A]): (List[A], A) = {
    if (list.isEmpty) throw new NoSuchElementException
    else if (pos > 0) {
      val result = removeAt(pos - 1, list.tail)
      (list.head :: result._1, result._2)
    }
    else (list.tail, list.head)
  }
  */
}

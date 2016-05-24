/*
P21 (*) Insert an element at a given position into a list.
Example:
scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
 */

package Lists

object P21 {
  def insertAt[A](toInsert: A, pos: Int, list: List[A]): List[A] = {
    if (pos < 0) throw new NoSuchElementException
    else (pos, list) match {
      case (0, _) => toInsert :: list
      case (_, Nil) => throw new IndexOutOfBoundsException
      case (_, h :: tail) => h :: insertAt(toInsert, pos - 1, tail)
    }
  }

  /*
  // Using built-in
  def insertAt[A](e: A, n: Int, ls: List[A]): List[A] = ls.splitAt(n) match {
    case (pre, post) => pre ::: e :: post
  }
   */
}

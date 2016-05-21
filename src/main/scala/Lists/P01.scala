/*
P01 (*) Find the last element of a list.
Example:
scala> last(List(1, 1, 2, 3, 5, 8))
res0: Int = 8
 */

package Lists

object P01 {
  // A is generic
  def last2[A](list: List[A]): A =
    if (list.tail.isEmpty) list.head
    else last(list.tail)


  def last[A](list: List[A]): A = list match {
    case head :: Nil => head
    case head :: tail => last(tail)
    case Nil => throw new Exception
  }
}

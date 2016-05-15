/*
P03 (*) Find the Kth element of a list.
By convention, the first element in the list is element 0.
Example:

scala> nth(2, List(1, 1, 2, 3, 5, 8))
res0: Int = 2
 */

package Problems

object P03 {
  def nth[A](n: Int, list: List[A]): A = (n, list) match {
    case (0, h :: _)    => h
    case (n, _ :: tail) => nth(n - 1, tail)
    case (_, Nil)       => throw new Exception
  }
}

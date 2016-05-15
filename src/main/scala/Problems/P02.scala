/*
P02 (*) Find the last but one element of a list.
Example:
scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5
 */

package Problems

object P02 {
  def penultimate[A](list: List[A]): A = list match {
    case head :: _ :: Nil => head
    case _ :: tail => penultimate(tail)
    case _ => throw new Exception
  }
}

/*
P22 (*) Create a list containing all integers within a given range.
Example:
scala> range(4, 9)
res0: List[Int] = List(4, 5, 6, 7, 8, 9)
 */

package Lists

object P22 {
  // Classic functional approach is to unfold (unimplemented)
  def unfoldRight[A, B](s: B)(f: B => Option[(A, B)]): List[A] =
    f(s) match {
      case None => Nil
      case Some((r,n)) => r :: unfoldRight(n)(f)
    }
  def range(start: Int, end: Int): List[Int] = {
    unfoldRight(start) { n =>
      if (n > end) None
      else Some((n, n + 1))
    }
  }

  /*
  // 2nd Attempt with folding
  def range(begin: Int, end: Int): List[Int] = {
    (begin to end).foldRight(List[Int]())((a,b) => a :: b)
  }
  */

  // Original Attempt
  /*
  def range(start: Int, end: Int): List[Int] = {
    if (start > end) Nil
    else start :: range(start + 1, end)
  }
  */

  // Builtin
  //def range(start: Int, end: Int): List[Int] = List.range(start, end + 1)
}

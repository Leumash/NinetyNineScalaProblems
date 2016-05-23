/*
P08 (**) Eliminate consecutive duplicates of list elements.
If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
Example:

scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
 */

package Lists

object P08 {
  def compress[A](list: List[A]): List[A] = {
    list.foldRight(List[A]())((left, accum) =>
      if (accum.isEmpty || accum.head != left) left :: accum else accum)
  }

  /*
  // Recursive
  def compress[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case h :: Nil => h :: Nil
    case h1 :: h2 :: tail => if (h1 == h2) compress(h2 :: tail) else h1 :: compress(h2 :: tail)
  }
  */
}

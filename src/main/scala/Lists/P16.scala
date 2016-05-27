/*
P16 (**) Drop every Nth element from a list.
Example:
scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
 */

package Lists

object P16 {
  def drop[A](n: Int, list: List[A]): List[A] = {
    def dropRecursive[A](current: Int, list: List[A]): List[A] = (current, list) match {
      case (_, Nil) => Nil
      case (1, _ :: tail) => dropRecursive(n, tail)
      case (_, h :: tail) => h :: dropRecursive(current - 1, tail)
    }
    dropRecursive(n, list)
  }
}

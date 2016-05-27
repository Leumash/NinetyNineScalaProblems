package Lists

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import P16._

@RunWith(classOf[JUnitRunner])
class P16Test extends FunSuite {
  test("drop 1 from List() returns List()") {
    assert(drop(1, List()) === List())
  }

  test("drop 1 from List(1, 2) returns List()") {
    assert(drop(1, List(1,2)) === List())
  }

  test("drop 2 from List(1) returns List(1)") {
    assert(drop(2, List(1)) === List(1))
  }

  test("drop 3 from List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k) returns List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)") {
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    val expected = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
    val result = drop(3, list)

    assert(result === expected)
  }
}

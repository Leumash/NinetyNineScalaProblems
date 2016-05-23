package Lists

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import P08._

@RunWith(classOf[JUnitRunner])
class P08Test extends FunSuite {
  test("compress List() returns List()") {
    assert(compress(List()) === List())
  }

  test("compress List(1) returns List(1)") {
    assert(compress(List(1)) === List(1))
  }

  test("compress List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e) returns List('a, 'b, 'c, 'a, 'd, 'e)") {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val expected = List('a, 'b, 'c, 'a, 'd, 'e)

    val result = compress(list)

    assert(result === expected)
  }

}

package Lists

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import P20._

@RunWith(classOf[JUnitRunner])
class P20Test extends FunSuite {
  test("removeAt 0 for List() throws exception") {
    intercept [NoSuchElementException] {
      removeAt(0, List())
    }
  }

  test("removeAt 0 for List(1) returns (List(), 1)") {
    assert(removeAt(0, List(1)) === (List(), 1))
  }

  test("removeAt 1 for List('a, 'b, 'c, 'd) returns (List('a, 'c, 'd),'b)") {
    val list = List('a, 'b, 'c, 'd)
    val expected = (List('a, 'c, 'd),'b)

    val result = removeAt(1, list)

    assert(result === expected)
  }
}

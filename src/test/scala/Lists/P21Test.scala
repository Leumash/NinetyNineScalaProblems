package Lists

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import P21._

@RunWith(classOf[JUnitRunner])
class P21Test extends FunSuite {
  test("insertAt position 1 for List() throws IndexOutOfBoundsException") {
    intercept[IndexOutOfBoundsException] {
      insertAt('a, 1, List())
    }
  }

  test("insertAt for 1 at position 0 for List() returns List(1)") {
    assert(insertAt(1, 0, List()) === List(1))
  }

  test("insertAt('new, 1, List('a, 'b, 'c, 'd) returns List('a, 'new, 'b, 'c, 'd)") {
    val list = List('a, 'b, 'c, 'd)
    val expected = List('a, 'new, 'b, 'c, 'd)

    val result = insertAt('new, 1, list)

    assert(result === expected)
  }
}

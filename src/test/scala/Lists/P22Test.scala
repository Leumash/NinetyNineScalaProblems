package Lists

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

import P22._

@RunWith(classOf[JUnitRunner])
class P22Test extends FunSuite {
  test("range(0, -1) returns List()") {
    assert(range(0, -1) === List())
  }

  test("range(0, 0) returns List(0)") {
    assert(range(0,0) === List(0))
  }

  test("range(4, 9) returns List(4, 5, 6, 7, 8, 9)") {
    val expected = List(4, 5, 6, 7, 8, 9)
    val result = range(4,9)
    assert(result === expected)
  }
}

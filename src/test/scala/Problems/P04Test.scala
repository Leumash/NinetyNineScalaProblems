package Problems

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import P04._

@RunWith(classOf[JUnitRunner])
class P04Test extends FunSuite {
  test("length of empty List is 0") {
    assert(length(List()) === 0)
  }

  test("length of List(1) is 1") {
    assert(length(List(1)) === 1)
  }

  test("length of List(1,2) is 2") {
    assert(length(List(1,2)) === 2)
  }
}

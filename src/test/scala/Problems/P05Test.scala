package Problems

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import P05._

@RunWith(classOf[JUnitRunner])
class P05Test extends FunSuite {
  test("reverse of empty List returns empty List") {
    assert(reverse(List()) === List())
  }

  test("reverse of List(1) returns List(1)") {
    assert(reverse(List(1)) === List(1))
  }

  test("reverse of List(1,2) returns List(2,1)") {
    assert(reverse(List(1,2)) === List(2,1))
  }
}

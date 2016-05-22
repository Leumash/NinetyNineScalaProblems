package Lists

import Lists.P03._
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P03Test extends FunSuite {
  test("nth of empty list throws exception") {
    intercept[Exception] {
      nth(0, List())
    }
  }

  test("neth for n < 0 throws exception") {
    intercept[Exception] {
      nth(-1, List(1))
    }
  }

  test("nth for n > list.length throws exception") {
    intercept[Exception] {
      nth(2, List(1))
    }
  }

  test("nth for n=0 of List(1) returns 1") {
    assert(nth(0, List(1)) === 1)
  }

  test("nth for n=0 of List(1,2) returns 1") {
    assert(nth(0, List(1,2)) === 1)
  }

  test("nth for n=1 of List(1,2) returns 2") {
    assert(nth(1, List(1,2)) === 2)
  }

  test("nth for n=1 of List(1,2,3) returns 2") {
    assert(nth(1, List(1,2,3)) === 2)
  }
}

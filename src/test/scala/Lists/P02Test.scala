package Lists

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import P02._

@RunWith(classOf[JUnitRunner])
class P02Test extends FunSuite {
  test("penultimate of empty List throws exception") {
    intercept[Exception] {
      penultimate(List())
    }
  }

  test("penultimate of List of size one throws exception") {
    intercept[Exception] {
      penultimate(List(1))
    }
  }

  test("penultimate of List(1,2) returns 1") {
    assert(penultimate(List(1,2)) === 1)
  }

  test("penultimate of List(1,2,3) return 2") {
    assert(penultimate(List(1,2,3)) === 2)
  }
}


package Lists

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import P01._

@RunWith(classOf[JUnitRunner])
class P01Test extends FunSuite {
  //test("pending") (pending)
  test("last of empty List throws NoSuchElementException") {
    intercept[NoSuchElementException] {
      last(List())
    }
  }

  test("last of List(1) is 1") {
    assert(last(List(1)) === 1)
  }

  test("last of List(1,2) is 2") {
    assert(last(List(1,2)) === 2)
  }

  test("last of List('hello', 'goodbye') is 'goodbye'") {
    assert(last(List("hello", "goodbye")) === "goodbye")
  }
}

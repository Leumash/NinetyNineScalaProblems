package Lists

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import P06._

@RunWith(classOf[JUnitRunner])
class P06Test extends FunSuite {
  test("List() is a palindrome") {
    assert(isPalindrome(List()))
  }

  test("List(1) is a palindrome") {
    assert(isPalindrome(List(1)))
  }

  test("List(1,1) is a palindrome") {
    assert(isPalindrome(List(1,1)))
  }

  test("List(1,2) is not a palindrome") {
    assert(!isPalindrome(List(1,2)))
  }
}

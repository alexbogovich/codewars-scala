package io.github.alexbogovich.alforder

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, Matchers}


@RunWith(classOf[JUnitRunner])
class OrderTest extends FlatSpec with Matchers {
  "isAlphabetic" should "return true for strings in alphabetical order" in {
    assert(!Order.isAlphabetic("asd"))
    assert(!Order.isAlphabetic("codewars"))
    assert(Order.isAlphabetic("door"))
    assert(Order.isAlphabetic("cell"))
    assert(Order.isAlphabetic("z"))
    assert(Order.isAlphabetic(""))
  }
}
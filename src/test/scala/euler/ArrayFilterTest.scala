package scala.euler

import org.scalatest.FunSpec
import org.scalatest.BeforeAndAfter

class ArrayFilterTest extends FunSpec with BeforeAndAfter {
  var arrFilter: ArrayFilter = _

  describe("ArrayFilter") {
    before {
      arrFilter = new ArrayFilter(10)
    }

    it("should create an array") {
      assert(arrFilter.preparedArray === Array.range(1,10))
    }

    it("should return sum of filtered elements") {
      assert(arrFilter.sum === 23)
    }
  }

  describe("Euler task") {
    it("should return correct value") {
      arrFilter = new ArrayFilter(1000)

      assert(arrFilter.sum === 233168)
    }
  }
}

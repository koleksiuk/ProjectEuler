package scala.euler

import org.scalatest.FunSpec

class PrimeTest extends FunSpec {
  var primes : List[Long] = _

  describe("Prime") {
    it("should return error if argument < 2") {
      intercept[IllegalArgumentException] {
        primes = (new Prime).primesUnder(1)
      }
    }
    it("should return primes list") {
      primes = (new Prime).primesUnder(10)

      assert(primes === List[Long](2,3,5,7))
    }

    describe(".findLargestFactor") {
      it("should return the last element of the list") {
        val prime = (new Prime).findLargestFactor(30)
        assert(prime === 5)
      }
    }
  }
}

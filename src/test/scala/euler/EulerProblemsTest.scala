package scala.euler

import org.scalatest.FunSpec

class EulerProblemsTest extends FunSpec {
  describe("Problem 1") {
    it("should be equal 233168") {
      assert(new ArrayFilter(1000).sum === 233168)
    }
  }

  describe("Problem 2") {
    it("should be equal 4613732") {
      assert(new FibonacciSequence(4000000).even().sum == 4613732)
    }
  }

  describe("Problem 3") {
    it("should be equal 6857") {
      println("test")
      assert(new Prime().findLargestFactor(600851475143L) == 6857)
    }
  }
}

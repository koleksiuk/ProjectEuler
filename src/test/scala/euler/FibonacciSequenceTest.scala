package scala.euler

import org.scalatest.FunSpec
import org.scalatest.BeforeAndAfter


class FibonacciSequenceTest extends FunSpec with BeforeAndAfter {
  var sequence : FibonacciSequence = _

  describe("FibonacciSequence") {
    before {
      sequence = new FibonacciSequence(10)
    }

    it("should return array of next numbers basing on constructor") {
      assert(sequence.array === Array(1, 1, 2, 3, 5, 8))
    }

    it("should throw an exception for 0 or less as argument") {
      intercept[IllegalArgumentException] {
        new FibonacciSequence(0)
      }
    }

    describe(".even") {
      it("should return even values of sequence") {
        assert(sequence.even === Array(2, 8))
      }
    }
  }
}

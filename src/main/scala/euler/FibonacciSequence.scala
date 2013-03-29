package scala.euler

/*
 * Task: http://projecteuler.net/problem=2
 * Description: By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 *              find the sum of the even-valued terms.
 */


class FibonacciSequence(n: Int) {
  if (n <= 0)
    throw new IllegalArgumentException

  var array = Array[Int](1, 1)

  while (this.sumLast() <= n) {
    this.push(this.sumLast())
  }

  def even() : Array[Int] = {
    array.filter(_ % 2 == 0)
  }

  private def push(next: Int) {
    array = array ++ Array(next)
  }

  private def sumLast() : Int = {
    this.array.last + this.array(this.array.size - 2)
  }
}

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
  var i = 2

  while (array(i-1) + array(i-2) <= n) {
    this.push(array(i-1) + array(i-2))
    i += 1
  }

  def even() : Array[Int] = {
    array.filter(_ % 2 == 0)
  }

  private def push(next: Int) {
    array = array ++ Array(next)
  }
}

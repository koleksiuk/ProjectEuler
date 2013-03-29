package scala.euler

/*
 * Task: http://projecteuler.net/problem=1
 * Description: Find the sum of all the multiples of 3 or 5 below 1000.
 */

class ArrayFilter(n: Int) {
  val preparedArray = Array.range(1, n)

  // Public
  def sum : Int = {
    return this.filterArray.sum
  }

  private def filterArray : Array[Int] = {
    return this.preparedArray.filter(x => (x % 3 == 0 || x %  5 == 0))
  }
}

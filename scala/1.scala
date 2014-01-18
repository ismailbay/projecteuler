/** Problem 1
  *
  * Find the sum of all the multiples of 3 or 5 below 1000.
  *
  */
object Euler1 {
  def main(args: Array[String]) {
    println((0 until 1000) filter(n => (n % 3 == 0 || n % 5 == 0)) reduce(_ + _))
  }
}

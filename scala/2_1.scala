/** Problem 2
  * 
  * sequence starts with: 1, 2, 3, 5, 8, ...
  *
  * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
  *
  */ 
object Euler2 {
  def main(args: Array[String]) {
    def fibFrom(a:Int, b:Int): Stream[Int] = a #:: fibFrom(b, a+b)

    println(fibFrom(1, 2).takeWhile(_ < 4000000).filter(_ % 2 ==0).sum)
  }
}

/** Problem 2
  * 
  * sequence starts with: 1, 2, 3, 5, 8, ...
  *
  * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
  *
  */ 
object Euler2 {
  def main(args: Array[String]) {
    var fib1 = 1
    var fib2 = 2

    var fibList = List(fib1, fib2);

    while (fib1 + fib2 < 4000000) {
      fibList = fibList :+ (fib1 + fib2)
      fib1 = fib2
      fib2 = fibList.last
    }

    fibList = fibList filter (_ % 2 == 0)
    println(fibList.sum)
  }                             
}

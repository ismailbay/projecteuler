/** Problem 3
  *
  * What is the largest prime factor of the number 600851475143 ?
  *
  */ 
object Euler3 {
  def main(args:Array[String]) {
    def isPrime(n:Int) = (2 until n).forall(n % _ != 0)

    val biggestPrime = (2 until math.sqrt(600851475143L).toInt)
      .filter(600851475143L % _ == 0)
        .filter(isPrime(_)).reverse.head

    println(biggestPrime)
  }
}

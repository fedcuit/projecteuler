import scala.math.sqrt

object Problem3 {
  def largestPrime(n: Long): Long = {
    factors(600851475143L).filter(isPrime).max
  }

  private def isPrime(l: Long): Boolean = factors(l).toList.sorted == List(1L, l)

  private def factors(n: Long) = {
    (for (i <- 1L to (sqrt(n).toInt + 1) if n % i == 0) yield List(i, n / i)).flatten.toSet
  }
}

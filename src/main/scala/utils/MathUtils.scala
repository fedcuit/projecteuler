package utils

import scala.math._

object MathUtils {
  def amicablePair(a: Long): (Long, Long, Boolean) = {
    def d(n: Long = a): Long = {
      factors(n).init.sum
    }
    val b = d(a)
    val c = d(b)
    (a, b, a==c && a!=b)
  }

  def factorial(n: BigInt): BigInt = if (n == BigInt(1)) 1 else n * factorial(n - 1)

  def factors(n: Long): List[Long] = (for (i <- 1L to (sqrt(n).toInt + 1) if n % i == 0) yield List(i, n / i)).flatten.toSet.toList.sorted

  def isPrime(l: Long): Boolean = factors(l) == List(1, l)
}

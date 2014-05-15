import scala.math._

object MathUtils {
  def amicablePair(n: Long): (Long, Long) = {
    val sum = factors(n).init.sum
    (sum, factors(sum).init.sum)
  }

  def factorial(n: BigInt): BigInt = if (n == BigInt(1)) 1 else n * factorial(n - 1)

  def factors(n: Long): List[Long] = (for (i <- 1L to (sqrt(n).toInt + 1) if n % i == 0) yield List(i, n / i)).flatten.toSet.toList.sorted

  def isPrime(l: Long): Boolean = factors(l) == List(1, l)
}

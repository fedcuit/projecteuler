import scala.math._

object MathUtils {
  def factorial(n: Int): Int = if (n == 1) 1 else n * factorial(n - 1)

  def factors(n: Long): List[Long] = (for (i <- 1L to (sqrt(n).toInt + 1) if n % i == 0) yield List(i, n / i)).flatten.toSet.toList

  def isPrime(l: Long): Boolean = factors(l).sorted == List(1, l)
}

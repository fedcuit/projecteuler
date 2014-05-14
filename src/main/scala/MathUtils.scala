import scala.math._

object MathUtils {
  def factors(n: Long) = (for (i <- 1L to (sqrt(n).toInt + 1) if n % i == 0) yield List(i, n / i)).flatten.toSet.toList

  def isPrime(l: Long): Boolean = factors(l).sorted == List(1, l)
}

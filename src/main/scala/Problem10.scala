import utils.MathUtils
import MathUtils._

object Problem10 {
  def sumOfPrimes(n: Long): Long = {
    Iterator.iterate(1L)(_ + 1).takeWhile(_ < n).filter(isPrime).sum
  }
}

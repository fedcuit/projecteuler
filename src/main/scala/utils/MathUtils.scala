package utils

import scala.math._
import utils.WordUtils.beHead

object MathUtils {
  def lexiPermutations(digits: String): List[String] = {
    if (digits.size >= 2) {
      beHead(digits).map(s => {
        lexiPermutations(s.tail).map(s.head + _)
      }).flatten
    } else {
      digits.split("").tail.toList
    }
  }

  def amicablePair(a: Long): (Long, Long, Boolean) = {
    def d(n: Long = a): Long = {
      factors(n).init.sum
    }
    val b = d(a)
    val c = d(b)
    (a, b, a == c && a != b)
  }

  def factorial(n: BigInt): BigInt = if (n == BigInt(1)) 1 else n * factorial(n - 1)

  def factors(n: Long): List[Long] = (for (i <- 1L to (sqrt(n).toInt + 1) if n % i == 0) yield List(i, n / i)).flatten.toSet.toList.sorted

  def isPrime(l: Long): Boolean = factors(l) == List(1, l)

  def fibonacci: Stream[Int] = Stream.cons(1, Stream.cons(2, fibonacci.zip(fibonacci.tail).map(x => x._1 + x._2)))
}

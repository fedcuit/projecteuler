import MathUtils._

object Problem3 {
  def largestPrime(n: Long): Long = {
    factors(600851475143L).filter(isPrime).max
  }
}

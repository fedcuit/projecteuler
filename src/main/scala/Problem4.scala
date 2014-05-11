object Problem4 {
  def largestPalindromic(): Int = {
    (for (x <- 100 to 999; y <- 100 to 999) yield x * y).filter(isPalindromic).max
  }

  def isPalindromic(n: Int) = {
    val s = n.toString
    val half = s.length / 2
    if (s.length % 2 == 0) s.take(half) == s.drop(half).reverse else s.take(half) == s.drop(half + 1).reverse
  }
}

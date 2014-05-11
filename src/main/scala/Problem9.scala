object Problem9 {
  def run() = (for (a <- 1 to 1000; b <- 1 to 1000; c = 1000 - a - b if a * a + b * b == c * c) yield a * b * c).head
}

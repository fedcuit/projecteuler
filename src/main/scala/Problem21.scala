object Problem21 {
  def sumOfNumbers(n: Long): Long = {
    val (left, right, _) = (for (x <- 1L until n; pair = MathUtils.amicablePair(x); if pair._3) yield pair).unzip3
    val distinct: List[Long] = (left.toList ::: right.toList).distinct
    (0L /: distinct)(_ + _)
  }
}

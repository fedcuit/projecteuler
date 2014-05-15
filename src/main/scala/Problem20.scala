object Problem20 {
  def sumOfDigits(n: Int): Long = {
    MathUtils.factorial(n).toString().split("").toList.tail.map(_.toInt).sum
  }
}

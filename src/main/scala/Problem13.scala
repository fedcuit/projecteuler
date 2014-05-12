object Problem13 {
  def first10Digits(numbers: List[BigInt]): String = {
    (BigInt(0) /: numbers)(_ + _).toString().take(10)
  }
}

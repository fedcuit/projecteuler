object Problem17 {
  // 1-9
  def digitToWord(i: Int): String = List.range(1, 10).zip(List("one", "two", "three", "four", "five", "six", "seven", "eight", "nine")).find(i == _._1).get._2

  // 10-11
  def teenDigitToWord(i: Int): String = List.range(10, 20).zip(List("ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen")).find(i == _._1).get._2

  // 20, 30, ..., 90
  def tyDigitToWord(i: Int): String = Iterator.iterate(20)(_ + 10).takeWhile(_ < 100).toList.zip(List("twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety")).find(i == _._1).get._2

  // 21, 22, ..., 99
  def tyDigitAndDigitToWord(tenDigit: Int, digit: Int): String = "%s-%s".format(tyDigitToWord(tenDigit * 10), digitToWord(digit))

  // 100, 200, ..., 900
  def hundredDigitToWord(i: Int): String = digitToWord(i) + " hundred"

  // 10X, 20X, ..., 90X
  def hundredDigitAndDigitToWord(hundredDigit: Int, digit: Int): String = "%s and %s".format(hundredDigitToWord(hundredDigit), digitToWord(digit))

  // 11X, 21X, ..., 91X
  def hundredDigitAndTeenDigitToWord(hundredDigit: Int, digit: Int): String = "%s and %s".format(hundredDigitToWord(hundredDigit), teenDigitToWord(10 + digit))

  // 120, 130, ..., 220, 230, ..., 920, 930
  def hundredDigitAndTyDigitToWord(hundredDigit: Int, tyDigit: Int): String = "%s and %s".format(hundredDigitToWord(hundredDigit), tyDigitToWord(tyDigit * 10))

  // 121, 122, ..., 221, 222, ..., 921, 922
  def hundredDigitAndTyDigitAndDigitToWord(hundredDigit: Int, tyDigit: Int, digit: Int): String = "%s and %s".format(hundredDigitToWord(hundredDigit), tyDigitAndDigitToWord(tyDigit, digit))

  // 1000
  def thousandDigitToWord(i: Int): String = digitToWord(i) + " thousand"

  def writeOutNumberInBritish(s: String): String = {
    val digits = s.split("").drop(1).map(_.toInt).toList
    digits match {
      case List(digit) => digitToWord(digit)
      case List(1, digit) => teenDigitToWord(s.toInt)
      case List(tenDigit, 0) => tyDigitToWord(s.toInt)
      case List(tenDigit, digit) => tyDigitAndDigitToWord(tenDigit, digit)
      case List(hundredDigit, 0, 0) => hundredDigitToWord(hundredDigit)
      case List(hundredDigit, 0, digit) => hundredDigitAndDigitToWord(hundredDigit, digit)
      case List(hundredDigit, 1, digit) => hundredDigitAndTeenDigitToWord(hundredDigit, digit)
      case List(hundredDigit, tyDigit, 0) => hundredDigitAndTyDigitToWord(hundredDigit, tyDigit)
      case List(hundredDigit, tyDigit, digit) => hundredDigitAndTyDigitAndDigitToWord(hundredDigit, tyDigit, digit)
      case List(thousandDigit, 0, 0, 0) => thousandDigitToWord(thousandDigit)
      case _ => "I don't know how to write out %s".format(s)
    }
  }

  def numberOfLetters(start: Int, end: Int): Int = (start to end).map(_.toString).map(writeOutNumberInBritish(_).replaceAll("\\s+|-", "").length).sum
}

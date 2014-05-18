package utils

object WordUtils {
  def beHead(s: String): List[String] = {
    val letters = s.split("").tail.toList
    s :: (1 to s.length - 1).map((i: Int) => {
      val (front, end) = letters.splitAt(i)
      (end.head :: (front.tail ::: front.head :: end.tail).sorted).mkString("")
    }).toList
  }

  def position(c: Char): Int = ('a'.toInt to 'z'.toInt).indexWhere(_ == c.toLower.toInt) + 1
}

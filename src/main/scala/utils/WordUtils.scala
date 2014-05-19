package utils

object WordUtils {
  def continuousCount(s: String, sub: String): Int = {
    val r = """(\d*?)(%s){2,}(\d*?)""".format(sub).r
    s match {
      case r(prefix, cycle, suffix) => (s.length - prefix.length - suffix.length) / sub.length
      case _ => 0
    }
  }

  def beHead(s: String): List[String] = {
    val letters = s.split("").tail.toList
    s :: (1 to s.length - 1).map((i: Int) => {
      val (front, end) = letters.splitAt(i)
      (end.head :: (front.tail ::: front.head :: end.tail).sorted).mkString("")
    }).toList
  }

  def position(c: Char): Int = ('a'.toInt to 'z'.toInt).indexWhere(_ == c.toLower.toInt) + 1

  def longestRecurringCycle(s: String): String = {
    val digits = s.split("").tail
    (digits.size - 2 to digits.size / 2 by -1).map(i => {
      val tail= digits.drop(i).distinct.mkString("")
      (tail, continuousCount(s, tail))
    }).maxBy(_._2)._1
  }
}

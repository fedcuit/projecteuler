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

  def longestRecurringCycle(s: String): (String, Int) = {
    if (s.distinct.size == 1) return (s.head.toString, s.length)
    val digits = s.split("").tail
    (1 to digits.size / 2).map(i => {
      (i + 2 to digits.length).map(p => {
        var slice = digits.slice(i, p).mkString("")
        slice = if (slice.distinct.length == 1) slice.head.toString else slice
        (slice, continuousCount(s, slice))
      }).sortBy(x => -s.indexOf(x._1)).sortBy(_._1.length).sortBy(_._2).last
    }).sortBy(x => -s.indexOf(x._1)).sortBy(_._1.length).sortBy(_._2).last
  }
}

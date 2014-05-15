package utils

object WordUtils {
  def position(c: Char): Int = ('a'.toInt to 'z'.toInt).indexWhere(_ == c.toLower.toInt) + 1
}

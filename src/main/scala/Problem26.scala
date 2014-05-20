import java.math.MathContext
import utils.WordUtils

object Problem26 {
  def longestRecurringCycle: Int = (7 until 1000).map(i => {
    val d = BigDecimal(1, new MathContext(200)) / BigDecimal(i)
    val digits: String = d.toString().split("\\.").last
    val cycle = if (digits.length < 100) ("", 1) else WordUtils.longestRecurringCycle(digits)
    (i, cycle)
  }).maxBy(_._2._1.length)._1
}

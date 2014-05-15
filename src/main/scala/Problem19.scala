import utils.CalendarUtils
import CalendarUtils._

object Problem19 {

  def amountOfSundays(): Int = {
    yearMonthGenerator().takeWhile(t => t._1 <= 2000 && (t._2 <= 12)).toList.init.count(t => dayCalender("%s-%s-%s".format(t._1, t._2, 1)) == 7)
  }
}

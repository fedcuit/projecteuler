object CalendarUtils {
  val normalMonthDay = List(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
  val leapYearMonthDay = List(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

  def daysBetweenYear(year: Int): Int = (1900 until year).map(x => if (isLeapYear(x)) 366 else 365).sum

  def daysBetweenMonth(year: Int, month: Int): Int = if (isLeapYear(year)) leapYearMonthDay.take(month - 1).sum else normalMonthDay.take(month - 1).sum

  def dayCalender(date: String) = {
    val daySeq = Iterator.iterate(1)((x: Int) => if (x == 7) 1 else x + 1)
    val (year, month, day) = parseDate(date)
    val days = daysBetweenYear(year) + daysBetweenMonth(year, month) + day
    daySeq.drop(days - 1).next()
  }

  def isLeapYear(year: Int): Boolean = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0

  def parseDate(date: String): (Int, Int, Int) = {
    val dates = date.split("-").map(_.toInt)
    (dates.head, dates(1), dates.last)
  }

  def yearMonthGenerator(fromYear: Int = 1901, fromMonth: Int = 1): Iterator[(Int, Int)] = Iterator.iterate((fromYear, fromMonth))(t => {
    if (t._2 == 12) (t._1 + 1, 1) else (t._1, t._2 + 1)
  })
}

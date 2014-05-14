import org.scalatest.{ShouldMatchers, FunSpec}

class CalendarUtils$Test extends FunSpec with ShouldMatchers {
  describe("CalendarUtils") {
    it("should able to tell whether a year is leap year") {
      CalendarUtils.isLeapYear(2000) should be(true)
      CalendarUtils.isLeapYear(1900) should be(false)
      CalendarUtils.isLeapYear(1904) should be(true)
    }

    it("should able to parse a date into year, month, day, isLeapYear from a string") {
      CalendarUtils.parseDate("1900-01-05") should equal((1900, 1, 5))
    }

    it("should able to calculate how many days between years") {
      CalendarUtils.daysBetweenYear(1902) should equal(365 * 2)
      CalendarUtils.daysBetweenYear(1905) should equal(365 * 4 + 366)
    }

    it("should able to calculate how many days between months(From Jan to this month)") {
      CalendarUtils.daysBetweenMonth(1902, 8) should equal(List(31, 28, 31, 30, 31, 30, 31).sum)
      CalendarUtils.daysBetweenMonth(1904, 8) should equal(List(31, 29, 31, 30, 31, 30, 31).sum)
    }

    it("should able to tell 1900-01-01 is Monday") {
      CalendarUtils.dayCalender("1900-01-01") should be(1)
    }

    it("should able to tell 1900-01-05 is Friday") {
      CalendarUtils.dayCalender("1900-01-05") should be(5)
    }

    it("should able to tell 1900-08-08 is Wednesday") {
      CalendarUtils.dayCalender("1900-08-08") should be(3)
    }

    it("should able to tell 1903-08-04 is Tuesday") {
      CalendarUtils.dayCalender("1903-08-04") should be(2)
    }

    it("should able to tell 1904-08-09 is Tuesday") {
      CalendarUtils.dayCalender("1904-08-09") should be(2)
    }

    it("should able to generate a sequence of date increased by month") {
      val dates = List((1901, 1), (1901, 2), (1901, 3), (1901, 4), (1901, 5), (1901, 6), (1901, 7), (1901, 8), (1901, 9), (1901, 10), (1901, 11), (1901, 12), (1902, 1))
      CalendarUtils.yearMonthGenerator().take(13).toList should equal(dates)
    }
  }

}

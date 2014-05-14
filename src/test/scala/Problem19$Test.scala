import org.scalatest.{ShouldMatchers, FunSpec}

class Problem19$Test extends FunSpec with ShouldMatchers {
  describe("Problem19") {

    it("should able to find out how many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?") {
      Problem19.amountOfSundays() should equal(171)
    }
  }
}

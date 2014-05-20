import org.scalatest.{ShouldMatchers, FunSpec}

class Problem26$Test extends FunSpec with ShouldMatchers {
  describe("Problem26") {
    it("should able to find the value of d < 1000 for which 1/d contains the longest recurring cycle in its decimal fraction part.") {
      Problem26.longestRecurringCycle should equal(199)
    }
  }
}

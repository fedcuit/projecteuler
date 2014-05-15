import org.scalatest.{ShouldMatchers, FunSpec}

class Problem21$Test extends FunSpec with ShouldMatchers {
  describe("Problem12") {
    it("should able to evaluate the sum of all the amicable numbers under 10000.") {
      Problem21.sumOfNumbers(10000) should equal(31626)
    }
  }
}

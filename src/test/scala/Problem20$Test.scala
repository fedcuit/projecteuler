import org.scalatest.{ShouldMatchers, FunSpec}

class Problem20$Test extends FunSpec with ShouldMatchers {
  describe("Problem20") {
    it("should able to find the sum of the digits in the number 100!") {
      Problem20.sumOfDigits(100) should equal(648)
    }
  }
}

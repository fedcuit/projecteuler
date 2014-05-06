import org.scalatest.{ShouldMatchers, FunSpec}

class Problem1$Test extends FunSpec with ShouldMatchers {
  describe("Problem1") {
    it("should find the sum of all the multiples of 3 or 5 below 1000.") {
      Problem1.sum() should equal(233168)
    }
  }
}

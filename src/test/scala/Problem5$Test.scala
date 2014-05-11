import org.scalatest.{ShouldMatchers, FunSpec}

class Problem5$Test extends FunSpec with ShouldMatchers {
  describe("Problem5") {
    it("should able to find the smallest positive number that is evenly divisible by all of the numbers from 1 to 20") {
      Problem5.smallestNumberOf((1 to 20).toList) should equal(232792560)
    }
  }
}

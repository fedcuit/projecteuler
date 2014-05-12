import org.scalatest.{ShouldMatchers, FunSpec}

class Problem12$Test extends FunSpec with ShouldMatchers {
  describe("Problem12") {
    it("should able to find the value of the first triangle number to have over five hundred divisors") {
      Problem12.highlyDivisibleTriangularNumber should equal(76576500)
    }
  }
}

import org.scalatest.{ShouldMatchers, FunSpec}

class Problem6$Test extends FunSpec with ShouldMatchers {
  describe("Problem6") {
    it("should Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.") {
      Problem6.difference(100) should equal(25164150)
    }
  }
}

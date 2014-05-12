import org.scalatest.{ShouldMatchers, FunSpec}

class Problem10$Test extends FunSpec with ShouldMatchers {
  describe("Problem10") {
    it("should find the sum of all the primes below two million") {
      Problem10.sumOfPrimes(2000000L) should equal(142913828922L)
    }
  }
}

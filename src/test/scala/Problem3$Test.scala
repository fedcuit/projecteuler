import org.scalatest.{ShouldMatchers, FunSpec}

class Problem3$Test extends FunSpec with ShouldMatchers {
  describe("Problem3") {
    it("should able to find the largest prime factor of 600851475143") {
      Problem3.largestPrime(600851475143L) should equal(6857L)
    }
  }
}

import org.scalatest.{ShouldMatchers, FunSpec}

class MathUtils$Test extends FunSpec with ShouldMatchers {
  describe("MathUtils") {
    it("should able to tell whether a number is prime") {
      MathUtils.isPrime(13) should equal(true)
      MathUtils.isPrime(7) should equal(true)
      MathUtils.isPrime(1) should equal(false)
      MathUtils.isPrime(39) should equal(false)
    }

    it("should able to find our all factors of a number") {
      MathUtils.factors(28) should equal(List(1, 2, 4, 7, 14, 28))
    }

    it("should able to calculate n's factorial") {
      MathUtils.factorial(10) should equal(3628800)
    }

    it("should able to generate a possible amicable numbers pair") {
      MathUtils.amicablePair(220) should equal((220, 284, true))
      MathUtils.amicablePair(36) should equal((36, 55, false))
    }
  }
}

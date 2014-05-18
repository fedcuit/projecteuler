package utils

import org.scalatest.{ShouldMatchers, FunSpec}
import utils.MathUtils._

class MathUtils$Test extends FunSpec with ShouldMatchers {
  describe("MathUtils") {
    it("should able to tell whether a number is prime") {
      isPrime(13) should equal(true)
      isPrime(7) should equal(true)
      isPrime(1) should equal(false)
      isPrime(39) should equal(false)
    }

    it("should able to find our all factors of a number") {
      factors(28) should equal(List(1, 2, 4, 7, 14, 28))
    }

    it("should able to calculate n's factorial") {
      factorial(10) should equal(3628800)
    }

    it("should able to generate a possible amicable numbers pair") {
      amicablePair(220) should equal((220, 284, true))
      amicablePair(36) should equal((36, 55, false))
    }

    it("should able to generate a lexicographic permutations") {
      lexiPermutations("012").toList should equal(List("012", "021", "102", "120", "201", "210"))
    }
  }
}

import org.scalatest.{ShouldMatchers, FunSpec}

class Problem4$Test extends FunSpec with ShouldMatchers {
  describe("Problem4") {
    it("should able to tell whether a number is palindromic") {
      Problem4.isPalindromic(9009) should be(true)
      Problem4.isPalindromic(9000) should be(false)
      Problem4.isPalindromic(90109) should be(true)
    }

    it("should able to tell the largest palindromic number of the product of two 3-digit numbers") {
      Problem4.largestPalindromic() should equal(906609)
    }
  }
}

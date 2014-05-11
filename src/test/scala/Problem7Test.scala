import org.scalatest.{ShouldMatchers, FunSpec}

class Problem7Test extends FunSpec with ShouldMatchers {
  describe("Problem7") {
    it("should able to find the 10001st prime number") {
      Problem7.primeNumber(10001) should equal(104743)
    }
  }
}

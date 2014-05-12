import org.scalatest.{ShouldMatchers, FunSpec}

class Problem14Test extends FunSpec with ShouldMatchers {
  describe("Problem14") {
    it("should able to find the starting number, which under one million, produces the longest chain?") {
      Problem14.startingNumberOfLongestChain should equal(837799L)
    }
  }
}

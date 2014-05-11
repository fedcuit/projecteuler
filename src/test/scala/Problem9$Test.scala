import org.scalatest.{ShouldMatchers, FunSpec}

class Problem9$Test extends FunSpec with ShouldMatchers {
  describe("Problem9") {
    it("should able to find product of abc, one Pythagorean triplet for which a + b + c = 1000") {
      Problem9.run should equal(31875000)
    }
  }
}

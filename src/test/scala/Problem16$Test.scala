import org.scalatest.{ShouldMatchers, FunSpec}
import scala.math.pow

class Problem16$Test extends FunSpec with ShouldMatchers {
  describe("Problem16") {
    it("should able to find out the sum of the digits of the number 2^1000") {
      Problem16.sumOf(BigInt(2).pow(1000).toString()) should equal(15862)
    }
  }
}

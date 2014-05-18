import org.scalatest.{ShouldMatchers, FunSpec}
import scala.math.pow

class Problem24$Test extends FunSpec with ShouldMatchers {
  describe("Problem24") {
    it("should able to find millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9") {
      Problem24.nthLexiPermutation("0123456789", pow(10, 6).toInt) should equal("2783915460")
    }
  }
}

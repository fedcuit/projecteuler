import org.scalatest.{ShouldMatchers, FunSpec}
import scala.collection.mutable
import scala.util.control.Breaks._
import Problem2.fibonacci

class Problem2$Test extends FunSpec with ShouldMatchers {
  describe("Problem2") {
    it("should able to return the first 10 fibonacci numbers") {
      fibonacci.take(10) should be(List(1, 2, 3, 5, 8, 13, 21, 34, 55, 89))
    }

    it("should able to calculate the sum of the even-valued terms for fibonacci numbers whose values do not exceed four million.") {
      var total = new mutable.MutableList[Long]()
      breakable {
        for (x <- 1 to Int.MaxValue) {
          val sum: Long = fibonacci.take(x).sum
          if (sum > 4000000L) break()
          if (sum % 2 == 0) {
            total += sum
          }
        }
      }

      total.sum should equal(4613710L)
    }
  }
}

import org.scalatest.{ShouldMatchers, FunSpec}
import Problem2.fibonacci
import scala.collection.mutable

class Problem2$Test extends FunSpec with ShouldMatchers {
  describe("Problem2") {
    it("should able to return the first 10 fibonacci numbers") {
      fibonacci.take(10) should be(List(1, 2, 3, 5, 8, 13, 21, 34, 55, 89))
    }

    it("should able to calculate the sum of the even-valued terms for fibonacci numbers whose values do not exceed four million.") {
      var total = mutable.MutableList[Int]()

      (1 to Int.MaxValue)
        .takeWhile(x => {// it's tricky to write in this way to break the loop since Scala doesn't have `break`
        val result = fibonacci.take(x).sum
        if (result <= 4000000L && result % 2 == 0) {
          total += result
        }
        result <= 4000000L
      })

      total.sum should equal(4613710L)
    }
  }
}

import org.scalatest.{ShouldMatchers, FunSpec}
import scala.collection.mutable.StringBuilder.newBuilder
import scala.io.{BufferedSource, Source}

class Problem22$Test extends FunSpec with ShouldMatchers {
  describe("Problem22") {
    it("should able to find out the total of all the name scores in the file") {

      val bufferedSource: BufferedSource = Source.fromFile(this.getClass.getResource("names.txt").toURI)
      val lines = bufferedSource.getLines().toList
      bufferedSource.close()

      val names = (newBuilder /: lines)(_ ++= _).toString().split(",").toList
      Problem22.totalScore(names) should equal(871198282)
    }
  }
}

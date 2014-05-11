import scala.collection.Iterator.iterate
import Utils._

object Problem7 {

  def primeNumber(nth: Long): Long = iterate(2L)(_ + 1).filter(isPrime).take(nth.toInt).toList.last
}

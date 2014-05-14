import MathUtils._

object Problem12 {
  def highlyDivisibleTriangularNumber(): Long = {
    Iterator.iterate(1)(_ + 1).map((n: Int) => (1 to n).sum).find(factors(_).length > 500).get
  }
}

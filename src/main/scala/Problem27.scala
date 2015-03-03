import utils.MathUtils.isPrime

object Problem27 {
  def quadraticFormula(n: Long, a: Long, b: Long): Long = n * n + a * n + b

  def consecutivePrimes(a: Long, b: Long): Long = Iterator.iterate(0)(_ + 1).takeWhile(n => isPrime(quadraticFormula(n, a, b))).size

  def run(): Unit = {
    val maxProduct = (
      for (a <- -1000 to 1000; b <- -1000 to 1000)
      yield (consecutivePrimes(a, b), a * b)
      ).maxBy(_._1)

    println(maxProduct)
  }

  def main(args: Array[String]) {
    Problem27.run()
  }
}

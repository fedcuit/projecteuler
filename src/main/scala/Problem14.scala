object Problem14 {
  def startingNumberOfLongestChain(): Long = {
    Iterator.iterate(1L)(_ + 1).takeWhile(_ < 1000000L).map(i => {
      (Iterator.iterate(i)(n => if (n % 2 == 0) n / 2 else 3 * n + 1).takeWhile(_ != 1).length, i)
    }).maxBy(_._1)._2
  }
}

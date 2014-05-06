object Problem2 {
  def fibonacci: Stream[Int] = Stream.cons(1, Stream.cons(2, fibonacci.zip(fibonacci.tail).map(x => x._1 + x._2)))
}

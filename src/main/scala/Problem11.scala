import scala.collection.mutable.ListBuffer

object Problem11 {

  private def greatestOnLine(line: List[Int]) = {
    var mutableLine = ListBuffer[Int]()
    mutableLine ++= line
    (1 to line.length).toList.map(product(_, mutableLine)).max
  }

  private def product(i: Int, mutableLine: ListBuffer[Int]) = {
    val fourNumbers = mutableLine.take(4).toList
    mutableLine.drop(4)
    (1 /: fourNumbers)(_ * _)
  }

  private def greatestInHorizontal(ints: List[List[Int]]) = {
    ints.map(greatestOnLine).max
  }

  private def greatestInVertical(ints: List[List[Int]]) = {
    val columnSize = ints.head.size
    val table = List.range(0, columnSize).map(i => ints.map(_.apply(i)))
    greatestInHorizontal(table)
  }

  private def greatestInRightDiagonal(ints: List[List[Int]]) = {
    (for ((line, lineNo) <- ints.zipWithIndex; (n, columnNo) <- line.zipWithIndex if lineNo <= ints.length - 4 if columnNo <= ints.head.length - 4) yield {
      n * ints(lineNo + 1)(columnNo + 1) * ints(lineNo + 2)(columnNo + 2) * ints(lineNo + 3)(columnNo + 3)
    }).max
  }

  private def greatestInLeftDiagonal(ints: List[List[Int]]) = {
    (for ((line, lineNo) <- ints.zipWithIndex; (n, columnNo) <- line.zipWithIndex if lineNo <= ints.length - 4 if columnNo >= 3) yield {
      n * ints(lineNo + 1)(columnNo - 1) * ints(lineNo + 2)(columnNo - 2) * ints(lineNo + 3)(columnNo - 3)
    }).max
  }

  def greatestProduct(table: List[List[Int]]): Long = {
    val horizontal = greatestInHorizontal(table)
    val vertical = greatestInVertical(table)
    val rightDiagonal = greatestInRightDiagonal(table)
    val leftDiagonal = greatestInLeftDiagonal(table)
    List(horizontal, vertical, rightDiagonal, leftDiagonal).max
  }
}

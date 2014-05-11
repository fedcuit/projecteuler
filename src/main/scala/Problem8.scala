import scala.collection.mutable

object Problem8 {

  def greatest(i: Int, s: String): Int = {
    val tail = s.drop(i)
    var numbers = mutable.MutableList[Char]()
    val digits = mutable.MutableList[Int]()
    numbers ++= tail.toList
    while(!numbers.isEmpty) {
      val fiveDigits = numbers.take(5)
      numbers = numbers.drop(5)
      digits += fiveDigits.mkString.toInt
    }
    digits.max
  }

  def greatestFiveConsecutiveDigits(s: String): Int = List.range(0, s.length).map(greatest(_, s)).max
}

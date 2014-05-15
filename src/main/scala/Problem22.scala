import utils.WordUtils._

object Problem22 {
  def totalScore(names: List[String]): Long = names.sorted.zipWithIndex.map(t => t._1.toCharArray.map(position).sum * (t._2 + 1)).sum
}

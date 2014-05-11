object Problem6 {
  def difference(n: Int): Long = math.pow((1 to n).sum, 2).toInt - (1 to n).map(math.pow(_, 2).toInt).sum
}

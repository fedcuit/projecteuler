object Problem1 {
  def sum(): Int = (1 until 1000).filter(x => x % 5 == 0 || x % 3 == 0).sum
}

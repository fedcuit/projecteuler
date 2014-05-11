
object Problem5 {

  def lcm(x: BigInt, z: BigInt) = x / x.gcd(z) * z

  def smallestNumberOf(ints: List[Int]): Int = (ints.map(BigInt(_)) :\ BigInt(1))(lcm).toInt
}

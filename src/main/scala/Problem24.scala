import utils.MathUtils

object Problem24 {
  def nthLexiPermutation(digits: String, nth: Int) = MathUtils.lexiPermutations(digits).take(nth).last
}

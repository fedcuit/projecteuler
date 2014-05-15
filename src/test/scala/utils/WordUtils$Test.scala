package utils

import org.scalatest.{ShouldMatchers, FunSpec}

class WordUtils$Test extends FunSpec with ShouldMatchers {
  describe("WordUtils") {
    it("should able to figure out the position of a lower case letter in letter table") {
      WordUtils.position('c') should equal(3)
      WordUtils.position('o') should equal(15)
      WordUtils.position('l') should equal(12)
      WordUtils.position('i') should equal(9)
      WordUtils.position('n') should equal(14)
    }

    it("should able to figure out the position of a upper case letter in letter table") {
      WordUtils.position('C') should equal(3)
      WordUtils.position('O') should equal(15)
      WordUtils.position('L') should equal(12)
      WordUtils.position('I') should equal(9)
      WordUtils.position('N') should equal(14)
    }
  }
}

package utils

import org.scalatest.{ShouldMatchers, FunSpec}
import utils.WordUtils.{position, beHead, longestRecurringCycle, continuousCount}

class WordUtils$Test extends FunSpec with ShouldMatchers {
  describe("WordUtils") {
    it("should able to figure out the position of a lower case letter in letter table") {
      position('c') should equal(3)
      position('o') should equal(15)
      position('l') should equal(12)
      position('i') should equal(9)
      position('n') should equal(14)
    }

    it("should able to figure out the position of a upper case letter in letter table") {
      position('C') should equal(3)
      position('O') should equal(15)
      position('L') should equal(12)
      position('I') should equal(9)
      position('N') should equal(14)
    }

    it("should able to generate a sequence heads with a letter and tails with a ordered sequence") {
      beHead("abcde") should equal(List("abcde", "bacde", "cabde", "dabce", "eabcd"))
    }

    it("should able to find out the continuous occurrence count of a sub string in a string") {
      continuousCount("666666666666666", "6") should equal(15) // repeating single letter
      continuousCount("16126126126126129", "612") should equal(5) // with both prefix and suffix
      continuousCount("1612612612612612", "612") should equal(5) // with only prefix
      continuousCount("6126126126126129", "612") should equal(5) // with only suffix
      continuousCount("612612612612612", "612") should equal(5) // without prefix and suffix
      continuousCount("16126126126126129", "4") should equal(0)
    }

    it("should able to find the longest recurring cycle in a string") {
      longestRecurringCycle("66666666666666666666666666666666") should equal("6", 32)
      longestRecurringCycle("166666666666666666666666666666666") should equal("6", 32)
      longestRecurringCycle("333333333333333333333333333333333") should equal("3", 33)
      longestRecurringCycle("142857142857142857142857142857142857142857") should equal("142857", 7)
      longestRecurringCycle("142857142857142857142857142857142857142857142") should equal("142857", 7)
      longestRecurringCycle("14142857142857142857142857142857142857142857142") should equal("142857", 7)
    }

  }
}

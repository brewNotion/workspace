package HackerRank.java.strings

import java.util.Scanner

object JavaSubstringComparison {

  def getSmallestAndLargest(s: String, k: Int): String = {
    var smallest = s.substring(0, k)
    var largest = s.substring(0, k)
    // Complete the function
    // 'smallest' must be the lexicographically smallest substring of length 'k'
    // 'largest' must be the lexicographically largest substring of length 'k'

    smallest + "\n" + largest
  }

  def main(args: Array[String]): Unit = {
    val scan = new Scanner(System.in)
    val s = scan.next
    val k = scan.nextInt
    scan.close
    System.out.println(getSmallestAndLargest(s, k))
  }
}

package codechef.CCDSAP.array

import scala.io.StdIn._
// https://www.codechef.com/problems/LECANDY
object LECANDY {
  def main(args: Array[String]) {
    var T = readInt()
    while (T > 0) {
      var line1 = readLine().split(" ").map(_.toInt)
      val l = readLine().split(" ").map(_.toInt).sum
      println((if (line1(1) >= l) "Yes" else "No"))
      T -= 1
    }
  }
}

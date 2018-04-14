package HackerEarth.sample

import scala.io.StdIn._
import scala.util.control.Breaks._

object HelloWorld {
  def main(args: Array[String]) {

    var T = readLine().toInt

    while (T>0) {

      var N = readLine().toInt
      val l = readLine().split(" ").map(_.toInt)
      var count = 0
      var i = 0
      var isValid = true
      breakable {
        while (i < N) {
          var g = l(i)
          for (_ <- 1 to g) {
            if (i>=N || l(i) != g) {
              isValid = false
              break
            }
            i += 1
          }
          count += 1
        }
      }
      println(if (isValid) count else "Invalid Data")

      T -= 1
    }
  }
}



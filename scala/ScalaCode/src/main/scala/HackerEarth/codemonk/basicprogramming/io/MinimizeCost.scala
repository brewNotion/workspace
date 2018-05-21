package HackerEarth.codemonk.basicprogramming.io

import scala.io.StdIn._
import scala.util.control.Breaks._

object MinimizeCost {
  def main(args: Array[String]): Unit = {
    val line = readLine.split(" ").map(_.toInt)
    val (n, k) = (line(0), line(1))
    val oa = readLine.split(" ").map(_.toInt)
    var sum = 0
    for (i <- oa.indices) {
      if (oa(i) > 0) {
        breakable {
          for (j <- (i - k) to (i + k) if j >= 0 && j < n && j != i) {
            if (oa(i) <= 0) break
            if (oa(j) < 0) {
              if (Math.abs(oa(j)) >= oa(i)) {
                oa(j) += oa(i)
                oa(i) = 0
              } else {
                oa(i) += oa(j)
                oa(j) = 0
              }
            }
          }
        }
      }
      sum += Math.abs(oa(i))
    }
    println(sum)
  }
}

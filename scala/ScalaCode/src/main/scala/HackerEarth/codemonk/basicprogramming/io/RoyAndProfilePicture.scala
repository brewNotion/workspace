package HackerEarth.codemonk.basicprogramming.io

import scala.io.StdIn._

//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/roy-and-profile-picture/description/
object RoyAndProfilePicture {
  def main(args: Array[String]) {
    val L: Int = readInt();
    var N: Int = readInt();

    while (N > 0) {
      val line = readLine().split(" ").map(_.toInt)
      val (w, h) = (line(0), line(1))
      if (h < L || w < L)
        println("UPLOAD ANOTHER")
      else if (h == w)
        println("ACCEPTED")
      else
        println("CROP IT")
      N -= 1
    }
  }
}

package HackerEarth.sample

object ThoughtWorksQ2 {

  import scala.util.control.Breaks._
  import scala.io.StdIn._

  def main(args: Array[String]) {

    var T = readLine().toInt

    while (T > 0) {
      val line1 = readLine().split(" ").map(_.toInt)
      val N = line1(0)
      val S = line1(1)
      val l = readLine().split(" ").map(_.toInt).sorted
      breakable {
        var k = N
        while(k>1) {
          var i = 0
          while (i + k <= N) {
            val d = (l(i + k - 1) - l(i)) * k
            if (d <= S) {
              println(k + " " + d)
              break
            }
            i += 1
          }
          k -= 1
        }
      }
      T -= 1
    }
  }

}

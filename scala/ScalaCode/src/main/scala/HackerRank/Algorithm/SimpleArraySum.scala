package HackerRank.Algorithm.easy

object SimpleArraySum {

  def simpleArraySum(n: Int, ar: Array[Int]): Int =  {
    // Complete this function
    ar.sum
  }

  def main(args: Array[String]) {
    import scala.io.StdIn._
    val result = simpleArraySum(readLine().map(_.toInt).head, readLine().split(" ").map(_.toInt));
    println(result)
  }

}


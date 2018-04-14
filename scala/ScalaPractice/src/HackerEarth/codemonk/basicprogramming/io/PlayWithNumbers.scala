package HackerEarth.codemonk.basicprogramming.io

//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/play-with-numbers-2/
import scala.io.StdIn._
object PlayWithNumbers {

  def main(args:Array[String]): Unit = {
    var line = readLine().split(" ").map(_.toInt)
    var (n,q) = (line(0),line(1))
    var sum = 0l
    val nums:Array[Long] = Array(0l) ++ readLine().split(" ").map(n => {
      sum = sum + n.toInt
      sum
    })
    while(q >0){
      val lr = readLine().split(" ").map(_.toInt)
      val (l,r) = (lr(0),lr(1))
      println(Math.floor((nums(r) - nums(l-1))/(r-l+1)).toLong)
      q-=1
    }
  }
}

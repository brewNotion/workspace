package HackerEarth.codemonk.basicprogramming.io

//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/magical-word/description/
import scala.io.StdIn._
object MagicalWord {

  def main(args:Array[String]): Unit = {
    var T = readLine().toInt
    val lookUp = Array('C','C','C','C','C','G','G','G','I','I','I','I','O','O','O','O','O','S','S','S','S','S','Y','Y','Y','Y','Y','Y','Y','a','a','a','a','a','a','e','e','e','g','g','g','k','k','k','m','m','m','q','q','q','q','q','q','q','q','q','q','q')
    while(T>0){
      readLine()
      println(readLine().map(c => if(c<'A')'C' else lookUp(c-'A')))
      T-=1
    }
  }
}

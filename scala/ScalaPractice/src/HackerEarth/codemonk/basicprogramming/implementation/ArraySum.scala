package HackerEarth.codemonk.basicprogramming.implementation

import scala.io.StdIn._
object ArraySum extends App{
  readLine()
  println(readLine().split(" ").map(BigInt(_)).sum)
}

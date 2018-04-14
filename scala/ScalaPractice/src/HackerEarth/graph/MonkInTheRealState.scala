package HackerEarth.graph

import scala.io.StdIn._

object MonkInTheRealState {
  def main(args: Array[String]) {

    var T: Int = readInt();

    while (T > 0) {
      T = T - 1
      var E: Int = readInt()
      var S = scala.collection.mutable.Set[String]()
      while (E > 0) {
        E = E - 1
        val edges: Array[String] = readLine().split(" ")
        S += edges(0)
        S += edges(1)
      }
      println(S.size)
    }
  }
}

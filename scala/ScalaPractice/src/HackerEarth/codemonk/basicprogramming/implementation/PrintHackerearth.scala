package HackerEarth.codemonk.basicprogramming.implementation

import scala.io.StdIn._

object PrintHackerearth extends App {

  while (true) {
    readLine(); //skip length
    val mu = scala.collection.mutable.Map[Char, Int]('h' -> 0, 'a' -> 0, 'e' -> 0, 'r' -> 0, 't' -> 0, 'c' -> 0, 'k' -> 0)

    readLine().foreach(c => {
      if (mu.contains(c))
        mu.put(c, mu(c) + 1)
    })

    def minVal(c: Char*): Int = {
      var minCount = Int.MaxValue
      for (ch <- c) {
        if (mu(ch) < minCount)
          minCount = mu(ch)
      }
      minCount
    }

    val ckt = minVal('c', 'k', 't')
    val haer = minVal('h', 'a', 'e', 'r')
    if (2 * ckt <= haer)
      println(ckt)
    else if (ckt <= haer)
      println(haer / 2)
    else
      println(0)
  }
}

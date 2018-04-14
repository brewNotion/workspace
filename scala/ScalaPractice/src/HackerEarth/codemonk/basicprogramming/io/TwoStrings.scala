package HackerEarth.codemonk.basicprogramming.io

//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/two-strings-4/
import scala.io.StdIn._

object TwoStrings extends App {

  var T: Int = readInt();

  while (T > 0) {
    val strs = readLine.split(" ").toList
    var mp = scala.collection.mutable.Map[Char, Int]()
    for (i <- 0 until strs(0).length()) {
      var c = strs(0)(i)
      mp.put(c,
        if (mp.contains(c))
          mp(c) + 1
        else 1
      )
      if (mp(c) == 0) mp.remove(c)
      c = strs(1)(i)
      mp.put(c,
        if (mp.contains(c))
          mp(c) - 1
        else -1
      )
      if (mp(c) == 0) mp.remove(c)
    }
    println(if (mp.size == 0) "YES" else "NO")
    T -= 1
  }
}

package LeetCode.easy

import com.sun.xml.internal.bind.v2.TODO

// Problem 290.Word Pattern,  LeetCode
object WordPattern extends App{

  def wordPattern(pattern: String, str: String): Boolean = {

    val wl = str.split(" ") //wordList
println(wl.mkString("-"))
    println(pattern)
    if (pattern.length != wl.length) false
    else {
      val mp = scala.collection.mutable.Map[Char, String]()

      for (i <- 0 until pattern.length) {

        mp.get(pattern(i)) match {

          case None => mp.put(pattern(i), wl(i))
          case s if !s.equals(wl(i)) => return false
        }
      }
      true
    }
  }
  println(wordPattern("abba", "dog cat cat dog"))
}

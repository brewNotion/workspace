package HackerEarth.codemonk.basicprogramming.io

/*https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/modify-the-string*/
import scala.io.StdIn._
object ToggleString extends App{
  while(true) {
    println(readLine().
      map(c => (if (c < 'a' - 1) (c + 32) else (c - 32)).
      toChar).
      mkString("")
    )
  }
}
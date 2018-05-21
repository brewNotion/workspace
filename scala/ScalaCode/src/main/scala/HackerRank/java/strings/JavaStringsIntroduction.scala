package HackerRank.java.strings

object JavaStringsIntroduction extends App {

  import scala.io.StdIn._
  val A = readLine()
  val B = readLine()

  println(A.length + B.length)
  println((if(A.compare(B)>1)"Yes" else "No"))
  println(s"${A.capitalize} ${B.capitalize}")
  val start = 2
  val end = 5
  println("abcdefghijklJavaSubstringComparison".slice(start,end));

}

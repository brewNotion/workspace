package spoj

// http://www.spoj.com/problems/JNEXT/
object JNext extends App {

  import scala.io.StdIn._

  var T = readLine.toInt

  while (T > 0) {

    val d = readLine.toInt

    var l = readLine.split(" ").map(_.toInt).toVector
    var i = d - 1;
    while(i>0 && l(i-1)>l(i)) {
      i -= 1
    }
    if(i<=0)
      println(-1)
    else {
      l = l.take(i-1) ++ Vector(l(i)) ++ (Vector(l(i-1)) ++ l.takeRight(d - i - 1)).sorted
      println(l.mkString(""))
    }
    T -= 1
  }
}


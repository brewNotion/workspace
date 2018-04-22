package HackerEarth.codemonk.basicprogramming.implementation

import scala.io.StdIn._
object ArrayInsert extends App {

  var l = readLine.split(" ").map(_.toInt)
  var (n,nq) = (l(0), l(1))
  var arr = readLine.split(" ").map(_.toInt)
  while(nq>0){
    val q = readLine().split(" ").map(_.toInt)
    q(0) match {
      case 1 => arr(q(1)) = q(2)
      case 2 => {
        var sum = 0;
        for(i<- q(1) to q(2)){
          sum += arr(i)
        }
        println(sum)
      }
    }
    nq-=1
  }
}

package HackerEarth.datastructures.stack
import scala.io.StdIn._
object ArrayFormation {
  def main(args: Array[String]): Unit = {
    val N = readLine.toInt
    val arr = readLine.split(" ").map(_.toInt)

    val MAX_RANGE = 1000001
    val lookup = (0 to MAX_RANGE).toArray
    lookup(0) = -1
    lookup(1) = -1

    for(i <- 2 to MAX_RANGE){
      if(lookup(i) != -1){
        for(j <- 2*i to MAX_RANGE by i)
          lookup(j) = -1
      }
    }

    var s = List[Int]()
    var q = List[Int]()
    for(i <- N-1 to 0 by -1){
      if(lookup(arr(i)) == -1){
        s = arr(i) :: s
      }else {
        q = arr(i) :: q
      }
    }


    println(q.mkString(" "))
    println(s.reverse.mkString(" "))
  }
}

